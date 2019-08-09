package typings.chai.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectStatic extends js.Object {
  def apply(`val`: js.Any): Assertion = js.native
  def apply(`val`: js.Any, message: String): Assertion = js.native
  def fail(): Unit = js.native
  def fail(actual: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: Operator): Unit = js.native
}

