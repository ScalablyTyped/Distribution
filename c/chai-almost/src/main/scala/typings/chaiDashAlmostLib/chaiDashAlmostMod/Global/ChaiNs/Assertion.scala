package typings
package chaiDashAlmostLib.chaiDashAlmostMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  var almost: chaiDashAlmostLib.chaiDashAlmostMod.Global.ChaiNs.ChaiAlmostNs.Almost
}

object Assertion {
  @scala.inline
  def apply(almost: chaiDashAlmostLib.chaiDashAlmostMod.Global.ChaiNs.ChaiAlmostNs.Almost): Assertion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("almost")(almost)
    __obj.asInstanceOf[Assertion]
  }
}

