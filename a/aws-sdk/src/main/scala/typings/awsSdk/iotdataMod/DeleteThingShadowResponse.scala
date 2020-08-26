package typings.awsSdk.iotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteThingShadowResponse extends js.Object {
  /**
    * The state information, in JSON format.
    */
  var payload: JsonDocument = js.native
}

object DeleteThingShadowResponse {
  @scala.inline
  def apply(payload: JsonDocument): DeleteThingShadowResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingShadowResponse]
  }
  @scala.inline
  implicit class DeleteThingShadowResponseOps[Self <: DeleteThingShadowResponse] (val x: Self) extends AnyVal {
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
    def setPayload(value: JsonDocument): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
  
}

