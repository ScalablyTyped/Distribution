package typings.browserBunyan.mod.BrowserBunyan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleFormattedStreamLevelStyle extends js.Object {
  
  var debug: String = js.native
  
  var error: String = js.native
  
  var fatal: String = js.native
  
  var info: String = js.native
  
  var trace: String = js.native
  
  var warn: String = js.native
}
object ConsoleFormattedStreamLevelStyle {
  
  @scala.inline
  def apply(debug: String, error: String, fatal: String, info: String, trace: String, warn: String): ConsoleFormattedStreamLevelStyle = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFormattedStreamLevelStyle]
  }
  
  @scala.inline
  implicit class ConsoleFormattedStreamLevelStyleOps[Self <: ConsoleFormattedStreamLevelStyle] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: String): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatal(value: String): Self = this.set("fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace(value: String): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: String): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
}
