package typings
package chromeLib.chromeNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickData extends js.Object {
  /**
    * Optional.
    * Since Chrome 35.
    * A flag indicating the state of a checkbox or radio item after it is clicked.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Since Chrome 35.
    * A flag indicating whether the element is editable (text input, textarea, etc.).
    */
  var editable: scala.Boolean
  /**
    * Optional.
    * Since Chrome 35.
    * The URL of the frame of the element where the context menu was clicked, if it was in a frame.
    */
  var frameUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * Since Chrome 35.
    * If the element is a link, the URL it points to.
    */
  var linkUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * Since Chrome 35.
    * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
    */
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Since Chrome 35.
    * The ID of the menu item that was clicked.
    */
  var menuItemId: js.Any
  /**
    * Since Chrome 35.
    * The URL of the page where the menu item was clicked. This property is not set if the click occured in a context where there is no current page, such as in a launcher context menu.
    */
  var pageUrl: java.lang.String
  /**
    * Optional.
    * Since Chrome 35.
    * The parent ID, if any, for the item clicked.
    */
  var parentMenuItemId: js.UndefOr[js.Any] = js.undefined
  /**
    * Optional.
    * Since Chrome 35.
    * The text for the context selection, if any.
    */
  var selectionText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * Since Chrome 35.
    * Will be present for elements with a 'src' URL.
    */
  var srcUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * Since Chrome 35.
    * A flag indicating the state of a checkbox or radio item before it was clicked.
    */
  var wasChecked: js.UndefOr[scala.Boolean] = js.undefined
}

