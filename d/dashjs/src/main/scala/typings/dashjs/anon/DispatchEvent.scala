package typings.dashjs.anon

import typings.dashjs.mod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchEvent extends StObject {
  
  var dispatchEvent: js.UndefOr[Boolean] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
}
object DispatchEvent {
  
  inline def apply(): DispatchEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatchEvent]
  }
  
  extension [Self <: DispatchEvent](x: Self) {
    
    inline def setDispatchEvent(value: Boolean): Self = StObject.set(x, "dispatchEvent", value.asInstanceOf[js.Any])
    
    inline def setDispatchEventUndefined: Self = StObject.set(x, "dispatchEvent", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
  }
}
