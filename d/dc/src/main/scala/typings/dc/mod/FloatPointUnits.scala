package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatPointUnits extends StObject {
  
  def precision(precision: Double): UnitFunction
}
object FloatPointUnits {
  
  inline def apply(precision: Double => UnitFunction): FloatPointUnits = {
    val __obj = js.Dynamic.literal(precision = js.Any.fromFunction1(precision))
    __obj.asInstanceOf[FloatPointUnits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FloatPointUnits] (val x: Self) extends AnyVal {
    
    inline def setPrecision(value: Double => UnitFunction): Self = StObject.set(x, "precision", js.Any.fromFunction1(value))
  }
}
