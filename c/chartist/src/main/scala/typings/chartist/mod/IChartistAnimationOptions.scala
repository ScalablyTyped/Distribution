package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistAnimationOptions extends StObject {
  
  var begin: js.UndefOr[String] = js.undefined
  
  var dur: String | Double
  
  var easing: js.UndefOr[IChartistEasingDefinition | String] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var from: String | Double
  
  var id: js.UndefOr[String] = js.undefined
  
  var to: String | Double
}
object IChartistAnimationOptions {
  
  inline def apply(dur: String | Double, from: String | Double, to: String | Double): IChartistAnimationOptions = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistAnimationOptions]
  }
  
  extension [Self <: IChartistAnimationOptions](x: Self) {
    
    inline def setBegin(value: String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setDur(value: String | Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: IChartistEasingDefinition | String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFrom(value: String | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTo(value: String | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
