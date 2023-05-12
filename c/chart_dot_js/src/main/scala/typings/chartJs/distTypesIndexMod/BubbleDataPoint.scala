package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesGeometricMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleDataPoint
  extends StObject
     with Point {
  
  /**
    * Bubble radius in pixels (not scaled).
    */
  var r: Double
}
object BubbleDataPoint {
  
  inline def apply(r: Double, x: Double, y: Double): BubbleDataPoint = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleDataPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BubbleDataPoint] (val x: Self) extends AnyVal {
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
