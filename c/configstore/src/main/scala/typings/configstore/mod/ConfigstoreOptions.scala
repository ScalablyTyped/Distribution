package typings.configstore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigstoreOptions extends js.Object {
  
  var configPath: js.UndefOr[String] = js.native
  
  var globalConfigPath: js.UndefOr[Boolean] = js.native
}
object ConfigstoreOptions {
  
  @scala.inline
  def apply(): ConfigstoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigstoreOptions]
  }
  
  @scala.inline
  implicit class ConfigstoreOptionsOps[Self <: ConfigstoreOptions] (val x: Self) extends AnyVal {
    
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
    def setConfigPath(value: String): Self = this.set("configPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigPath: Self = this.set("configPath", js.undefined)
    
    @scala.inline
    def setGlobalConfigPath(value: Boolean): Self = this.set("globalConfigPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalConfigPath: Self = this.set("globalConfigPath", js.undefined)
  }
}
