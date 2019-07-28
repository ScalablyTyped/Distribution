package typings.cypress.CypressNs

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
    val __obj = js.Dynamic.literal(code = code, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[Exec]
  }
}

