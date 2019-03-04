package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exec extends js.Object {
  var code: scala.Double
  var stderr: java.lang.String
  var stdout: java.lang.String
}

object Exec {
  @scala.inline
  def apply(code: scala.Double, stderr: java.lang.String, stdout: java.lang.String): Exec = {
    val __obj = js.Dynamic.literal(code = code, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[Exec]
  }
}

