package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TonalColorsOutput extends js.Object {
  
  var ambient: SkColor = js.native
  
  var spot: SkColor = js.native
}
object TonalColorsOutput {
  
  @scala.inline
  def apply(ambient: SkColor, spot: SkColor): TonalColorsOutput = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TonalColorsOutput]
  }
  
  @scala.inline
  implicit class TonalColorsOutputOps[Self <: TonalColorsOutput] (val x: Self) extends AnyVal {
    
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
    def setAmbient(value: SkColor): Self = this.set("ambient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpot(value: SkColor): Self = this.set("spot", value.asInstanceOf[js.Any])
  }
}
