package typings.baseui.anon

import typings.baseui.baseuiStrings.AF
import typings.baseui.baseuiStrings.Plussign93
import typings.baseui.baseuiStrings.`Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialCode extends js.Object {
  var dialCode: Plussign93
  var id: AF
  var label: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`
}

object DialCode {
  @scala.inline
  def apply(dialCode: Plussign93, id: AF, label: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`): DialCode = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCode]
  }
}

