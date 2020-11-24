package typings.cosmiconfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var config: typings.cosmiconfig.typesMod.Config = js.native
  
  var filepath: String = js.native
  
  var isEmpty: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(config: typings.cosmiconfig.typesMod.Config, filepath: String): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: typings.cosmiconfig.typesMod.Config): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepath(value: String): Self = this.set("filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmpty(value: Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEmpty: Self = this.set("isEmpty", js.undefined)
  }
}
