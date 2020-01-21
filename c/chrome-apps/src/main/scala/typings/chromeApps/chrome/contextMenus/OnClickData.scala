package typings.chromeApps.chrome.contextMenus

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickData extends js.Object {
  /**
    * A flag indicating the state of a checkbox or radio item after it is clicked.
    * @since Chrome 35.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * A flag indicating whether the element is editable (text input, textarea, etc.).
    * @since Chrome 35.
    */
  var editable: Boolean
  /**
    * The ID of the frame of the element where the context menu was clicked,
    * if it was in a frame.
    * @since Chrome 35.
    */
  var frameId: js.UndefOr[integer] = js.undefined
  /**
    * The URL of the frame of the element where the context menu was clicked,
    * if it was in a frame.
    * @since Chrome 35.
    */
  var frameUrl: js.UndefOr[String] = js.undefined
  /**
    * If the element is a link, the URL it points to.
    * @since Chrome 35.
    */
  var linkUrl: js.UndefOr[String] = js.undefined
  /**
    * One of 'image', 'video', or 'audio' if the context menu was
    * activated on one of these types of elements.
    * @since Chrome 35.
    */
  var mediaType: js.UndefOr[MediaType] = js.undefined
  /**
    * The ID of the menu item that was clicked.
    * @since Chrome 35.
    */
  var menuItemId: integer | String
  /**
    * The URL of the page where the menu item was clicked.
    * This property is not set if the click occured in a
    * context where there is no current page, such as in
    * a launcher context menu.
    * @since Chrome 35.
    */
  var pageUrl: String
  /**
    * The parent ID, if any, for the item clicked.
    * @since Chrome 35.
    */
  var parentMenuItemId: js.UndefOr[integer | String] = js.undefined
  /**
    * The text for the context selection, if any.
    * @since Chrome 35.
    */
  var selectionText: js.UndefOr[String] = js.undefined
  /**
    * Will be present for elements with a 'src' URL.
    * @since Chrome 35.
    */
  var srcUrl: js.UndefOr[String] = js.undefined
  /**
    * A flag indicating the state of a checkbox or radio item before it was clicked.
    * @since Chrome 35.
    */
  var wasChecked: js.UndefOr[Boolean] = js.undefined
}

object OnClickData {
  @scala.inline
  def apply(
    editable: Boolean,
    menuItemId: integer | String,
    pageUrl: String,
    checked: js.UndefOr[Boolean] = js.undefined,
    frameId: Int | Double = null,
    frameUrl: String = null,
    linkUrl: String = null,
    mediaType: MediaType = null,
    parentMenuItemId: integer | String = null,
    selectionText: String = null,
    srcUrl: String = null,
    wasChecked: js.UndefOr[Boolean] = js.undefined
  ): OnClickData = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    if (frameUrl != null) __obj.updateDynamic("frameUrl")(frameUrl.asInstanceOf[js.Any])
    if (linkUrl != null) __obj.updateDynamic("linkUrl")(linkUrl.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (parentMenuItemId != null) __obj.updateDynamic("parentMenuItemId")(parentMenuItemId.asInstanceOf[js.Any])
    if (selectionText != null) __obj.updateDynamic("selectionText")(selectionText.asInstanceOf[js.Any])
    if (srcUrl != null) __obj.updateDynamic("srcUrl")(srcUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(wasChecked)) __obj.updateDynamic("wasChecked")(wasChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
}

