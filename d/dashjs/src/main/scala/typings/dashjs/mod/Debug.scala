package typings.dashjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends js.Object {
  
  def getLogLevel(): LogLevel = js.native
  
  def getLogToBrowserConsole(): Boolean = js.native
  
  def getLogger(): Logger = js.native
  
  def setCalleeNameVisible(flag: Boolean): Unit = js.native
  
  def setLogLevel(level: LogLevel): Unit = js.native
  
  def setLogTimestampVisible(flag: Boolean): Unit = js.native
  
  def setLogToBrowserConsole(flag: Boolean): Unit = js.native
}
object Debug {
  
  @scala.inline
  def apply(
    getLogLevel: () => LogLevel,
    getLogToBrowserConsole: () => Boolean,
    getLogger: () => Logger,
    setCalleeNameVisible: Boolean => Unit,
    setLogLevel: LogLevel => Unit,
    setLogTimestampVisible: Boolean => Unit,
    setLogToBrowserConsole: Boolean => Unit
  ): Debug = {
    val __obj = js.Dynamic.literal(getLogLevel = js.Any.fromFunction0(getLogLevel), getLogToBrowserConsole = js.Any.fromFunction0(getLogToBrowserConsole), getLogger = js.Any.fromFunction0(getLogger), setCalleeNameVisible = js.Any.fromFunction1(setCalleeNameVisible), setLogLevel = js.Any.fromFunction1(setLogLevel), setLogTimestampVisible = js.Any.fromFunction1(setLogTimestampVisible), setLogToBrowserConsole = js.Any.fromFunction1(setLogToBrowserConsole))
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
    
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
    def setGetLogLevel(value: () => LogLevel): Self = this.set("getLogLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLogToBrowserConsole(value: () => Boolean): Self = this.set("getLogToBrowserConsole", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLogger(value: () => Logger): Self = this.set("getLogger", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCalleeNameVisible(value: Boolean => Unit): Self = this.set("setCalleeNameVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLogLevel(value: LogLevel => Unit): Self = this.set("setLogLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLogTimestampVisible(value: Boolean => Unit): Self = this.set("setLogTimestampVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLogToBrowserConsole(value: Boolean => Unit): Self = this.set("setLogToBrowserConsole", js.Any.fromFunction1(value))
  }
}
