package typings.baseui.anon

import typings.baseui.baseuiStrings.AS
import typings.baseui.baseuiStrings.Plussign1684
import typings.baseui.baseuiStrings.`American Samoa`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdLabel extends js.Object {
  var dialCode: Plussign1684
  var id: AS
  var label: `American Samoa`
}

object IdLabel {
  @scala.inline
  def apply(dialCode: Plussign1684, id: AS, label: `American Samoa`): IdLabel = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdLabel]
  }
}

