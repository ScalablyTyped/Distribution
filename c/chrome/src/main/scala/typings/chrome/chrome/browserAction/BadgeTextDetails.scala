package typings.chrome.chrome.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeTextDetails extends js.Object {
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[Double] = js.native
  /** Any number of characters can be passed, but only about four can fit in the space. */
  var text: String = js.native
}

object BadgeTextDetails {
  @scala.inline
  def apply(text: String): BadgeTextDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeTextDetails]
  }
  @scala.inline
  implicit class BadgeTextDetailsOps[Self <: BadgeTextDetails] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
  }
  
}

