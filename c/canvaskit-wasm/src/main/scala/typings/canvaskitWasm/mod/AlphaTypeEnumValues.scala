package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlphaTypeEnumValues extends EmbindEnum {
  
  var Opaque: AlphaType = js.native
  
  var Premul: AlphaType = js.native
  
  var Unpremul: AlphaType = js.native
}
object AlphaTypeEnumValues {
  
  @scala.inline
  def apply(Opaque: AlphaType, Premul: AlphaType, Unpremul: AlphaType, values: js.Array[Double]): AlphaTypeEnumValues = {
    val __obj = js.Dynamic.literal(Opaque = Opaque.asInstanceOf[js.Any], Premul = Premul.asInstanceOf[js.Any], Unpremul = Unpremul.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaTypeEnumValues]
  }
  
  @scala.inline
  implicit class AlphaTypeEnumValuesOps[Self <: AlphaTypeEnumValues] (val x: Self) extends AnyVal {
    
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
    def setOpaque(value: AlphaType): Self = this.set("Opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremul(value: AlphaType): Self = this.set("Premul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpremul(value: AlphaType): Self = this.set("Unpremul", value.asInstanceOf[js.Any])
  }
}
