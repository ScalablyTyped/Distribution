package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlurStyleEnumValues extends EmbindEnum {
  
  var Inner: BlurStyle = js.native
  
  var Normal: BlurStyle = js.native
  
  var Outer: BlurStyle = js.native
  
  var Solid: BlurStyle = js.native
}
object BlurStyleEnumValues {
  
  @scala.inline
  def apply(Inner: BlurStyle, Normal: BlurStyle, Outer: BlurStyle, Solid: BlurStyle, values: js.Array[Double]): BlurStyleEnumValues = {
    val __obj = js.Dynamic.literal(Inner = Inner.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], Outer = Outer.asInstanceOf[js.Any], Solid = Solid.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurStyleEnumValues]
  }
  
  @scala.inline
  implicit class BlurStyleEnumValuesMutableBuilder[Self <: BlurStyleEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInner(value: BlurStyle): Self = StObject.set(x, "Inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: BlurStyle): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuter(value: BlurStyle): Self = StObject.set(x, "Outer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolid(value: BlurStyle): Self = StObject.set(x, "Solid", value.asInstanceOf[js.Any])
  }
}
