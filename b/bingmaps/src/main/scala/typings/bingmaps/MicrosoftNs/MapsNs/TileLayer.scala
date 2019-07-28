package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.TileLayer")
@js.native
class TileLayer protected () extends ILayer {
  /**
    * @constructor
    * @param options The options to use to define the tile layer.
    */
  def this(options: ITileLayerOptions) = this()
  /** Optional property to store any additional metadata for this layer. */
  var metadata: js.Any = js.native
  /**
    * Gets the opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    * @returns The opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    */
  def getOpacity(): Double = js.native
  /**
    * Gets the tile source of the tile layer.
    * @returns The tile source of the tile layer.
    */
  def getTileSource(): TileSource = js.native
  /**
    * Gets a boolean that indicates if the tile layer is visible or not.
    * @returns A boolean that indicates if the tile layer is visible or not.
    */
  def getVisible(): Boolean = js.native
  /**
    * Gets the zIndex of the tile layer.
    * @returns The zIndex of the tile layer.
    */
  def getZIndex(): Double = js.native
  /**
    * Sets the opacity of the tile layer. Value must be a number between 0 and 1.
    * @param opacity The opacity of the tile layer. Value must be a number between 0 and 1.
    */
  def setOpacity(opacity: Double): Unit = js.native
  /**
    * Sets options for the tile layer.
    * @param options The options for the tile layer.
    */
  def setOptions(options: ITileLayerOptions): Unit = js.native
  /**
    * Sets the visibility of the tile layer.
    * @param show A boolean indicating if the tile layer should be visible or not.
    */
  def setVisible(show: Boolean): Unit = js.native
  /**
    * Sets the zIndex of the tile layer.
    * @param idx The zIndex of the tile layer.
    */
  def setZIndex(idx: Double): Unit = js.native
}

