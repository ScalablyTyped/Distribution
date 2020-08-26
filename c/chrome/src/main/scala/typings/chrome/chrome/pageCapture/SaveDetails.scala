package typings.chrome.chrome.pageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveDetails extends js.Object {
  /** The id of the tab to save as MHTML. */
  var tabId: Double = js.native
}

object SaveDetails {
  @scala.inline
  def apply(tabId: Double): SaveDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveDetails]
  }
  @scala.inline
  implicit class SaveDetailsOps[Self <: SaveDetails] (val x: Self) extends AnyVal {
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
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
  }
  
}

