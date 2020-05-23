package typings.baseui.anon

import typings.baseui.baseuiStrings.PH
import typings.baseui.baseuiStrings.Philippines
import typings.baseui.baseuiStrings.Plussign63
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `163` extends js.Object {
  var dialCode: Plussign63
  var id: PH
  var label: Philippines
}

object `163` {
  @scala.inline
  def apply(dialCode: Plussign63, id: PH, label: Philippines): `163` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`163`]
  }
}

