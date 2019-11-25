package typings.chromeDashApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a top-level load request has redirected to a different URL.
  */
trait LoadRedirectEvent extends js.Object {
  /** Whether or not the redirect happened at top-level or in a subframe. */
  var isTopLevel: Boolean
  /** The new URL after the redirect. */
  var newUrl: String
  /** The requested URL before the redirect. */
  var oldUrl: String
}

object LoadRedirectEvent {
  @scala.inline
  def apply(isTopLevel: Boolean, newUrl: String, oldUrl: String): LoadRedirectEvent = {
    val __obj = js.Dynamic.literal(isTopLevel = isTopLevel.asInstanceOf[js.Any], newUrl = newUrl.asInstanceOf[js.Any], oldUrl = oldUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoadRedirectEvent]
  }
}

