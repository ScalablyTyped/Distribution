package typings.baseui.anon

import typings.baseui.baseuiStrings.JM
import typings.baseui.baseuiStrings.Jamaica
import typings.baseui.baseuiStrings.Plussign1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `99` extends js.Object {
  var dialCode: Plussign1
  var id: JM
  var label: Jamaica
}

object `99` {
  @scala.inline
  def apply(dialCode: Plussign1, id: JM, label: Jamaica): `99` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`99`]
  }
}

