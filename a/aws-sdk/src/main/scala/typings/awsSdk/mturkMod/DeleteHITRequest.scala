package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHITRequest extends js.Object {
  /**
    * The ID of the HIT to be deleted.
    */
  var HITId: EntityId = js.native
}

object DeleteHITRequest {
  @scala.inline
  def apply(HITId: EntityId): DeleteHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHITRequest]
  }
  @scala.inline
  implicit class DeleteHITRequestOps[Self <: DeleteHITRequest] (val x: Self) extends AnyVal {
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
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
  }
  
}

