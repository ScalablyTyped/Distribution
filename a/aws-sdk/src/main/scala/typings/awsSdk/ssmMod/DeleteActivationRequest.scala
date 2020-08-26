package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteActivationRequest extends js.Object {
  /**
    * The ID of the activation that you want to delete.
    */
  var ActivationId: typings.awsSdk.ssmMod.ActivationId = js.native
}

object DeleteActivationRequest {
  @scala.inline
  def apply(ActivationId: ActivationId): DeleteActivationRequest = {
    val __obj = js.Dynamic.literal(ActivationId = ActivationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActivationRequest]
  }
  @scala.inline
  implicit class DeleteActivationRequestOps[Self <: DeleteActivationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivationId(value: ActivationId): Self = this.set("ActivationId", value.asInstanceOf[js.Any])
  }
  
}

