package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicy extends StObject {
  
  /**
    *  The resource policy formatted in JSON. 
    */
  var document: js.UndefOr[PolicyDocument] = js.native
  
  /**
    *  The ARN of the resource associated with the resource policy 
    */
  var resourceArn: js.UndefOr[Arn] = js.native
  
  /**
    *  The current revision of the resource policy. 
    */
  var revision: js.UndefOr[PolicyRevision] = js.native
}
object ResourcePolicy {
  
  @scala.inline
  def apply(): ResourcePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicy]
  }
  
  @scala.inline
  implicit class ResourcePolicyMutableBuilder[Self <: ResourcePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: PolicyDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    @scala.inline
    def setRevision(value: PolicyRevision): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
