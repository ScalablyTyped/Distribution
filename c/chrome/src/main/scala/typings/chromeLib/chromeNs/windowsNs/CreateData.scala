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

object CreateData {
  @scala.inline
  def apply(
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    incognito: js.UndefOr[scala.Boolean] = js.undefined,
    left: scala.Int | scala.Double = null,
    state: java.lang.String = null,
    tabId: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    url: java.lang.String | js.Array[java.lang.String] = null,
    width: scala.Int | scala.Double = null
  ): CreateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateData]
  }
}

