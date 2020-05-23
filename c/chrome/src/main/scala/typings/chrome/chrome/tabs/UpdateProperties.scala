package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProperties extends js.Object {
  /**
    * Optional. Whether the tab should be active. Does not affect whether the window is focused (see windows.update).
    * @since Chrome 16.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Whether the tab should be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Adds or removes the tab from the current selection.
    * @since Chrome 16.
    */
  var highlighted: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Whether the tab should be muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  /**
    * Optional. Whether the tab should be pinned.
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Whether the tab should be selected.
    * @deprecated since Chrome 33. Please use highlighted.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** Optional. A URL to navigate the tab to. */
  var url: js.UndefOr[String] = js.undefined
}

object UpdateProperties {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    autoDiscardable: js.UndefOr[Boolean] = js.undefined,
    highlighted: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    openerTabId: js.UndefOr[Double] = js.undefined,
    pinned: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDiscardable)) __obj.updateDynamic("autoDiscardable")(autoDiscardable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlighted)) __obj.updateDynamic("highlighted")(highlighted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openerTabId)) __obj.updateDynamic("openerTabId")(openerTabId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProperties]
  }
}

