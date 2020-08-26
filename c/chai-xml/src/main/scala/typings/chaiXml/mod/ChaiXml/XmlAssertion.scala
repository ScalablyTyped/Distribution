package typings.chaiXml.mod.ChaiXml

import typings.chaiXml.mod.global.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlAssertion extends Assertion {
  var and: XmlAssertion = js.native
  var at: XmlAssertion = js.native
  var be: XmlAssertion = js.native
  var been: XmlAssertion = js.native
  var has: XmlAssertion = js.native
  var have: XmlAssertion = js.native
  var is: XmlAssertion = js.native
  var not: XmlAssertion = js.native
  var of: XmlAssertion = js.native
  var same: XmlAssertion = js.native
  var that: XmlAssertion = js.native
  var to: XmlAssertion = js.native
  var which: XmlAssertion = js.native
  var `with`: XmlAssertion = js.native
  def valid(): XmlAssertion = js.native
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
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valid = js.Any.fromFunction0(valid), which = which.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlAssertion]
  }
  @scala.inline
  implicit class XmlAssertionOps[Self <: XmlAssertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnd(value: XmlAssertion): Self = this.set("and", value.asInstanceOf[js.Any])
    @scala.inline
    def setAt(value: XmlAssertion): Self = this.set("at", value.asInstanceOf[js.Any])
    @scala.inline
    def setBe(value: XmlAssertion): Self = this.set("be", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeen(value: XmlAssertion): Self = this.set("been", value.asInstanceOf[js.Any])
    @scala.inline
    def setHas(value: XmlAssertion): Self = this.set("has", value.asInstanceOf[js.Any])
    @scala.inline
    def setHave(value: XmlAssertion): Self = this.set("have", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs(value: XmlAssertion): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def setNot(value: XmlAssertion): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def setOf(value: XmlAssertion): Self = this.set("of", value.asInstanceOf[js.Any])
    @scala.inline
    def setSame(value: XmlAssertion): Self = this.set("same", value.asInstanceOf[js.Any])
    @scala.inline
    def setThat(value: XmlAssertion): Self = this.set("that", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: XmlAssertion): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: () => XmlAssertion): Self = this.set("valid", js.Any.fromFunction0(value))
    @scala.inline
    def setWhich(value: XmlAssertion): Self = this.set("which", value.asInstanceOf[js.Any])
    @scala.inline
    def setWith(value: XmlAssertion): Self = this.set("with", value.asInstanceOf[js.Any])
  }
  
}

