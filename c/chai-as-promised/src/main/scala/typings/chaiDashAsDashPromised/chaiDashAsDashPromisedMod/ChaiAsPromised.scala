package typings.chaiDashAsDashPromised.chaiDashAsDashPromisedMod

import typings.chai.ChaiNs.ChaiPlugin
import typings.chaiDashAsDashPromised.ChaiNs.PromisedAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiAsPromised extends ChaiPlugin {
  def transferPromiseness(assertion: PromisedAssertion, promise: js.Thenable[_]): Unit = js.native
  def transformAsserterArgs(values: js.Array[_]): js.Any = js.native
}

