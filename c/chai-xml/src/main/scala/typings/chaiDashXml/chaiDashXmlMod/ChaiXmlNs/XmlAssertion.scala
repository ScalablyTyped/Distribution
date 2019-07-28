package typings.chaiDashXml.chaiDashXmlMod.ChaiXmlNs

import typings.chaiDashXml.chaiDashXmlMod.Global.ChaiNs.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlAssertion extends Assertion {
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
    valid: () => XmlAssertion,
    which: XmlAssertion,
    `with`: XmlAssertion,
    xml: XmlAssertion
  ): XmlAssertion = {
    val __obj = js.Dynamic.literal(and = and, at = at, be = be, been = been, has = has, have = have, is = is, not = not, of = of, same = same, that = that, to = to, valid = js.Any.fromFunction0(valid), which = which, xml = xml)
    __obj.updateDynamic("with")(`with`)
    __obj.asInstanceOf[XmlAssertion]
  }
}

