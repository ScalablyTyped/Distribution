package typings.cssnano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssNanoOptions extends js.Object {
  
  var configFile: js.UndefOr[String] = js.native
  
  var preset: js.UndefOr[(js.Tuple2[String, js.Object]) | String] = js.native
}
object CssNanoOptions {
  
  @scala.inline
  def apply(): CssNanoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssNanoOptions]
  }
  
  @scala.inline
  implicit class CssNanoOptionsOps[Self <: CssNanoOptions] (val x: Self) extends AnyVal {
    
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
    def setConfigFile(value: String): Self = this.set("configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFile: Self = this.set("configFile", js.undefined)
    
    @scala.inline
    def setPreset(value: (js.Tuple2[String, js.Object]) | String): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
  }
}
