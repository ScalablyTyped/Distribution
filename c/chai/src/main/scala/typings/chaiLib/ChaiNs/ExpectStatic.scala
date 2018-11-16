package typings
package chaiLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectStatic extends AssertionStatic {
  def fail(): scala.Unit = js.native
  def fail(actual: js.Any): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: Operator): scala.Unit = js.native
}

