package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloatPointUnits extends StObject {
  
  def precision(precision: Double): UnitFunction = js.native
}
object FloatPointUnits {
  
  @scala.inline
  def apply(precision: Double => UnitFunction): FloatPointUnits = {
    val __obj = js.Dynamic.literal(precision = js.Any.fromFunction1(precision))
    __obj.asInstanceOf[FloatPointUnits]
  }
  
  @scala.inline
  implicit class FloatPointUnitsMutableBuilder[Self <: FloatPointUnits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrecision(value: Double => UnitFunction): Self = StObject.set(x, "precision", js.Any.fromFunction1(value))
  }
}
