package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiverDisplayStatus extends js.Object {
  var appImages: js.Array[Image] = js.native
  var statusText: String = js.native
}

object ReceiverDisplayStatus {
  @scala.inline
  def apply(appImages: js.Array[Image], statusText: String): ReceiverDisplayStatus = {
    val __obj = js.Dynamic.literal(appImages = appImages.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiverDisplayStatus]
  }
  @scala.inline
  implicit class ReceiverDisplayStatusOps[Self <: ReceiverDisplayStatus] (val x: Self) extends AnyVal {
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
    def setAppImagesVarargs(value: Image*): Self = this.set("appImages", js.Array(value :_*))
    @scala.inline
    def setAppImages(value: js.Array[Image]): Self = this.set("appImages", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
  }
  
}

