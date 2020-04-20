package typings.consola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsolaReporter extends js.Object {
  def log(logObj: ConsolaLogObject, args: ConsolaReporterArgs): Unit
}

object ConsolaReporter {
  @scala.inline
  def apply(log: (ConsolaLogObject, ConsolaReporterArgs) => Unit): ConsolaReporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log))
    __obj.asInstanceOf[ConsolaReporter]
  }
}

