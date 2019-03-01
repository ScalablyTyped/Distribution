package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Option extends js.Object {
  var option: ckeditorLib.CKEDITORNs.htmlParserNs.ruleOptions
  var priority: scala.Double
  var value: ckeditorLib.CKEDITORNs.htmlParserNs.rule
}

object Anon_Option {
  @scala.inline
  def apply(
    option: ckeditorLib.CKEDITORNs.htmlParserNs.ruleOptions,
    priority: scala.Double,
    value: ckeditorLib.CKEDITORNs.htmlParserNs.rule
  ): Anon_Option = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("option")(option)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Option]
  }
}

