package typings.chai.Chai_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectStatic extends js.Object {
  def apply(`val`: js.Any): Assertion = js.native
  def apply(`val`: js.Any, message: String): Assertion = js.native
  def fail(): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: Operator): scala.Nothing = js.native
  def fail(message: String): scala.Nothing = js.native
}

