package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillTypeEnumValues
  extends StObject
     with EmbindEnum {
  
  var EvenOdd: FillType
  
  var Winding: FillType
}
object FillTypeEnumValues {
  
  inline def apply(EvenOdd: FillType, Winding: FillType, values: js.Array[Double]): FillTypeEnumValues = {
    val __obj = js.Dynamic.literal(EvenOdd = EvenOdd.asInstanceOf[js.Any], Winding = Winding.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillTypeEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillTypeEnumValues] (val x: Self) extends AnyVal {
    
    inline def setEvenOdd(value: FillType): Self = StObject.set(x, "EvenOdd", value.asInstanceOf[js.Any])
    
    inline def setWinding(value: FillType): Self = StObject.set(x, "Winding", value.asInstanceOf[js.Any])
  }
}
