package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MutedInfo extends js.Object {
  /**
           * Optional.
           * The ID of the extension that changed the muted state. Not set if an extension was not the reason the muted state last changed.
           */
  var extensionId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the tab is prevented from playing sound (but hasn't necessarily recently produced sound). Equivalent to whether the muted audio indicator is showing. */
  var muted: scala.Boolean
  /**
           * Optional.
           * The reason the tab was muted or unmuted. Not set if the tab's mute state has never been changed.
           * "user": A user input action has set/overridden the muted state.
           * "capture": Tab capture started, forcing a muted state change.
           * "extension": An extension, identified by the extensionId field, set the muted state.
           */
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

