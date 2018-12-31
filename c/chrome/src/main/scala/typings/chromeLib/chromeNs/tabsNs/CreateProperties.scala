package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProperties extends js.Object {
  /**
    * Optional.
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused (see windows.update). Defaults to true.
    * @since Chrome 16.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The position the tab should take in the window. The provided value will be clamped to between zero and the number of tabs in the window. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional.
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as the newly created tab.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional. Whether the tab should be pinned. Defaults to false
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tab should become the selected tab in the window. Defaults to true
    * @deprecated since Chrome 33. Please use active.
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * The URL to navigate the tab to initially. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The window to create the new tab in. Defaults to the current window. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

