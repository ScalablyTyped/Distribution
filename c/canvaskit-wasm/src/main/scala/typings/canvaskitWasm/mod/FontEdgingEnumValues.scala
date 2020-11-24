package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontEdgingEnumValues extends EmbindEnum {
  
  var Alias: FontEdging = js.native
  
  var AntiAlias: FontEdging = js.native
  
  var SubpixelAntiAlias: FontEdging = js.native
}
object FontEdgingEnumValues {
  
  @scala.inline
  def apply(Alias: FontEdging, AntiAlias: FontEdging, SubpixelAntiAlias: FontEdging, values: js.Array[Double]): FontEdgingEnumValues = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], AntiAlias = AntiAlias.asInstanceOf[js.Any], SubpixelAntiAlias = SubpixelAntiAlias.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontEdgingEnumValues]
  }
  
  @scala.inline
  implicit class FontEdgingEnumValuesOps[Self <: FontEdgingEnumValues] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: FontEdging): Self = this.set("Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntiAlias(value: FontEdging): Self = this.set("AntiAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubpixelAntiAlias(value: FontEdging): Self = this.set("SubpixelAntiAlias", value.asInstanceOf[js.Any])
  }
}
