package typings.ctrlTinycolor.interfacesMod

import typings.ctrlTinycolor.distMod._ColorInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HSV extends _ColorInput {
  
  var h: Double | String = js.native
  
  var s: Double | String = js.native
  
  var v: Double | String = js.native
}
object HSV {
  
  @scala.inline
  def apply(h: Double | String, s: Double | String, v: Double | String): HSV = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSV]
  }
  
  @scala.inline
  implicit class HSVOps[Self <: HSV] (val x: Self) extends AnyVal {
    
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
    def setH(value: Double | String): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double | String): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double | String): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
