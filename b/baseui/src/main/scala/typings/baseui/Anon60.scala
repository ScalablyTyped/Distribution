package typings.baseui

import typings.baseui.baseuiStrings.ER
import typings.baseui.baseuiStrings.Eritrea
import typings.baseui.baseuiStrings.Plussign291
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon60 extends js.Object {
  var dialCode: Plussign291
  var id: ER
  var label: Eritrea
}

object Anon60 {
  @scala.inline
  def apply(dialCode: Plussign291, id: ER, label: Eritrea): Anon60 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon60]
  }
}

