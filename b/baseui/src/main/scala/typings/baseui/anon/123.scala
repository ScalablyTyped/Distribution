package typings.baseui.anon

import typings.baseui.baseuiStrings.MV
import typings.baseui.baseuiStrings.Maldives
import typings.baseui.baseuiStrings.Plussign960
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `123` extends js.Object {
  var dialCode: Plussign960
  var id: MV
  var label: Maldives
}

object `123` {
  @scala.inline
  def apply(dialCode: Plussign960, id: MV, label: Maldives): `123` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`123`]
  }
}

