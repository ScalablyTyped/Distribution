package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteActionTargetRequest extends js.Object {
  
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
  implicit class DeleteActionTargetRequestOps[Self <: DeleteActionTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionTargetArn(value: NonEmptyString): Self = this.set("ActionTargetArn", value.asInstanceOf[js.Any])
  }
}
