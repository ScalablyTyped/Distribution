package typings.baseui

import typings.baseui.baseuiStrings.MV
import typings.baseui.baseuiStrings.Maldives
import typings.baseui.baseuiStrings.Plussign960
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon960 extends js.Object {
  var dialCode: Plussign960
  var id: MV
  var label: Maldives
}

object Anon960 {
  @scala.inline
  def apply(dialCode: Plussign960, id: MV, label: Maldives): Anon960 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon960]
  }
}

