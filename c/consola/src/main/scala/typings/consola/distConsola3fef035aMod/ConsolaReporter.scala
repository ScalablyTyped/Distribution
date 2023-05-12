package typings.consola.distConsola3fef035aMod

import typings.consola.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaReporter extends StObject {
  
  def log(logObj: LogObject, ctx: Options): Unit
}
object ConsolaReporter {
  
  inline def apply(log: (LogObject, Options) => Unit): ConsolaReporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log))
    __obj.asInstanceOf[ConsolaReporter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsolaReporter] (val x: Self) extends AnyVal {
    
    inline def setLog(value: (LogObject, Options) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
  }
}
