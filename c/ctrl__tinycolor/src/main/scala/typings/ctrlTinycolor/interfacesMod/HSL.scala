package typings.ctrlTinycolor.interfacesMod

import typings.ctrlTinycolor.distMod._ColorInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HSL extends _ColorInput {
  
  var h: Double | String = js.native
  
  var l: Double | String = js.native
  
  var s: Double | String = js.native
}
object HSL {
  
  @scala.inline
  def apply(h: Double | String, l: Double | String, s: Double | String): HSL = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSL]
  }
  
  @scala.inline
  implicit class HSLOps[Self <: HSL] (val x: Self) extends AnyVal {
    
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
    def setL(value: Double | String): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double | String): Self = this.set("s", value.asInstanceOf[js.Any])
  }
}
