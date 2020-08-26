package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditTracksInfoRequest extends js.Object {
  var activeTrackIds: js.Array[Double] = js.native
  var textTrackStyle: TextTrackStyle = js.native
}

object EditTracksInfoRequest {
  @scala.inline
  def apply(activeTrackIds: js.Array[Double], textTrackStyle: TextTrackStyle): EditTracksInfoRequest = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], textTrackStyle = textTrackStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditTracksInfoRequest]
  }
  @scala.inline
  implicit class EditTracksInfoRequestOps[Self <: EditTracksInfoRequest] (val x: Self) extends AnyVal {
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
    def setActiveTrackIdsVarargs(value: Double*): Self = this.set("activeTrackIds", js.Array(value :_*))
    @scala.inline
    def setActiveTrackIds(value: js.Array[Double]): Self = this.set("activeTrackIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextTrackStyle(value: TextTrackStyle): Self = this.set("textTrackStyle", value.asInstanceOf[js.Any])
  }
  
}

