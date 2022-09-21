package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  def getLogger(): Logger
  
  def setCalleeNameVisible(flag: Boolean): Unit
  
  def setLogTimestampVisible(flag: Boolean): Unit
}
object Debug {
  
  inline def apply(
    getLogger: () => Logger,
    setCalleeNameVisible: Boolean => Unit,
    setLogTimestampVisible: Boolean => Unit
  ): Debug = {
    val __obj = js.Dynamic.literal(getLogger = js.Any.fromFunction0(getLogger), setCalleeNameVisible = js.Any.fromFunction1(setCalleeNameVisible), setLogTimestampVisible = js.Any.fromFunction1(setLogTimestampVisible))
    __obj.asInstanceOf[Debug]
  }
  
  extension [Self <: Debug](x: Self) {
    
    inline def setGetLogger(value: () => Logger): Self = StObject.set(x, "getLogger", js.Any.fromFunction0(value))
    
    inline def setSetCalleeNameVisible(value: Boolean => Unit): Self = StObject.set(x, "setCalleeNameVisible", js.Any.fromFunction1(value))
    
    inline def setSetLogTimestampVisible(value: Boolean => Unit): Self = StObject.set(x, "setLogTimestampVisible", js.Any.fromFunction1(value))
  }
}
