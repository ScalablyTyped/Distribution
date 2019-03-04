package typings
package chaiLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageChains extends js.Object {
  var and: Assertion
  var at: Assertion
  var be: Assertion
  var been: Assertion
  var but: Assertion
  var does: Assertion
  var has: Assertion
  var have: Assertion
  var is: Assertion
  var of: Assertion
  var same: Assertion
  var that: Assertion
  var to: Assertion
  var which: Assertion
  var `with`: Assertion
}

object LanguageChains {
  @scala.inline
  def apply(
    and: Assertion,
    at: Assertion,
    be: Assertion,
    been: Assertion,
    but: Assertion,
    does: Assertion,
    has: Assertion,
    have: Assertion,
    is: Assertion,
    of: Assertion,
    same: Assertion,
    that: Assertion,
    to: Assertion,
    which: Assertion,
    `with`: Assertion
  ): LanguageChains = {
    val __obj = js.Dynamic.literal(and = and, at = at, be = be, been = been, but = but, does = does, has = has, have = have, is = is, of = of, same = same, that = that, to = to, which = which)
    __obj.updateDynamic("with")(`with`)
    __obj.asInstanceOf[LanguageChains]
  }
}

