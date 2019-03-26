package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  @JSName("should")
  var should_Original: cypressLib.ChaiNs.Assertion = js.native
  def should(selector: java.lang.String): cypressLib.ChaiNs.Assertion = js.native
  def should(`type`: java.lang.String, message: java.lang.String): cypressLib.ChaiNs.Assertion = js.native
}

