package typings.chartJs.anon

import typings.chartJs.distTypesGeometricMod.CornerRadius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chart.js.chart.js/dist/types/geometric.RoundedRect & {  radius :chart.js.chart.js/dist/types/geometric.TRBLCorners} */
trait RoundedRectradiusTRBLCorn extends StObject {
  
  var h: Double
  
  var radius: js.UndefOr[CornerRadius] = js.undefined
  
  var w: Double
  
  var x: Double
  
  var y: Double
}
object RoundedRectradiusTRBLCorn {
  
  inline def apply(h: Double, w: Double, x: Double, y: Double): RoundedRectradiusTRBLCorn = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRectradiusTRBLCorn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoundedRectradiusTRBLCorn] (val x: Self) extends AnyVal {
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: CornerRadius): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
