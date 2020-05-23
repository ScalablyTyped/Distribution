package typings.baseui.anon

import typings.baseui.baseuiStrings.ID
import typings.baseui.baseuiStrings.Indonesia
import typings.baseui.baseuiStrings.Plussign62
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `92` extends js.Object {
  var dialCode: Plussign62
  var id: ID
  var label: Indonesia
}

object `92` {
  @scala.inline
  def apply(dialCode: Plussign62, id: ID, label: Indonesia): `92` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`92`]
  }
}

