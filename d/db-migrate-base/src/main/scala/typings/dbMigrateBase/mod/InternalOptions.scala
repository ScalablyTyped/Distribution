package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalOptions extends js.Object {
  
  var mod: InternalModule = js.native
}
object InternalOptions {
  
  @scala.inline
  def apply(mod: InternalModule): InternalOptions = {
    val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalOptions]
  }
  
  @scala.inline
  implicit class InternalOptionsOps[Self <: InternalOptions] (val x: Self) extends AnyVal {
    
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
    def setMod(value: InternalModule): Self = this.set("mod", value.asInstanceOf[js.Any])
  }
}
