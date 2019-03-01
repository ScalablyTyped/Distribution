package typings
package chaiDashXmlLib.chaiDashXmlMod.ChaiXmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlAssertion
  extends chaiDashXmlLib.chaiDashXmlMod.Global.ChaiNs.Assertion {
  var and: XmlAssertion
  var at: XmlAssertion
  var be: XmlAssertion
  var been: XmlAssertion
  var has: XmlAssertion
  var have: XmlAssertion
  var is: XmlAssertion
  var not: XmlAssertion
  var of: XmlAssertion
  var same: XmlAssertion
  var that: XmlAssertion
  var to: XmlAssertion
  var which: XmlAssertion
  var `with`: XmlAssertion
  def valid(): XmlAssertion
}

object XmlAssertion {
  @scala.inline
  def apply(
    and: XmlAssertion,
    at: XmlAssertion,
    be: XmlAssertion,
    been: XmlAssertion,
    has: XmlAssertion,
    have: XmlAssertion,
    is: XmlAssertion,
    not: XmlAssertion,
    of: XmlAssertion,
    same: XmlAssertion,
    that: XmlAssertion,
    to: XmlAssertion,
    valid: js.Function0[XmlAssertion],
    which: XmlAssertion,
    `with`: XmlAssertion,
    xml: XmlAssertion
  ): XmlAssertion = {
    val __obj = js.Dynamic.literal(`with` = `with`)
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("at")(at)
    __obj.updateDynamic("be")(be)
    __obj.updateDynamic("been")(been)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("have")(have)
    __obj.updateDynamic("is")(is)
    __obj.updateDynamic("not")(not)
    __obj.updateDynamic("of")(of)
    __obj.updateDynamic("same")(same)
    __obj.updateDynamic("that")(that)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("valid")(valid)
    __obj.updateDynamic("which")(which)
    __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[XmlAssertion]
  }
}

