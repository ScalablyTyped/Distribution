package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TonalColorsInput extends js.Object {
  
  var ambient: InputColor = js.native
  
  var spot: InputColor = js.native
}
object TonalColorsInput {
  
  @scala.inline
  def apply(ambient: InputColor, spot: InputColor): TonalColorsInput = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TonalColorsInput]
  }
  
  @scala.inline
  implicit class TonalColorsInputOps[Self <: TonalColorsInput] (val x: Self) extends AnyVal {
    
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
    def setAmbientVarargs(value: Double*): Self = this.set("ambient", js.Array(value :_*))
    
    @scala.inline
    def setAmbient(value: InputColor): Self = this.set("ambient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotVarargs(value: Double*): Self = this.set("spot", js.Array(value :_*))
    
    @scala.inline
    def setSpot(value: InputColor): Self = this.set("spot", value.asInstanceOf[js.Any])
  }
}
