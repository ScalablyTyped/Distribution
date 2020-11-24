package typings.babelPluginTransformRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var absoluteRuntime: js.UndefOr[Boolean | String] = js.native
  
  var corejs: js.UndefOr[CorejsOption] = js.native
  
  var helpers: js.UndefOr[Boolean] = js.native
  
  var regenerator: js.UndefOr[Boolean] = js.native
  
  var useESModules: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAbsoluteRuntime(value: Boolean | String): Self = this.set("absoluteRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsoluteRuntime: Self = this.set("absoluteRuntime", js.undefined)
    
    @scala.inline
    def setCorejs(value: CorejsOption): Self = this.set("corejs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorejs: Self = this.set("corejs", js.undefined)
    
    @scala.inline
    def setHelpers(value: Boolean): Self = this.set("helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpers: Self = this.set("helpers", js.undefined)
    
    @scala.inline
    def setRegenerator(value: Boolean): Self = this.set("regenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegenerator: Self = this.set("regenerator", js.undefined)
    
    @scala.inline
    def setUseESModules(value: Boolean): Self = this.set("useESModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseESModules: Self = this.set("useESModules", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
