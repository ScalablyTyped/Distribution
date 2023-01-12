package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrokeCapEnumValues
  extends StObject
     with EmbindEnum {
  
  var Butt: StrokeCap
  
  var Round: StrokeCap
  
  var Square: StrokeCap
}
object StrokeCapEnumValues {
  
  inline def apply(Butt: StrokeCap, Round: StrokeCap, Square: StrokeCap, values: js.Array[Double]): StrokeCapEnumValues = {
    val __obj = js.Dynamic.literal(Butt = Butt.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], Square = Square.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeCapEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrokeCapEnumValues] (val x: Self) extends AnyVal {
    
    inline def setButt(value: StrokeCap): Self = StObject.set(x, "Butt", value.asInstanceOf[js.Any])
    
    inline def setRound(value: StrokeCap): Self = StObject.set(x, "Round", value.asInstanceOf[js.Any])
    
    inline def setSquare(value: StrokeCap): Self = StObject.set(x, "Square", value.asInstanceOf[js.Any])
  }
}
