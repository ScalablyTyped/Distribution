package typings.babelPresetEnv.anon

import typings.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Browsers extends _TargetsOptions {
  
  var browsers: String | js.Array[String] = js.native
}
object Browsers {
  
  @scala.inline
  def apply(browsers: String | js.Array[String]): Browsers = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browsers]
  }
  
  @scala.inline
  implicit class BrowsersOps[Self <: Browsers] (val x: Self) extends AnyVal {
    
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
    def setBrowsersVarargs(value: String*): Self = this.set("browsers", js.Array(value :_*))
    
    @scala.inline
    def setBrowsers(value: String | js.Array[String]): Self = this.set("browsers", value.asInstanceOf[js.Any])
  }
}
