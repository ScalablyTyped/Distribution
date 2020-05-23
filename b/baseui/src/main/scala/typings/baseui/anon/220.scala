package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign256
import typings.baseui.baseuiStrings.UG
import typings.baseui.baseuiStrings.Uganda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `220` extends js.Object {
  var dialCode: Plussign256
  var id: UG
  var label: Uganda
}

object `220` {
  @scala.inline
  def apply(dialCode: Plussign256, id: UG, label: Uganda): `220` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`220`]
  }
}

