package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDirectionEnumValues
  extends StObject
     with EmbindEnum {
  
  var LTR: TextDirection
  
  var RTL: TextDirection
}
object TextDirectionEnumValues {
  
  inline def apply(LTR: TextDirection, RTL: TextDirection, values: js.Array[Double]): TextDirectionEnumValues = {
    val __obj = js.Dynamic.literal(LTR = LTR.asInstanceOf[js.Any], RTL = RTL.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDirectionEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDirectionEnumValues] (val x: Self) extends AnyVal {
    
    inline def setLTR(value: TextDirection): Self = StObject.set(x, "LTR", value.asInstanceOf[js.Any])
    
    inline def setRTL(value: TextDirection): Self = StObject.set(x, "RTL", value.asInstanceOf[js.Any])
  }
}
