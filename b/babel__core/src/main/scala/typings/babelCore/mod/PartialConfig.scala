package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialConfig extends js.Object {
  
  var babelignore: js.UndefOr[String] = js.native
  
  var babelrc: js.UndefOr[String] = js.native
  
  var config: js.UndefOr[String] = js.native
  
  def hasFilesystemConfig(): Boolean = js.native
  
  var options: TransformOptions = js.native
}
object PartialConfig {
  
  @scala.inline
  def apply(hasFilesystemConfig: () => Boolean, options: TransformOptions): PartialConfig = {
    val __obj = js.Dynamic.literal(hasFilesystemConfig = js.Any.fromFunction0(hasFilesystemConfig), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
  
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
    
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
    def setHasFilesystemConfig(value: () => Boolean): Self = this.set("hasFilesystemConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: TransformOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBabelignore(value: String): Self = this.set("babelignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelignore: Self = this.set("babelignore", js.undefined)
    
    @scala.inline
    def setBabelrc(value: String): Self = this.set("babelrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelrc: Self = this.set("babelrc", js.undefined)
    
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
}
