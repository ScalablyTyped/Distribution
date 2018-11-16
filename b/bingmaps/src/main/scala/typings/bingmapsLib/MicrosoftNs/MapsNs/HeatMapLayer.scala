package typings
package bingmapsLib.MicrosoftNs.MapsNs

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
  /**
           * @constructor
           * @requires The Microsoft.Maps.Heatmap module.
           * @param locations Set of locations to visualize as a heat map.
           * @param options Options for customizing how the heat map is rendered.
           */
  def this(locations: js.Array[Location | Pushpin], options: IHeatMapLayerOptions) = this()
  /** Clears all data in the layer. */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /** Disposes the heat map layer. */
  def dispose(): scala.Unit = js.native
  /**
           * Gets a boolean indicating if the heat map layer is visible or not.
           * @returns A boolean indicating if the heat map layer is visible or not.
           */
  def getVisible(): scala.Boolean = js.native
  /** 
          * @deprecated
          * Hides the heat map layer.
          */
  def hide(): scala.Unit = js.native
  /**
           * Specifies the locations to use when generating the heat map.
           * @param locations Set of locations.
           */
  def setLocations(locations: js.Array[Location | Pushpin]): scala.Unit = js.native
  /**
          * Sets the options to use with the heat map layer.
          * @param options Set of heat map layer options.
          */
  def setOptions(options: IHeatMapLayerOptions): scala.Unit = js.native
  /**
          * Sets the visibility of the heat map layer.
          * @param visible A boolean indicating if the heat map layer is visible or not.
          */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /** 
          * @deprecated
          * Shows the heat map layer.
          */
  def show(): scala.Unit = js.native
}

