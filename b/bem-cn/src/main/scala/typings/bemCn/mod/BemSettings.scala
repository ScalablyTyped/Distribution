package typings.bemCn.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BemSettings extends js.Object {
  
  var classMap: js.UndefOr[Record[String, String]] = js.native
  
  var el: String = js.native
  
  var mod: String = js.native
  
  var modValue: String = js.native
  
  var ns: js.UndefOr[String] = js.native
}
object BemSettings {
  
  @scala.inline
  def apply(el: String, mod: String, modValue: String): BemSettings = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], modValue = modValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[BemSettings]
  }
  
  @scala.inline
  implicit class BemSettingsOps[Self <: BemSettings] (val x: Self) extends AnyVal {
    
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
    def setEl(value: String): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMod(value: String): Self = this.set("mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModValue(value: String): Self = this.set("modValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassMap(value: Record[String, String]): Self = this.set("classMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassMap: Self = this.set("classMap", js.undefined)
    
    @scala.inline
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
  }
}
