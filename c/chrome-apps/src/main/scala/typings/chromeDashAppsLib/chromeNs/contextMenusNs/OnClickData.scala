package typings
package chromeDashAppsLib.chromeNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickData extends js.Object {
  /**
    * A flag indicating the state of a checkbox or radio item after it is clicked.
    * @since Chrome 35.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A flag indicating whether the element is editable (text input, textarea, etc.).
    * @since Chrome 35.
    */
  var editable: scala.Boolean
  /**
    * The ID of the frame of the element where the context menu was clicked,
    * if it was in a frame.
    * @since Chrome 35.
    */
  var frameId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * The URL of the frame of the element where the context menu was clicked,
    * if it was in a frame.
    * @since Chrome 35.
    */
  var frameUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the element is a link, the URL it points to.
    * @since Chrome 35.
    */
  var linkUrl: js.UndefOr[java.lang.String] = js.undefined
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
  var menuItemId: chromeDashAppsLib.chromeNs.integer | java.lang.String
  /**
    * The URL of the page where the menu item was clicked.
    * This property is not set if the click occured in a
    * context where there is no current page, such as in
    * a launcher context menu.
    * @since Chrome 35.
    */
  var pageUrl: java.lang.String
  /**
    * The parent ID, if any, for the item clicked.
    * @since Chrome 35.
    */
  var parentMenuItemId: js.UndefOr[chromeDashAppsLib.chromeNs.integer | java.lang.String] = js.undefined
  /**
    * The text for the context selection, if any.
    * @since Chrome 35.
    */
  var selectionText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Will be present for elements with a 'src' URL.
    * @since Chrome 35.
    */
  var srcUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A flag indicating the state of a checkbox or radio item before it was clicked.
    * @since Chrome 35.
    */
  var wasChecked: js.UndefOr[scala.Boolean] = js.undefined
}

