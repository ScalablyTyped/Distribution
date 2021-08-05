package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def annotate(fn: js.Function, msg: String): Logger
  
  def debug(msg: String): Logger
  
  def deprecate(fn: js.Function, msg: String): Unit
  
  var enableDebugLog: Boolean
  
  def warn(msg: String): Logger
  
  def warnOnce(msg: String): Logger
}
object Logger {
  
  inline def apply(
    annotate: (js.Function, String) => Logger,
    debug: String => Logger,
    deprecate: (js.Function, String) => Unit,
    enableDebugLog: Boolean,
    warn: String => Logger,
    warnOnce: String => Logger
  ): Logger = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction2(annotate), debug = js.Any.fromFunction1(debug), deprecate = js.Any.fromFunction2(deprecate), enableDebugLog = enableDebugLog.asInstanceOf[js.Any], warn = js.Any.fromFunction1(warn), warnOnce = js.Any.fromFunction1(warnOnce))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setAnnotate(value: (js.Function, String) => Logger): Self = StObject.set(x, "annotate", js.Any.fromFunction2(value))
    
    inline def setDebug(value: String => Logger): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDeprecate(value: (js.Function, String) => Unit): Self = StObject.set(x, "deprecate", js.Any.fromFunction2(value))
    
    inline def setEnableDebugLog(value: Boolean): Self = StObject.set(x, "enableDebugLog", value.asInstanceOf[js.Any])
    
    inline def setWarn(value: String => Logger): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    
    inline def setWarnOnce(value: String => Logger): Self = StObject.set(x, "warnOnce", js.Any.fromFunction1(value))
  }
}
