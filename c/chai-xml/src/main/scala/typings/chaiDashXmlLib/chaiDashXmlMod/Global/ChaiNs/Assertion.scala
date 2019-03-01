package typings
package chaiDashXmlLib.chaiDashXmlMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  var xml: chaiDashXmlLib.chaiDashXmlMod.ChaiXmlNs.XmlAssertion
}

object Assertion {
  @scala.inline
  def apply(xml: chaiDashXmlLib.chaiDashXmlMod.ChaiXmlNs.XmlAssertion): Assertion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[Assertion]
  }
}

