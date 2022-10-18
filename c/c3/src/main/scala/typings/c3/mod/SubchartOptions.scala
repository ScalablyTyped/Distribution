package typings.c3.mod

import typings.c3.anon.HeightNumber
import typings.c3.anon.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubchartOptions extends StObject {
  
  var axis: js.UndefOr[`5`] = js.undefined
  
  /**
    * Set callback for brush event.
    * Specified function receives the current zoomed x domain.
    */
  var onbrush: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.undefined
  
  /**
    * Show sub chart on the bottom of the chart.
    * Defaults to `false`.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[HeightNumber] = js.undefined
}
object SubchartOptions {
  
  inline def apply(): SubchartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubchartOptions]
  }
  
  extension [Self <: SubchartOptions](x: Self) {
    
    inline def setAxis(value: `5`): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setOnbrush(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = StObject.set(x, "onbrush", value.asInstanceOf[js.Any])
    
    inline def setOnbrushUndefined: Self = StObject.set(x, "onbrush", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSize(value: HeightNumber): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
