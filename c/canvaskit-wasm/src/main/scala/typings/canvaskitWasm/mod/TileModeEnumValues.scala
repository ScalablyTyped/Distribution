package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileModeEnumValues extends EmbindEnum {
  
  var Clamp: TileMode = js.native
  
  var Decal: TileMode = js.native
  
  var Mirror: TileMode = js.native
  
  var Repeat: TileMode = js.native
}
object TileModeEnumValues {
  
  @scala.inline
  def apply(Clamp: TileMode, Decal: TileMode, Mirror: TileMode, Repeat: TileMode, values: js.Array[Double]): TileModeEnumValues = {
    val __obj = js.Dynamic.literal(Clamp = Clamp.asInstanceOf[js.Any], Decal = Decal.asInstanceOf[js.Any], Mirror = Mirror.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileModeEnumValues]
  }
  
  @scala.inline
  implicit class TileModeEnumValuesOps[Self <: TileModeEnumValues] (val x: Self) extends AnyVal {
    
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
    def setClamp(value: TileMode): Self = this.set("Clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecal(value: TileMode): Self = this.set("Decal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirror(value: TileMode): Self = this.set("Mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: TileMode): Self = this.set("Repeat", value.asInstanceOf[js.Any])
  }
}
