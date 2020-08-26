package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStatusRequest extends js.Object {
  var customData: js.Object = js.native
}

object GetStatusRequest {
  @scala.inline
  def apply(customData: js.Object): GetStatusRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatusRequest]
  }
  @scala.inline
  implicit class GetStatusRequestOps[Self <: GetStatusRequest] (val x: Self) extends AnyVal {
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
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
  }
  
}

