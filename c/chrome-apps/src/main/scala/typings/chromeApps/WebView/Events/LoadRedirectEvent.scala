package typings.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a top-level load request has redirected to a different URL.
  */
@js.native
trait LoadRedirectEvent extends js.Object {
  /** Whether or not the redirect happened at top-level or in a subframe. */
  var isTopLevel: Boolean = js.native
  /** The new URL after the redirect. */
  var newUrl: String = js.native
  /** The requested URL before the redirect. */
  var oldUrl: String = js.native
}

object LoadRedirectEvent {
  @scala.inline
  def apply(isTopLevel: Boolean, newUrl: String, oldUrl: String): LoadRedirectEvent = {
    val __obj = js.Dynamic.literal(isTopLevel = isTopLevel.asInstanceOf[js.Any], newUrl = newUrl.asInstanceOf[js.Any], oldUrl = oldUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadRedirectEvent]
  }
  @scala.inline
  implicit class LoadRedirectEventOps[Self <: LoadRedirectEvent] (val x: Self) extends AnyVal {
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
    def setIsTopLevel(value: Boolean): Self = this.set("isTopLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewUrl(value: String): Self = this.set("newUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldUrl(value: String): Self = this.set("oldUrl", value.asInstanceOf[js.Any])
  }
  
}

