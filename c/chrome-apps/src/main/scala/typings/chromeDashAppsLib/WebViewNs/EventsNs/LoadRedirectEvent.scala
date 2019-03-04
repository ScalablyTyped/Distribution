package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a top-level load request has redirected to a different URL.
  */
trait LoadRedirectEvent extends js.Object {
  /** Whether or not the redirect happened at top-level or in a subframe. */
  var isTopLevel: scala.Boolean
  /** The new URL after the redirect. */
  var newUrl: java.lang.String
  /** The requested URL before the redirect. */
  var oldUrl: java.lang.String
}

object LoadRedirectEvent {
  @scala.inline
  def apply(isTopLevel: scala.Boolean, newUrl: java.lang.String, oldUrl: java.lang.String): LoadRedirectEvent = {
    val __obj = js.Dynamic.literal(isTopLevel = isTopLevel, newUrl = newUrl, oldUrl = oldUrl)
  
    __obj.asInstanceOf[LoadRedirectEvent]
  }
}

