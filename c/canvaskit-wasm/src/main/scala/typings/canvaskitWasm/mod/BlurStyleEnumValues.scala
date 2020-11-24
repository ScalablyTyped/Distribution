package typings.canvaskitWasm.mod

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
  implicit class BlurStyleEnumValuesOps[Self <: BlurStyleEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInner(value: BlurStyle): Self = this.set("Inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: BlurStyle): Self = this.set("Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuter(value: BlurStyle): Self = this.set("Outer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolid(value: BlurStyle): Self = this.set("Solid", value.asInstanceOf[js.Any])
  }
}
