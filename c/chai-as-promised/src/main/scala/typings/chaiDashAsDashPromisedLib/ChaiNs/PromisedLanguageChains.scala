package typings
package chaiDashAsDashPromisedLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisedLanguageChains extends js.Object {
  var and: PromisedAssertion
  var at: PromisedAssertion
  var be: PromisedAssertion
  var been: PromisedAssertion
  var but: PromisedAssertion
  var does: PromisedAssertion
  var eventually: Eventually
  var has: PromisedAssertion
  var have: PromisedAssertion
  var is: PromisedAssertion
  var of: PromisedAssertion
  var same: PromisedAssertion
  var that: PromisedAssertion
  // From chai
  var to: PromisedAssertion
  var which: PromisedAssertion
  var `with`: PromisedAssertion
}

object PromisedLanguageChains {
  @scala.inline
  def apply(
    and: PromisedAssertion,
    at: PromisedAssertion,
    be: PromisedAssertion,
    been: PromisedAssertion,
    but: PromisedAssertion,
    does: PromisedAssertion,
    eventually: Eventually,
    has: PromisedAssertion,
    have: PromisedAssertion,
    is: PromisedAssertion,
    of: PromisedAssertion,
    same: PromisedAssertion,
    that: PromisedAssertion,
    to: PromisedAssertion,
    which: PromisedAssertion,
    `with`: PromisedAssertion
  ): PromisedLanguageChains = {
    val __obj = js.Dynamic.literal(and = and, at = at, be = be, been = been, but = but, does = does, eventually = eventually, has = has, have = have, is = is, of = of, same = same, that = that, to = to, which = which)
    __obj.updateDynamic("with")(`with`)
    __obj.asInstanceOf[PromisedLanguageChains]
  }
}

