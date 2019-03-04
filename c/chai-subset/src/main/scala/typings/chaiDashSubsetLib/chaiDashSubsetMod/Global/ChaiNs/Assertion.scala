package typings
package chaiDashSubsetLib.chaiDashSubsetMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  def containSubset(expected: js.Any): Assertion
}

object Assertion {
  @scala.inline
  def apply(containSubset: js.Function1[js.Any, Assertion]): Assertion = {
    val __obj = js.Dynamic.literal(containSubset = containSubset)
  
    __obj.asInstanceOf[Assertion]
  }
}

