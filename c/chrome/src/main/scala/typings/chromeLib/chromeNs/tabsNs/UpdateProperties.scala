package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateProperties extends js.Object {
  /**
           * Optional. Whether the tab should be active. Does not affect whether the window is focused (see windows.update).
           * @since Chrome 16.
           */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional. Whether the tab should be discarded automatically by the browser when resources are low.
           * @since Chrome 54.
           */
  var autoDiscardable: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional. Adds or removes the tab from the current selection.
           * @since Chrome 16.
           */
  var highlighted: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional. Whether the tab should be muted.
           * @since Chrome 45.
           */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional. The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
           * @since Chrome 18.
           */
  var openerTabId: js.UndefOr[scala.Double] = js.undefined
  /**
           * Optional. Whether the tab should be pinned.
           * @since Chrome 9.
           */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional. Whether the tab should be selected.
           * @deprecated since Chrome 33. Please use highlighted.
           */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. A URL to navigate the tab to. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

