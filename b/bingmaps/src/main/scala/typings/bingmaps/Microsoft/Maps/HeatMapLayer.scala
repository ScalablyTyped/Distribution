package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.HeatMapLayer")
@js.native
class HeatMapLayer protected () extends IDataLayer {
  /**
    * @constructor
    * @requires The Microsoft.Maps.Heatmap module.
    * @param locations Set of locations to visualize as a heat map.
    * @param options Options for customizing how the heat map is rendered.
    */
  def this(locations: js.Array[Location | Pushpin]) = this()
  def this(locations: js.Array[Location | Pushpin], options: IHeatMapLayerOptions) = this()
  /** Clears all data in the layer. */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /** Disposes the heat map layer. */
  def dispose(): Unit = js.native
  /**
    * Gets a boolean indicating if the heat map layer is visible or not.
    * @returns A boolean indicating if the heat map layer is visible or not.
    */
  def getVisible(): Boolean = js.native
  /** 
    * @deprecated
    * Hides the heat map layer.
    */
  def hide(): Unit = js.native
  /**
    * Specifies the locations to use when generating the heat map.
    * @param locations Set of locations.
    */
  def setLocations(locations: js.Array[Location | Pushpin]): Unit = js.native
  /**
    * Sets the options to use with the heat map layer.
    * @param options Set of heat map layer options.
    */
  def setOptions(options: IHeatMapLayerOptions): Unit = js.native
  /**
    * Sets the visibility of the heat map layer.
    * @param visible A boolean indicating if the heat map layer is visible or not.
    */
  def setVisible(visible: Boolean): Unit = js.native
  /** 
    * @deprecated
    * Shows the heat map layer.
    */
  def show(): Unit = js.native
}

