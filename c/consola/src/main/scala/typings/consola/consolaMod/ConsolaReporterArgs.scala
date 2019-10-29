package typings.consola.consolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsolaReporterArgs extends js.Object {
  var async: Boolean
  var stderr: js.Any
  var stdout: js.Any
}

object ConsolaReporterArgs {
  @scala.inline
  def apply(async: Boolean, stderr: js.Any, stdout: js.Any): ConsolaReporterArgs = {
    val __obj = js.Dynamic.literal(async = async, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[ConsolaReporterArgs]
  }
}

