package typings.cypress.mod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exec extends js.Object {
  var code: Double
  var stderr: String
  var stdout: String
}

object Exec {
  @scala.inline
  def apply(code: Double, stderr: String, stdout: String): Exec = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exec]
  }
}

