package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphaTypeEnumValues
  extends StObject
     with EmbindEnum {
  
  var Opaque: AlphaType
  
  var Premul: AlphaType
  
  var Unpremul: AlphaType
}
object AlphaTypeEnumValues {
  
  inline def apply(Opaque: AlphaType, Premul: AlphaType, Unpremul: AlphaType, values: js.Array[Double]): AlphaTypeEnumValues = {
    val __obj = js.Dynamic.literal(Opaque = Opaque.asInstanceOf[js.Any], Premul = Premul.asInstanceOf[js.Any], Unpremul = Unpremul.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaTypeEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlphaTypeEnumValues] (val x: Self) extends AnyVal {
    
    inline def setOpaque(value: AlphaType): Self = StObject.set(x, "Opaque", value.asInstanceOf[js.Any])
    
    inline def setPremul(value: AlphaType): Self = StObject.set(x, "Premul", value.asInstanceOf[js.Any])
    
    inline def setUnpremul(value: AlphaType): Self = StObject.set(x, "Unpremul", value.asInstanceOf[js.Any])
  }
}
