package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurStyleEnumValues
  extends StObject
     with EmbindEnum {
  
  var Inner: BlurStyle
  
  var Normal: BlurStyle
  
  var Outer: BlurStyle
  
  var Solid: BlurStyle
}
object BlurStyleEnumValues {
  
  inline def apply(Inner: BlurStyle, Normal: BlurStyle, Outer: BlurStyle, Solid: BlurStyle, values: js.Array[Double]): BlurStyleEnumValues = {
    val __obj = js.Dynamic.literal(Inner = Inner.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], Outer = Outer.asInstanceOf[js.Any], Solid = Solid.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurStyleEnumValues]
  }
  
  extension [Self <: BlurStyleEnumValues](x: Self) {
    
    inline def setInner(value: BlurStyle): Self = StObject.set(x, "Inner", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: BlurStyle): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    inline def setOuter(value: BlurStyle): Self = StObject.set(x, "Outer", value.asInstanceOf[js.Any])
    
    inline def setSolid(value: BlurStyle): Self = StObject.set(x, "Solid", value.asInstanceOf[js.Any])
  }
}
