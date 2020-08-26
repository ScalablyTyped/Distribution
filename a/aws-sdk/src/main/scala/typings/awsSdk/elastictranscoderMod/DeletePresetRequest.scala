package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePresetRequest extends js.Object {
  /**
    * The identifier of the preset for which you want to get detailed information.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id = js.native
}

object DeletePresetRequest {
  @scala.inline
  def apply(Id: Id): DeletePresetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePresetRequest]
  }
  @scala.inline
  implicit class DeletePresetRequestOps[Self <: DeletePresetRequest] (val x: Self) extends AnyVal {
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
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}

