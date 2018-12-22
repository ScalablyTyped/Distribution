package typings
package chaiDashAsDashPromisedLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedTypeComparison extends js.Object {
  @JSName("instanceOf")
  var instanceOf_Original: PromisedInstanceOf = js.native
  @JSName("instanceof")
  var instanceof_Original: PromisedInstanceOf = js.native
  def apply(`type`: java.lang.String): PromisedAssertion = js.native
  def apply(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def instanceOf(constructor: chaiLib.Object): PromisedAssertion = js.native
  def instanceOf(constructor: chaiLib.Object, message: java.lang.String): PromisedAssertion = js.native
  def instanceof(constructor: chaiLib.Object): PromisedAssertion = js.native
  def instanceof(constructor: chaiLib.Object, message: java.lang.String): PromisedAssertion = js.native
}

