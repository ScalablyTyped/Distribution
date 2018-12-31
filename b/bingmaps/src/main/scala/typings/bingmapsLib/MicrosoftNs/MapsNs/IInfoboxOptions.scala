package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfoboxOptions extends js.Object {
  /**
    * @deprecated Use HTML buttons and links in description instead.
    */
  var actions: js.UndefOr[js.Array[IInfoboxActions]] = js.undefined
  /** The number of milliseconds to wait before closing an infobox when the visible option is changed from true to false. Default: 0 */
  var closeDelayTime: js.UndefOr[scala.Double] = js.undefined
  /** The string displayed inside the infobox. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * TThe HTML that represents the infobox. Note that some infobox options are ignored if custom HTML is set
    * (title, description, maxHeight, maxWidth, actions, showCloseButton, showPoint).
    * Also, if custom HTML is used to represent the infobox, the infobox is anchored at the top-left corner.
    */
  var htmlContent: js.UndefOr[java.lang.String] = js.undefined
  /** The location on the map where the infobox’s anchor is attached. */
  var location: js.UndefOr[Location] = js.undefined
  /** The maximium size that the infobox height can expand to based on it’s content. Default: 126 **/
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /** The maximium size that the infobox width can expand to based on it’s content. Default: 256 **/
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
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
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean indicating whether to display the infobox with a pointer. The default value is true. In this case the infobox is anchored at the bottom
    * point of the pointer. If this property is set to false, the infobox is anchored at the bottom left corner. This property is ignored if custom HTML
    * is used to represent the infobox.
    */
  var showPointer: js.UndefOr[scala.Boolean] = js.undefined
  /** The title of the infobox. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean indicating whether to show or hide the infobox. The default value is true. A value of false indicates that the infobox is hidden,
    * although it is still an entity on the map.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** The z-index of the infobox with respect to other items on the map. */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

