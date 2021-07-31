package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyOutput extends StObject {
  
  /**
    *  The ARN of the Project or ReportGroup resource that is associated with a resource policy. 
    */
  var resourceArn: js.UndefOr[NonEmptyString] = js.undefined
}
object PutResourcePolicyOutput {
  
  @scala.inline
  def apply(): PutResourcePolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyOutput]
  }
  
  @scala.inline
  implicit class PutResourcePolicyOutputMutableBuilder[Self <: PutResourcePolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
  }
}
