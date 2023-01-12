package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a traffic incident and flow data to the map.
  * @requires The Microsoft.Maps.Traffic module.
  */
object Traffic {
  
  trait ITrafficOptions extends StObject {
    
    /** Displays the traffic flow layer. */
    var flowVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Displays all traffic incidents. */
    var incidentsVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Displays the traffic legend. */
    var legendVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the opacity of the traffic flow tile layer. Must be a number between 0 and 1. The default is 1 unless the map
      * mode is set to lite, in which case the default is set to 0.7.
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object ITrafficOptions {
    
    inline def apply(): ITrafficOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITrafficOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITrafficOptions] (val x: Self) extends AnyVal {
      
      inline def setFlowVisible(value: Boolean): Self = StObject.set(x, "flowVisible", value.asInstanceOf[js.Any])
      
      inline def setFlowVisibleUndefined: Self = StObject.set(x, "flowVisible", js.undefined)
      
      inline def setIncidentsVisible(value: Boolean): Self = StObject.set(x, "incidentsVisible", value.asInstanceOf[js.Any])
      
      inline def setIncidentsVisibleUndefined: Self = StObject.set(x, "incidentsVisible", js.undefined)
      
      inline def setLegendVisible(value: Boolean): Self = StObject.set(x, "legendVisible", value.asInstanceOf[js.Any])
      
      inline def setLegendVisibleUndefined: Self = StObject.set(x, "legendVisible", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait TrafficManager extends StObject {
    
    /** Hides all traffic data. */
    def hide(): Unit
    
    /** Hides the traffic flow layer. */
    def hideFlow(): Unit
    
    /** Hides all traffic incidents. */
    def hideIncidents(): Unit
    
    /** Hides the traffic legend. */
    def hideLegend(): Unit
    
    /**
      * Sets the options for the traffic manager.
      * @param options The options for the traffic manager.
      */
    def setOptions(options: ITrafficOptions): Unit
    
    /** Displays all traffic data. */
    def show(): Unit
    
    /** Displays the traffic flow layer. */
    def showFlow(): Unit
    
    /** Displays all traffic incidents. */
    def showIncidents(): Unit
    
    /** Displays the traffic legend. */
    def showLegend(): Unit
  }
  object TrafficManager {
    
    inline def apply(
      hide: () => Unit,
      hideFlow: () => Unit,
      hideIncidents: () => Unit,
      hideLegend: () => Unit,
      setOptions: ITrafficOptions => Unit,
      show: () => Unit,
      showFlow: () => Unit,
      showIncidents: () => Unit,
      showLegend: () => Unit
    ): TrafficManager = {
      val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), hideFlow = js.Any.fromFunction0(hideFlow), hideIncidents = js.Any.fromFunction0(hideIncidents), hideLegend = js.Any.fromFunction0(hideLegend), setOptions = js.Any.fromFunction1(setOptions), show = js.Any.fromFunction0(show), showFlow = js.Any.fromFunction0(showFlow), showIncidents = js.Any.fromFunction0(showIncidents), showLegend = js.Any.fromFunction0(showLegend))
      __obj.asInstanceOf[TrafficManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrafficManager] (val x: Self) extends AnyVal {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setHideFlow(value: () => Unit): Self = StObject.set(x, "hideFlow", js.Any.fromFunction0(value))
      
      inline def setHideIncidents(value: () => Unit): Self = StObject.set(x, "hideIncidents", js.Any.fromFunction0(value))
      
      inline def setHideLegend(value: () => Unit): Self = StObject.set(x, "hideLegend", js.Any.fromFunction0(value))
      
      inline def setSetOptions(value: ITrafficOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setShowFlow(value: () => Unit): Self = StObject.set(x, "showFlow", js.Any.fromFunction0(value))
      
      inline def setShowIncidents(value: () => Unit): Self = StObject.set(x, "showIncidents", js.Any.fromFunction0(value))
      
      inline def setShowLegend(value: () => Unit): Self = StObject.set(x, "showLegend", js.Any.fromFunction0(value))
    }
  }
}
