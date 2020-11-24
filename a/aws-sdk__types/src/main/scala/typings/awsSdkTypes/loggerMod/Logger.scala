package typings.awsSdkTypes.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  def debug(content: js.Object): Unit = js.native
  
  def error(content: js.Object): Unit = js.native
  
  def info(content: js.Object): Unit = js.native
  
  def warn(content: js.Object): Unit = js.native
}
object Logger {
  
  @scala.inline
  def apply(
    debug: js.Object => Unit,
    error: js.Object => Unit,
    info: js.Object => Unit,
    warn: js.Object => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
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
    def setDebug(value: js.Object => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: js.Object => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: js.Object => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: js.Object => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
