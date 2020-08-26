package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInfoboxOptions extends js.Object {
  /**
    * @deprecated Use HTML buttons and links in description instead.
    */
  var actions: js.UndefOr[js.Array[IInfoboxActions]] = js.native
  /** The number of milliseconds to wait before closing an infobox when the visible option is changed from true to false. Default: 0 */
  var closeDelayTime: js.UndefOr[Double] = js.native
  /** The string displayed inside the infobox. */
  var description: js.UndefOr[String] = js.native
  /**
    * TThe HTML that represents the infobox. Note that some infobox options are ignored if custom HTML is set
    * (title, description, maxHeight, maxWidth, actions, showCloseButton, showPoint).
    * Also, if custom HTML is used to represent the infobox, the infobox is anchored at the top-left corner.
    */
  var htmlContent: js.UndefOr[String] = js.native
  /** The location on the map where the infobox’s anchor is attached. */
  var location: js.UndefOr[Location] = js.native
  /** The maximium size that the infobox height can expand to based on it’s content. Default: 126 **/
  var maxHeight: js.UndefOr[Double] = js.native
  /** The maximium size that the infobox width can expand to based on it’s content. Default: 256 **/
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * The amount the infobox pointer is shifted from the location of the infobox, or if showPointer is false, then it is the amount the info box bottom
    * left edge is shifted from the location of the infobox. If custom HTML is set, it is the amount the top-left corner of the infobox is shifted from
    * its location. The default offset value is (0,0), which means there is no offset.
    */
  var offset: js.UndefOr[Point] = js.native
  /**
    * A boolean indicating whether to show the close dialog button on the infobox. The default value is true. By default, the close button is displayed
    * as an X in the top right corner of the infobox. This property is ignored if custom HTML is used to represent the infobox.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating whether to display the infobox with a pointer. The default value is true. In this case the infobox is anchored at the bottom
    * point of the pointer. If this property is set to false, the infobox is anchored at the bottom left corner. This property is ignored if custom HTML
    * is used to represent the infobox.
    */
  var showPointer: js.UndefOr[Boolean] = js.native
  /** The title of the infobox. */
  var title: js.UndefOr[String] = js.native
  /**
    * A boolean indicating whether to show or hide the infobox. The default value is true. A value of false indicates that the infobox is hidden,
    * although it is still an entity on the map.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** The z-index of the infobox with respect to other items on the map. */
  var zIndex: js.UndefOr[Double] = js.native
}

object IInfoboxOptions {
  @scala.inline
  def apply(): IInfoboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInfoboxOptions]
  }
  @scala.inline
  implicit class IInfoboxOptionsOps[Self <: IInfoboxOptions] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: IInfoboxActions*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[IInfoboxActions]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setCloseDelayTime(value: Double): Self = this.set("closeDelayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseDelayTime: Self = this.set("closeDelayTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHtmlContent(value: String): Self = this.set("htmlContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlContent: Self = this.set("htmlContent", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setOffset(value: Point): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setShowPointer(value: Boolean): Self = this.set("showPointer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPointer: Self = this.set("showPointer", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

