package typings.baseui.anon

import typings.baseui.baseuiStrings.JE
import typings.baseui.baseuiStrings.Jersey
import typings.baseui.baseuiStrings.Plussign44
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `101` extends js.Object {
  var dialCode: Plussign44
  var id: JE
  var label: Jersey
}

object `101` {
  @scala.inline
  def apply(dialCode: Plussign44, id: JE, label: Jersey): `101` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`101`]
  }
}

