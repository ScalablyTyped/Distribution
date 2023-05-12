package typings.chartJs.anon

import typings.chartJs.chartJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Average extends StObject {
  
  /**
    * Average mode places the tooltip at the average position of the elements shown
    */
  def average(items: Any): `false` | X
  
  /**
    * Gets the tooltip position nearest of the item nearest to the event position
    */
  def nearest(items: Any, eventPosition: Any): `false` | XY
}
object Average {
  
  inline def apply(average: Any => `false` | X, nearest: (Any, Any) => `false` | XY): Average = {
    val __obj = js.Dynamic.literal(average = js.Any.fromFunction1(average), nearest = js.Any.fromFunction2(nearest))
    __obj.asInstanceOf[Average]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Average] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: Any => `false` | X): Self = StObject.set(x, "average", js.Any.fromFunction1(value))
    
    inline def setNearest(value: (Any, Any) => `false` | XY): Self = StObject.set(x, "nearest", js.Any.fromFunction2(value))
  }
}
