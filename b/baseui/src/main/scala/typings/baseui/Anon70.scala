package typings.baseui

import typings.baseui.baseuiStrings.GA
import typings.baseui.baseuiStrings.Gabon
import typings.baseui.baseuiStrings.Plussign241
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon70 extends js.Object {
  var dialCode: Plussign241
  var id: GA
  var label: Gabon
}

object Anon70 {
  @scala.inline
  def apply(dialCode: Plussign241, id: GA, label: Gabon): Anon70 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon70]
  }
}

