package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteActionTargetResponse extends js.Object {
  
  /**
    * The ARN of the custom action target that was deleted.
    */
  var ActionTargetArn: NonEmptyString = js.native
}
object DeleteActionTargetResponse {
  
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): DeleteActionTargetResponse = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActionTargetResponse]
  }
  
  @scala.inline
  implicit class DeleteActionTargetResponseOps[Self <: DeleteActionTargetResponse] (val x: Self) extends AnyVal {
    
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
