package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontHintingEnumValues extends EmbindEnum {
  
  var Full: FontHinting = js.native
  
  var None: FontHinting = js.native
  
  var Normal: FontHinting = js.native
  
  var Slight: FontHinting = js.native
}
object FontHintingEnumValues {
  
  @scala.inline
  def apply(
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
  implicit class FontHintingEnumValuesOps[Self <: FontHintingEnumValues] (val x: Self) extends AnyVal {
    
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
    def setFull(value: FontHinting): Self = this.set("Full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: FontHinting): Self = this.set("None", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: FontHinting): Self = this.set("Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlight(value: FontHinting): Self = this.set("Slight", value.asInstanceOf[js.Any])
  }
}
