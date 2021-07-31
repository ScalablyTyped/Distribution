package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatMapLayer
  extends StObject
     with IDataLayer {
  
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
  
  @scala.inline
  implicit class HeatMapLayerMutableBuilder[Self <: HeatMapLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLocations(value: js.Array[Location | Pushpin] => Unit): Self = StObject.set(x, "setLocations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: IHeatMapLayerOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
