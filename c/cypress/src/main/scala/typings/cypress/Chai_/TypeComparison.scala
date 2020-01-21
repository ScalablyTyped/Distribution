package typings.cypress.Chai_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeComparison extends js.Object {
  @JSName("instanceOf")
  var instanceOf_Original: InstanceOf = js.native
  @JSName("instanceof")
  var instanceof_Original: InstanceOf = js.native
  def apply(`type`: String): Assertion = js.native
  def apply(`type`: String, message: String): Assertion = js.native
  def instanceOf(constructor: js.Any): Assertion = js.native
  def instanceOf(constructor: js.Any, message: String): Assertion = js.native
  def instanceof(constructor: js.Any): Assertion = js.native
  def instanceof(constructor: js.Any, message: String): Assertion = js.native
}

