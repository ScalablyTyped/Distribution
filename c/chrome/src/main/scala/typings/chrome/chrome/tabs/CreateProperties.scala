package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProperties extends js.Object {
  /**
    * Optional.
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused (see windows.update). Defaults to true.
    * @since Chrome 16.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Optional. The position the tab should take in the window. The provided value will be clamped to between zero and the number of tabs in the window. */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as the newly created tab.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  /**
    * Optional. Whether the tab should be pinned. Defaults to false
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Whether the tab should become the selected tab in the window. Defaults to true
    * @deprecated since Chrome 33. Please use active.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * The URL to navigate the tab to initially. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[String] = js.undefined
  /** Optional. The window to create the new tab in. Defaults to the current window. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object CreateProperties {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    openerTabId: js.UndefOr[Double] = js.undefined,
    pinned: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    windowId: js.UndefOr[Double] = js.undefined
  ): CreateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openerTabId)) __obj.updateDynamic("openerTabId")(openerTabId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProperties]
  }
}

