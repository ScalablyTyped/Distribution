package typings
package chromeLib.chromeNs.windowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateData extends js.Object {
  /**
           * Optional. If true, opens an active window. If false, opens an inactive window.
           * @since Chrome 12.
           */
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional.
           * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
           */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Whether the new window should be an incognito window. */
  var incognito: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional.
           * The number of pixels to position the new window from the left edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
           */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
           * Optional. The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
           * One of: "normal", "minimized", "maximized", "fullscreen", or "docked"
           * @since Chrome 44.
           */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional. The id of the tab for which you want to adopt to the new window.
           * @since Chrome 10.
           */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /**
           * Optional.
           * The number of pixels to position the new window from the top edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
           */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
           * Optional. Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless the '--enable-panels' flag is set.
           * One of: "normal", "popup", "panel", or "detached_panel"
           */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional.
           * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
           */
  var url: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
           * Optional.
           * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
           */
  var width: js.UndefOr[scala.Double] = js.undefined
}

