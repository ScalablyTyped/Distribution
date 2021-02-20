package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteActionTargetRequest extends StObject {
  
  /**
    * The ARN of the custom action target to delete.
    */
  var ActionTargetArn: NonEmptyString = js.native
}
object DeleteActionTargetRequest {
  
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): DeleteActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActionTargetRequest]
  }
  
  @scala.inline
  implicit class DeleteActionTargetRequestMutableBuilder[Self <: DeleteActionTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTargetArn(value: NonEmptyString): Self = StObject.set(x, "ActionTargetArn", value.asInstanceOf[js.Any])
  }
}
