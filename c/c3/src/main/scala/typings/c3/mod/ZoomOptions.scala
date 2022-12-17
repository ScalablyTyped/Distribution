package typings.c3.mod

import typings.c3.anon.Min
import typings.c3.c3Strings.drag
import typings.c3.c3Strings.scroll
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomOptions extends StObject {
  
  /**
    * Disable the default animation of zoom. This option is useful when you want to get the zoomed domain by `onzoom` or `onzoomend` handlers and override the default animation behavior.
    * @see https://github.com/c3js/c3/pull/2439 for details.
    */
  var disableDefaultBehavior: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable zooming.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Change zoom extent.
    * **Experimental.**
    */
  var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  /**
    * Set the initial minimum and maximum x-axis zoom values.
    */
  var initialRange: js.UndefOr[Domain] = js.undefined
  
  /**
    * Set callback that is called when the chart is zooming. Specified function receives the zoomed domain.
    */
  var onzoom: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.undefined
  
  /**
    * Set callback that is called when zooming ends. Specified function receives the zoomed domain.
    */
  var onzoomend: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.undefined
  
  /**
    * Set callback that is called when zooming starts. Specified function receives the zoom event.
    */
  var onzoomstart: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* event */ Event, Unit]] = js.undefined
  
  var priveleged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable to rescale after zooming. If true set, y domain will be updated according to the zoomed region.
    */
  var rescale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set interaction type for zooming
    */
  var `type`: js.UndefOr[scroll | drag] = js.undefined
  
  var x: js.UndefOr[Min] = js.undefined
}
object ZoomOptions {
  
  inline def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  
  extension [Self <: ZoomOptions](x: Self) {
    
    inline def setDisableDefaultBehavior(value: Boolean): Self = StObject.set(x, "disableDefaultBehavior", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultBehaviorUndefined: Self = StObject.set(x, "disableDefaultBehavior", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExtent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setInitialRange(value: Domain): Self = StObject.set(x, "initialRange", value.asInstanceOf[js.Any])
    
    inline def setInitialRangeUndefined: Self = StObject.set(x, "initialRange", js.undefined)
    
    inline def setOnzoom(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = StObject.set(x, "onzoom", value.asInstanceOf[js.Any])
    
    inline def setOnzoomUndefined: Self = StObject.set(x, "onzoom", js.undefined)
    
    inline def setOnzoomend(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = StObject.set(x, "onzoomend", value.asInstanceOf[js.Any])
    
    inline def setOnzoomendUndefined: Self = StObject.set(x, "onzoomend", js.undefined)
    
    inline def setOnzoomstart(value: js.ThisFunction1[/* this */ ChartAPI, /* event */ Event, Unit]): Self = StObject.set(x, "onzoomstart", value.asInstanceOf[js.Any])
    
    inline def setOnzoomstartUndefined: Self = StObject.set(x, "onzoomstart", js.undefined)
    
    inline def setPriveleged(value: Boolean): Self = StObject.set(x, "priveleged", value.asInstanceOf[js.Any])
    
    inline def setPrivelegedUndefined: Self = StObject.set(x, "priveleged", js.undefined)
    
    inline def setRescale(value: Boolean): Self = StObject.set(x, "rescale", value.asInstanceOf[js.Any])
    
    inline def setRescaleUndefined: Self = StObject.set(x, "rescale", js.undefined)
    
    inline def setType(value: scroll | drag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setX(value: Min): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
