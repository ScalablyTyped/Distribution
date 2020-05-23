package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfoboxOptions extends js.Object {
  /**
    * @deprecated Use HTML buttons and links in description instead.
    */
  var actions: js.UndefOr[js.Array[IInfoboxActions]] = js.undefined
  /** The number of milliseconds to wait before closing an infobox when the visible option is changed from true to false. Default: 0 */
  var closeDelayTime: js.UndefOr[Double] = js.undefined
  /** The string displayed inside the infobox. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * TThe HTML that represents the infobox. Note that some infobox options are ignored if custom HTML is set
    * (title, description, maxHeight, maxWidth, actions, showCloseButton, showPoint).
    * Also, if custom HTML is used to represent the infobox, the infobox is anchored at the top-left corner.
    */
  var htmlContent: js.UndefOr[String] = js.undefined
  /** The location on the map where the infobox’s anchor is attached. */
  var location: js.UndefOr[Location] = js.undefined
  /** The maximium size that the infobox height can expand to based on it’s content. Default: 126 **/
  var maxHeight: js.UndefOr[Double] = js.undefined
  /** The maximium size that the infobox width can expand to based on it’s content. Default: 256 **/
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * The amount the infobox pointer is shifted from the location of the infobox, or if showPointer is false, then it is the amount the info box bottom
    * left edge is shifted from the location of the infobox. If custom HTML is set, it is the amount the top-left corner of the infobox is shifted from
    * its location. The default offset value is (0,0), which means there is no offset.
    */
  var offset: js.UndefOr[Point] = js.undefined
  /**
    * A boolean indicating whether to show the close dialog button on the infobox. The default value is true. By default, the close button is displayed
    * as an X in the top right corner of the infobox. This property is ignored if custom HTML is used to represent the infobox.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean indicating whether to display the infobox with a pointer. The default value is true. In this case the infobox is anchored at the bottom
    * point of the pointer. If this property is set to false, the infobox is anchored at the bottom left corner. This property is ignored if custom HTML
    * is used to represent the infobox.
    */
  var showPointer: js.UndefOr[Boolean] = js.undefined
  /** The title of the infobox. */
  var title: js.UndefOr[String] = js.undefined
  /**
    * A boolean indicating whether to show or hide the infobox. The default value is true. A value of false indicates that the infobox is hidden,
    * although it is still an entity on the map.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** The z-index of the infobox with respect to other items on the map. */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IInfoboxOptions {
  @scala.inline
  def apply(
    actions: js.Array[IInfoboxActions] = null,
    closeDelayTime: js.UndefOr[Double] = js.undefined,
    description: String = null,
    htmlContent: String = null,
    location: Location = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    offset: Point = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showPointer: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): IInfoboxOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(closeDelayTime)) __obj.updateDynamic("closeDelayTime")(closeDelayTime.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPointer)) __obj.updateDynamic("showPointer")(showPointer.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoboxOptions]
  }
}

