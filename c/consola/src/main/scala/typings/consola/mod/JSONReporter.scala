package typings.consola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("consola", "JSONReporter")
@js.native
class JSONReporter () extends ConsolaReporter {
  def this(options: JSONReporterOptions) = this()
  /* CompleteClass */
  override def log(logObj: ConsolaLogObject, args: ConsolaReporterArgs): Unit = js.native
}

