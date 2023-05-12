package typings.cucumberCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoggerMod {
  
  trait ILogger extends StObject {
    
    def debug(content: Any*): Unit
    
    def error(content: Any*): Unit
    
    def warn(content: Any*): Unit
  }
  object ILogger {
    
    inline def apply(
      debug: /* repeated */ Any => Unit,
      error: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): ILogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[ILogger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILogger] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
}
