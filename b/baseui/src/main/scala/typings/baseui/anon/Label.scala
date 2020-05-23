package typings.baseui.anon

import typings.baseui.baseuiStrings.AL
import typings.baseui.baseuiStrings.Plussign355
import typings.baseui.baseuiStrings.`Albania LeftparenthesisShqipëriRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var dialCode: Plussign355
  var id: AL
  var label: `Albania LeftparenthesisShqipëriRightparenthesis`
}

object Label {
  @scala.inline
  def apply(dialCode: Plussign355, id: AL, label: `Albania LeftparenthesisShqipëriRightparenthesis`): Label = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

