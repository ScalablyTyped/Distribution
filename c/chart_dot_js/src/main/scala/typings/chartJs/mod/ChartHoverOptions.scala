package typings.chartJs.mod

import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.xy
import typings.chartJs.chartJsStrings.y
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartHoverOptions extends StObject {
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var axis: js.UndefOr[x | y | xy] = js.native
  
  var intersect: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[InteractionMode] = js.native
  
  var onHover: js.UndefOr[
    js.ThisFunction2[
      /* this */ typings.chartJs.mod.Chart, 
      /* event */ MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ]
  ] = js.native
}
object ChartHoverOptions {
  
  @scala.inline
  def apply(): ChartHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartHoverOptions]
  }
  
  @scala.inline
  implicit class ChartHoverOptionsMutableBuilder[Self <: ChartHoverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAxis(value: typings.chartJs.chartJsStrings.x | y | xy): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setIntersect(value: Boolean): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectUndefined: Self = StObject.set(x, "intersect", js.undefined)
    
    @scala.inline
    def setMode(value: InteractionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnHover(
      value: js.ThisFunction2[
          /* this */ typings.chartJs.mod.Chart, 
          /* event */ MouseEvent, 
          /* activeElements */ js.Array[js.Object], 
          _
        ]
    ): Self = StObject.set(x, "onHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
  }
}
