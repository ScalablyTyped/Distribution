package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def debug(message: Any*): Unit
  
  def error(message: Any*): Unit
  
  def info(message: Any*): Unit
  
  def log(level: String, message: Any*): Unit
  
  def silly(message: Any*): Unit
  
  def verbose(message: Any*): Unit
  
  def warn(message: Any*): Unit
}
object Logger {
  
  inline def apply(
    debug: /* repeated */ Any => Unit,
    error: /* repeated */ Any => Unit,
    info: /* repeated */ Any => Unit,
    log: (String, /* repeated */ Any) => Unit,
    silly: /* repeated */ Any => Unit,
    verbose: /* repeated */ Any => Unit,
    warn: /* repeated */ Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction2(log), silly = js.Any.fromFunction1(silly), verbose = js.Any.fromFunction1(verbose), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setLog(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    inline def setSilly(value: /* repeated */ Any => Unit): Self = StObject.set(x, "silly", js.Any.fromFunction1(value))
    
    inline def setVerbose(value: /* repeated */ Any => Unit): Self = StObject.set(x, "verbose", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
