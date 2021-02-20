package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListPolicyAttachmentsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * A list of ObjectIdentifiers to which the policy is attached.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.native
}
object BatchListPolicyAttachmentsResponse {
  
  @scala.inline
  def apply(): BatchListPolicyAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListPolicyAttachmentsResponse]
  }
  
  @scala.inline
  implicit class BatchListPolicyAttachmentsResponseMutableBuilder[Self <: BatchListPolicyAttachmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setObjectIdentifiers(value: ObjectIdentifierList): Self = StObject.set(x, "ObjectIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifiersUndefined: Self = StObject.set(x, "ObjectIdentifiers", js.undefined)
    
    @scala.inline
    def setObjectIdentifiersVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "ObjectIdentifiers", js.Array(value :_*))
  }
}
