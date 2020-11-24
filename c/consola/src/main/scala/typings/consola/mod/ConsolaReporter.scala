package typings.consola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsolaReporter extends js.Object {
  
  def log(logObj: ConsolaReporterLogObject, args: ConsolaReporterArgs): Unit = js.native
}
object ConsolaReporter {
  
  @scala.inline
  def apply(log: (ConsolaReporterLogObject, ConsolaReporterArgs) => Unit): ConsolaReporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log))
    __obj.asInstanceOf[ConsolaReporter]
  }
  
  @scala.inline
  implicit class ConsolaReporterOps[Self <: ConsolaReporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLog(value: (ConsolaReporterLogObject, ConsolaReporterArgs) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
  }
}
