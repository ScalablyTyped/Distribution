package typings.baseui.anon

import typings.baseui.baseuiStrings.CA
import typings.baseui.baseuiStrings.Canada
import typings.baseui.baseuiStrings.Plussign1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `31` extends js.Object {
  var dialCode: Plussign1
  var id: CA
  var label: Canada
}

object `31` {
  @scala.inline
  def apply(dialCode: Plussign1, id: CA, label: Canada): `31` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`31`]
  }
}

