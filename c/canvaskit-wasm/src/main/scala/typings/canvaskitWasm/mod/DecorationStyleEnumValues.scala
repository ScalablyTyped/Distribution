package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecorationStyleEnumValues extends EmbindEnum {
  
  var Dashed: DecorationStyle = js.native
  
  var Dotted: DecorationStyle = js.native
  
  var Double: DecorationStyle = js.native
  
  var Solid: DecorationStyle = js.native
  
  var Wavy: DecorationStyle = js.native
}
object DecorationStyleEnumValues {
  
  @scala.inline
  def apply(
    Dashed: DecorationStyle,
    Dotted: DecorationStyle,
    Double: DecorationStyle,
    Solid: DecorationStyle,
    Wavy: DecorationStyle,
    values: js.Array[Double]
  ): DecorationStyleEnumValues = {
    val __obj = js.Dynamic.literal(Dashed = Dashed.asInstanceOf[js.Any], Dotted = Dotted.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Solid = Solid.asInstanceOf[js.Any], Wavy = Wavy.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationStyleEnumValues]
  }
  
  @scala.inline
  implicit class DecorationStyleEnumValuesOps[Self <: DecorationStyleEnumValues] (val x: Self) extends AnyVal {
    
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
    def setDashed(value: DecorationStyle): Self = this.set("Dashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotted(value: DecorationStyle): Self = this.set("Dotted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDouble(value: DecorationStyle): Self = this.set("Double", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolid(value: DecorationStyle): Self = this.set("Solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWavy(value: DecorationStyle): Self = this.set("Wavy", value.asInstanceOf[js.Any])
  }
}
