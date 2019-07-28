package typings.chaiDashAsDashPromised.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedTypeComparison extends js.Object {
  @JSName("instanceOf")
  var instanceOf_Original: PromisedInstanceOf = js.native
  @JSName("instanceof")
  var instanceof_Original: PromisedInstanceOf = js.native
  def apply(`type`: String): PromisedAssertion = js.native
  def apply(`type`: String, message: String): PromisedAssertion = js.native
  def instanceOf(constructor: js.Object): PromisedAssertion = js.native
  def instanceOf(constructor: js.Object, message: String): PromisedAssertion = js.native
  def instanceof(constructor: js.Object): PromisedAssertion = js.native
  def instanceof(constructor: js.Object, message: String): PromisedAssertion = js.native
}

