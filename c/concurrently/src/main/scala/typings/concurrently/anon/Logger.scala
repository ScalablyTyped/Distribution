package typings.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var logger: typings.concurrently.distSrcLoggerMod.Logger
}
object Logger {
  
  inline def apply(logger: typings.concurrently.distSrcLoggerMod.Logger): Logger = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setLogger(value: typings.concurrently.distSrcLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
