package typings.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaReporter extends StObject {
  
  def log(logObj: ConsolaReporterLogObject, args: ConsolaReporterArgs): Unit
}
object ConsolaReporter {
  
  @scala.inline
  def apply(log: (ConsolaReporterLogObject, ConsolaReporterArgs) => Unit): ConsolaReporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log))
    __obj.asInstanceOf[ConsolaReporter]
  }
  
  @scala.inline
  implicit class ConsolaReporterMutableBuilder[Self <: ConsolaReporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog(value: (ConsolaReporterLogObject, ConsolaReporterArgs) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
  }
}
