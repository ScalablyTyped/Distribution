package typings.cac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionConfig extends js.Object {
  
  var default: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[js.Array[_]] = js.native
}
object OptionConfig {
  
  @scala.inline
  def apply(): OptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionConfig]
  }
  
  @scala.inline
  implicit class OptionConfigOps[Self <: OptionConfig] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: js.Any*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[_]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
