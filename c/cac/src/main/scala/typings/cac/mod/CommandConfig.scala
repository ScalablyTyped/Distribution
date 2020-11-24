package typings.cac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandConfig extends js.Object {
  
  var allowUnknownOptions: js.UndefOr[Boolean] = js.native
  
  var ignoreOptionDefaultValue: js.UndefOr[Boolean] = js.native
}
object CommandConfig {
  
  @scala.inline
  def apply(): CommandConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandConfig]
  }
  
  @scala.inline
  implicit class CommandConfigOps[Self <: CommandConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknownOptions(value: Boolean): Self = this.set("allowUnknownOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnknownOptions: Self = this.set("allowUnknownOptions", js.undefined)
    
    @scala.inline
    def setIgnoreOptionDefaultValue(value: Boolean): Self = this.set("ignoreOptionDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreOptionDefaultValue: Self = this.set("ignoreOptionDefaultValue", js.undefined)
  }
}
