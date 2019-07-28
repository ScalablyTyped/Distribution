package typings.chaiDashAsDashPromised.ChaiNs

import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedOwnPropertyDescriptor extends js.Object {
  def apply(name: String): PromisedAssertion = js.native
  def apply(name: String, descriptor: PropertyDescriptor): PromisedAssertion = js.native
  def apply(name: String, descriptor: PropertyDescriptor, message: String): PromisedAssertion = js.native
  def apply(name: String, message: String): PromisedAssertion = js.native
}

