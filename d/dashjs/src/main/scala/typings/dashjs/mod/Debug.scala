package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  def getLogLevel(): LogLevel
  
  def getLogToBrowserConsole(): Boolean
  
  def getLogger(): Logger
  
  def setCalleeNameVisible(flag: Boolean): Unit
  
  def setLogLevel(level: LogLevel): Unit
  
  def setLogTimestampVisible(flag: Boolean): Unit
  
  def setLogToBrowserConsole(flag: Boolean): Unit
}
object Debug {
  
  inline def apply(
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
  
  extension [Self <: Debug](x: Self) {
    
    inline def setGetLogLevel(value: () => LogLevel): Self = StObject.set(x, "getLogLevel", js.Any.fromFunction0(value))
    
    inline def setGetLogToBrowserConsole(value: () => Boolean): Self = StObject.set(x, "getLogToBrowserConsole", js.Any.fromFunction0(value))
    
    inline def setGetLogger(value: () => Logger): Self = StObject.set(x, "getLogger", js.Any.fromFunction0(value))
    
    inline def setSetCalleeNameVisible(value: Boolean => Unit): Self = StObject.set(x, "setCalleeNameVisible", js.Any.fromFunction1(value))
    
    inline def setSetLogLevel(value: LogLevel => Unit): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1(value))
    
    inline def setSetLogTimestampVisible(value: Boolean => Unit): Self = StObject.set(x, "setLogTimestampVisible", js.Any.fromFunction1(value))
    
    inline def setSetLogToBrowserConsole(value: Boolean => Unit): Self = StObject.set(x, "setLogToBrowserConsole", js.Any.fromFunction1(value))
  }
}
