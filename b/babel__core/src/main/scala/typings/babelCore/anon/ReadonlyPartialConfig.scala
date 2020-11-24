package typings.babelCore.anon

import typings.babelCore.mod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@babel/core.@babel/core.PartialConfig> */
@js.native
trait ReadonlyPartialConfig extends js.Object {
  
  val babelignore: js.UndefOr[String] = js.native
  
  val babelrc: js.UndefOr[String] = js.native
  
  val config: js.UndefOr[String] = js.native
  
  def hasFilesystemConfig(): Boolean = js.native
  
  val options: TransformOptions = js.native
}
object ReadonlyPartialConfig {
  
  @scala.inline
  def apply(hasFilesystemConfig: () => Boolean, options: TransformOptions): ReadonlyPartialConfig = {
    val __obj = js.Dynamic.literal(hasFilesystemConfig = js.Any.fromFunction0(hasFilesystemConfig), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPartialConfig]
  }
  
  @scala.inline
  implicit class ReadonlyPartialConfigOps[Self <: ReadonlyPartialConfig] (val x: Self) extends AnyVal {
    
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
