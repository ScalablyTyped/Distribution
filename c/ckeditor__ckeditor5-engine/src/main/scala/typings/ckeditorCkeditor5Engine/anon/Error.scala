package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  def error(arg: js.Any*): String
  
  def log(arg: js.Any*): String
}
object Error {
  
  inline def apply(error: /* repeated */ js.Any => String, log: /* repeated */ js.Any => String): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: /* repeated */ js.Any => String): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setLog(value: /* repeated */ js.Any => String): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
  }
}
