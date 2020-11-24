package typings.bugsnag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  def debug(): Unit = js.native
  
  def error(): Unit = js.native
  
  def info(): Unit = js.native
  
  def warn(): Unit = js.native
}
object Logger {
  
  @scala.inline
  def apply(debug: () => Unit, error: () => Unit, info: () => Unit, warn: () => Unit): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), error = js.Any.fromFunction0(error), info = js.Any.fromFunction0(info), warn = js.Any.fromFunction0(warn))
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
    def setDebug(value: () => Unit): Self = this.set("debug", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: () => Unit): Self = this.set("error", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInfo(value: () => Unit): Self = this.set("info", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWarn(value: () => Unit): Self = this.set("warn", js.Any.fromFunction0(value))
  }
}
