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
    val __obj = js.Dynamic.literal(`with` = `with`)
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("at")(at)
    __obj.updateDynamic("be")(be)
    __obj.updateDynamic("been")(been)
    __obj.updateDynamic("but")(but)
    __obj.updateDynamic("does")(does)
    __obj.updateDynamic("eventually")(eventually)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("have")(have)
    __obj.updateDynamic("is")(is)
    __obj.updateDynamic("of")(of)
    __obj.updateDynamic("same")(same)
    __obj.updateDynamic("that")(that)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("which")(which)
    __obj.asInstanceOf[PromisedLanguageChains]
  }
}

