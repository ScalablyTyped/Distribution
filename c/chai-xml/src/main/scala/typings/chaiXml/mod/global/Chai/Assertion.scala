package typings.chaiXml.mod.global.Chai

import typings.chaiXml.mod.ChaiXml.XmlAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  var xml: XmlAssertion = js.native
}

object Assertion {
  @scala.inline
  def apply(xml: XmlAssertion): Assertion = {
    val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assertion]
  }
  @scala.inline
  implicit class AssertionOps[Self <: Assertion] (val x: Self) extends AnyVal {
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
    def setXml(value: XmlAssertion): Self = this.set("xml", value.asInstanceOf[js.Any])
  }
  
}

