package typings.chartJs.mod

import typings.moment.mod.Moment
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPoint extends StObject {
  
  var r: js.UndefOr[Double] = js.undefined
  
  var t: js.UndefOr[Double | String | Date | Moment] = js.undefined
  
  var x: js.UndefOr[Double | String | Date | Moment] = js.undefined
  
  var y: js.UndefOr[Double | String | Date | Moment] = js.undefined
}
object ChartPoint {
  
  inline def apply(): ChartPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPoint]
  }
  
  extension [Self <: ChartPoint](x: Self) {
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setT(value: Double | String | Date | Moment): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    inline def setX(value: Double | String | Date | Moment): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double | String | Date | Moment): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
