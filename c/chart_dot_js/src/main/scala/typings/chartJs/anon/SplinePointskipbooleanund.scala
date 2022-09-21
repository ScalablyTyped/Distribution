package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chart.js.chart.js/types/helpers/helpers.curve.SplinePoint & {  skip :boolean | undefined} */
trait SplinePointskipbooleanund extends StObject {
  
  var skip: js.UndefOr[Boolean] = js.undefined
  
  var x: Double
  
  var y: Double
}
object SplinePointskipbooleanund {
  
  inline def apply(x: Double, y: Double): SplinePointskipbooleanund = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplinePointskipbooleanund]
  }
  
  extension [Self <: SplinePointskipbooleanund](x: Self) {
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
