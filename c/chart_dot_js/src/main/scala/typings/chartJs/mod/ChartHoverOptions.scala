package typings.chartJs.mod

import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.xy
import typings.chartJs.chartJsStrings.y
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartHoverOptions extends StObject {
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var axis: js.UndefOr[x | y | xy] = js.undefined
  
  var intersect: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[InteractionMode] = js.undefined
  
  var onHover: js.UndefOr[
    js.ThisFunction2[
      /* this */ Chart, 
      /* event */ MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      js.Any
    ]
  ] = js.undefined
}
object ChartHoverOptions {
  
  inline def apply(): ChartHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartHoverOptions]
  }
  
  extension [Self <: ChartHoverOptions](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAxis(value: typings.chartJs.chartJsStrings.x | y | xy): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setIntersect(value: Boolean): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
    
    inline def setIntersectUndefined: Self = StObject.set(x, "intersect", js.undefined)
    
    inline def setMode(value: InteractionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnHover(
      value: js.ThisFunction2[
          /* this */ Chart, 
          /* event */ MouseEvent, 
          /* activeElements */ js.Array[js.Object], 
          js.Any
        ]
    ): Self = StObject.set(x, "onHover", value.asInstanceOf[js.Any])
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
  }
}
