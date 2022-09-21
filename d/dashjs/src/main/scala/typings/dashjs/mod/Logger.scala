package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def debug(params: Any*): Unit
  
  def error(params: Any*): Unit
  
  def fatal(params: Any*): Unit
  
  def info(params: Any*): Unit
  
  def warn(params: Any*): Unit
}
object Logger {
  
  inline def apply(
    debug: /* repeated */ Any => Unit,
    error: /* repeated */ Any => Unit,
    fatal: /* repeated */ Any => Unit,
    info: /* repeated */ Any => Unit,
    warn: /* repeated */ Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setFatal(value: /* repeated */ Any => Unit): Self = StObject.set(x, "fatal", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
