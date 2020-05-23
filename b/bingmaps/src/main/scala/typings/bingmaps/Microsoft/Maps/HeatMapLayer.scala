package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatMapLayer extends IDataLayer {
  /** Disposes the heat map layer. */
  def dispose(): Unit
  /**
    * Gets a boolean indicating if the heat map layer is visible or not.
    * @returns A boolean indicating if the heat map layer is visible or not.
    */
  def getVisible(): Boolean
  /** 
    * @deprecated
    * Hides the heat map layer.
    */
  def hide(): Unit
  /**
    * Specifies the locations to use when generating the heat map.
    * @param locations Set of locations.
    */
  def setLocations(locations: js.Array[Location | Pushpin]): Unit
  /**
    * Sets the options to use with the heat map layer.
    * @param options Set of heat map layer options.
    */
  def setOptions(options: IHeatMapLayerOptions): Unit
  /**
    * Sets the visibility of the heat map layer.
    * @param visible A boolean indicating if the heat map layer is visible or not.
    */
  def setVisible(visible: Boolean): Unit
  /** 
    * @deprecated
    * Shows the heat map layer.
    */
  def show(): Unit
}

object HeatMapLayer {
  @scala.inline
  def apply(
    clear: () => Unit,
    dispose: () => Unit,
    getVisible: () => Boolean,
    hide: () => Unit,
    setLocations: js.Array[Location | Pushpin] => Unit,
    setOptions: IHeatMapLayerOptions => Unit,
    setVisible: Boolean => Unit,
    show: () => Unit
  ): HeatMapLayer = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), getVisible = js.Any.fromFunction0(getVisible), hide = js.Any.fromFunction0(hide), setLocations = js.Any.fromFunction1(setLocations), setOptions = js.Any.fromFunction1(setOptions), setVisible = js.Any.fromFunction1(setVisible), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[HeatMapLayer]
  }
}

