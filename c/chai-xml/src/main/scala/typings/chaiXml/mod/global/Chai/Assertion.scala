package typings.chaiXml.mod.global.Chai

import typings.chaiXml.mod.ChaiXml.XmlAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  var xml: XmlAssertion
}

object Assertion {
  @scala.inline
  def apply(xml: XmlAssertion): Assertion = {
    val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assertion]
  }
}

