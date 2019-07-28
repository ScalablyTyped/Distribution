package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map overlay that binds an image to a bounding box area on the map.
  */
@JSGlobal("Microsoft.Maps.GroundOverlay")
@js.native
class GroundOverlay protected () extends CustomOverlay {
  /**
    * @constructor
    * @param options The options used to render the ground overlay.
    */
  def this(options: IGroundOverlayOptions) = this()
  /** Optional property to store any additional metadata for this layer. */
  var metadata: js.Any = js.native
  /**
    * Gets the background color of the ground overlay.
    * @returns The background color of the ground overlay.
    */
  def getBackgroundColor(): String | Color = js.native
  /**
    * Gets the bounding box that the ground overlay is bounded to.
    * @returns The bounding box that the ground overlay is bounded to.
    */
  def getBounds(): LocationRect = js.native
  /**
    * Gets the url to the ground overlay image.
    * @returns The url to the ground overlay image.
    */
  def getImageUrl(): String = js.native
  /**
    * Gets the opacity of the ground overlay.
    * @returns The opacity of the ground overlay.
    */
  def getOpacity(): Double = js.native
  /**
    * Gets the rotation of the ground overlay.
    * @returns The rotation of the ground overlay.
    */
  def getRotation(): Double = js.native
  /**
    * Gets a boolean indicating if the ground overlay is visible or not.
    * @returns A boolean indicating if the ground overlay is visible or not.
    */
  def getVisible(): Boolean = js.native
  /**
    * Sets the options used to render the ground overlay.
    * @param options The options used to render the ground overlay.
    */
  def setOptions(options: IGroundOverlayOptions): Unit = js.native
  /**
    * Sets the visibility of the Ground Overlay.
    * @param value A value indicating if the Ground Overlay should be displayed or not.
    */
  def setVisible(visible: Boolean): Unit = js.native
}

