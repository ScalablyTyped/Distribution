package typings.bingmaps.Microsoft.Maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map overlay that binds an image to a bounding box area on the map.
  */
trait GroundOverlay extends CustomOverlay {
  /** Optional property to store any additional metadata for this layer. */
  var metadata: js.Any
  /**
    * Gets the background color of the ground overlay.
    * @returns The background color of the ground overlay.
    */
  def getBackgroundColor(): String | Color
  /**
    * Gets the bounding box that the ground overlay is bounded to.
    * @returns The bounding box that the ground overlay is bounded to.
    */
  def getBounds(): LocationRect
  /**
    * Gets the url to the ground overlay image.
    * @returns The url to the ground overlay image.
    */
  def getImageUrl(): String
  /**
    * Gets the opacity of the ground overlay.
    * @returns The opacity of the ground overlay.
    */
  def getOpacity(): Double
  /**
    * Gets the rotation of the ground overlay.
    * @returns The rotation of the ground overlay.
    */
  def getRotation(): Double
  /**
    * Gets a boolean indicating if the ground overlay is visible or not.
    * @returns A boolean indicating if the ground overlay is visible or not.
    */
  def getVisible(): Boolean
  /**
    * Sets the options used to render the ground overlay.
    * @param options The options used to render the ground overlay.
    */
  def setOptions(options: IGroundOverlayOptions): Unit
  /**
    * Sets the visibility of the Ground Overlay.
    * @param value A value indicating if the Ground Overlay should be displayed or not.
    */
  def setVisible(visible: Boolean): Unit
}

object GroundOverlay {
  @scala.inline
  def apply(
    _map: Map,
    getBackgroundColor: () => String | Color,
    getBounds: () => LocationRect,
    getHtmlElement: () => HTMLElement,
    getImageUrl: () => String,
    getMap: () => Map,
    getOpacity: () => Double,
    getRotation: () => Double,
    getVisible: () => Boolean,
    metadata: js.Any,
    onAdd: () => Unit,
    onLoad: () => Unit,
    onRemove: () => Unit,
    setHtmlElement: HTMLElement => Unit,
    setOptions: IGroundOverlayOptions => Unit,
    setVisible: Boolean => Unit
  ): GroundOverlay = {
    val __obj = js.Dynamic.literal(_map = _map.asInstanceOf[js.Any], getBackgroundColor = js.Any.fromFunction0(getBackgroundColor), getBounds = js.Any.fromFunction0(getBounds), getHtmlElement = js.Any.fromFunction0(getHtmlElement), getImageUrl = js.Any.fromFunction0(getImageUrl), getMap = js.Any.fromFunction0(getMap), getOpacity = js.Any.fromFunction0(getOpacity), getRotation = js.Any.fromFunction0(getRotation), getVisible = js.Any.fromFunction0(getVisible), metadata = metadata.asInstanceOf[js.Any], onAdd = js.Any.fromFunction0(onAdd), onLoad = js.Any.fromFunction0(onLoad), onRemove = js.Any.fromFunction0(onRemove), setHtmlElement = js.Any.fromFunction1(setHtmlElement), setOptions = js.Any.fromFunction1(setOptions), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[GroundOverlay]
  }
}

