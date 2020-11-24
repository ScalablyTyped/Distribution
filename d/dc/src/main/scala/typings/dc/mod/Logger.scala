package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  def annotate(fn: js.Function, msg: String): Logger = js.native
  
  def debug(msg: String): Logger = js.native
  
  def deprecate(fn: js.Function, msg: String): Unit = js.native
  
  var enableDebugLog: Boolean = js.native
  
  def warn(msg: String): Logger = js.native
  
  def warnOnce(msg: String): Logger = js.native
}
object Logger {
  
  @scala.inline
  def apply(
    annotate: (js.Function, String) => Logger,
    debug: String => Logger,
    deprecate: (js.Function, String) => Unit,
    enableDebugLog: Boolean,
    warn: String => Logger,
    warnOnce: String => Logger
  ): Logger = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction2(annotate), debug = js.Any.fromFunction1(debug), deprecate = js.Any.fromFunction2(deprecate), enableDebugLog = enableDebugLog.asInstanceOf[js.Any], warn = js.Any.fromFunction1(warn), warnOnce = js.Any.fromFunction1(warnOnce))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    
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
    def setAnnotate(value: (js.Function, String) => Logger): Self = this.set("annotate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDebug(value: String => Logger): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeprecate(value: (js.Function, String) => Unit): Self = this.set("deprecate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnableDebugLog(value: Boolean): Self = this.set("enableDebugLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: String => Logger): Self = this.set("warn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarnOnce(value: String => Logger): Self = this.set("warnOnce", js.Any.fromFunction1(value))
  }
}
