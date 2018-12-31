package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  /** Optional. Whether the tabs are active in their windows. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tabs are audible.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * Whether the tabs can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tabs are in the current window.
    * @since Chrome 19.
    */
  var currentWindow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * Whether the tabs are discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Whether the tabs are highlighted. */
  var highlighted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. The position of the tabs within their windows.
    * @since Chrome 18.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional. Whether the tabs are in the last focused window.
    * @since Chrome 19.
    */
  var lastFocusedWindow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tabs are muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Whether the tabs are pinned. */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tabs have completed loading.
    * One of: "loading", or "complete"
    */
  var status: js.UndefOr[chromeLib.chromeLibStrings.loading | chromeLib.chromeLibStrings.complete] = js.undefined
  /** Optional. Match page titles against a pattern. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Optional. The ID of the parent window, or windows.WINDOW_ID_CURRENT for the current window. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional. The type of window the tabs are in.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var windowType: js.UndefOr[
    chromeLib.chromeLibStrings.normal | chromeLib.chromeLibStrings.popup | chromeLib.chromeLibStrings.panel | chromeLib.chromeLibStrings.app | chromeLib.chromeLibStrings.devtools
  ] = js.undefined
}

