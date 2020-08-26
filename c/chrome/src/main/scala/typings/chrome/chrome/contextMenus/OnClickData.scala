package typings.chrome.chrome.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnClickData extends js.Object {
  /**
    * Optional.
    * Since Chrome 35.
    * A flag indicating the state of a checkbox or radio item after it is clicked.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Since Chrome 35.
    * A flag indicating whether the element is editable (text input, textarea, etc.).
    */
  var editable: Boolean = js.native
  /**
    * Optional.
    * Since Chrome 35.
    * The ID of the frame of the element where the context menu was
    * clicked, if it was in a frame.
    */
  var frameId: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * Since Chrome 35.
    * The URL of the frame of the element where the context menu was clicked, if it was in a frame.
    */
  var frameUrl: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Since Chrome 35.
    * If the element is a link, the URL it points to.
    */
  var linkUrl: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Since Chrome 35.
    * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
    */
  var mediaType: js.UndefOr[String] = js.native
  /**
    * Since Chrome 35.
    * The ID of the menu item that was clicked.
    */
  var menuItemId: js.Any = js.native
  /**
    * Since Chrome 35.
    * The URL of the page where the menu item was clicked. This property is not set if the click occured in a context where there is no current page, such as in a launcher context menu.
    */
  var pageUrl: String = js.native
  /**
    * Optional.
    * Since Chrome 35.
    * The parent ID, if any, for the item clicked.
    */
  var parentMenuItemId: js.UndefOr[js.Any] = js.native
  /**
    * Optional.
    * Since Chrome 35.
    * The text for the context selection, if any.
    */
  var selectionText: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Since Chrome 35.
    * Will be present for elements with a 'src' URL.
    */
  var srcUrl: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Since Chrome 35.
    * A flag indicating the state of a checkbox or radio item before it was clicked.
    */
  var wasChecked: js.UndefOr[Boolean] = js.native
}

object OnClickData {
  @scala.inline
  def apply(editable: Boolean, menuItemId: js.Any, pageUrl: String): OnClickData = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
  @scala.inline
  implicit class OnClickDataOps[Self <: OnClickData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItemId(value: js.Any): Self = this.set("menuItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageUrl(value: String): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    @scala.inline
    def setFrameUrl(value: String): Self = this.set("frameUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameUrl: Self = this.set("frameUrl", js.undefined)
    @scala.inline
    def setLinkUrl(value: String): Self = this.set("linkUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkUrl: Self = this.set("linkUrl", js.undefined)
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setParentMenuItemId(value: js.Any): Self = this.set("parentMenuItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentMenuItemId: Self = this.set("parentMenuItemId", js.undefined)
    @scala.inline
    def setSelectionText(value: String): Self = this.set("selectionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionText: Self = this.set("selectionText", js.undefined)
    @scala.inline
    def setSrcUrl(value: String): Self = this.set("srcUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcUrl: Self = this.set("srcUrl", js.undefined)
    @scala.inline
    def setWasChecked(value: Boolean): Self = this.set("wasChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWasChecked: Self = this.set("wasChecked", js.undefined)
  }
  
}

