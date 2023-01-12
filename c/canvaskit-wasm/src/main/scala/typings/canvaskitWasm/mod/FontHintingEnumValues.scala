package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontHintingEnumValues
  extends StObject
     with EmbindEnum {
  
  var Full: FontHinting
  
  var None: FontHinting
  
  var Normal: FontHinting
  
  var Slight: FontHinting
}
object FontHintingEnumValues {
  
  inline def apply(
    Full: FontHinting,
    None: FontHinting,
    Normal: FontHinting,
    Slight: FontHinting,
    values: js.Array[Double]
  ): FontHintingEnumValues = {
    val __obj = js.Dynamic.literal(Full = Full.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], Slight = Slight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontHintingEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontHintingEnumValues] (val x: Self) extends AnyVal {
    
    inline def setFull(value: FontHinting): Self = StObject.set(x, "Full", value.asInstanceOf[js.Any])
    
    inline def setNone(value: FontHinting): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: FontHinting): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    inline def setSlight(value: FontHinting): Self = StObject.set(x, "Slight", value.asInstanceOf[js.Any])
  }
}
