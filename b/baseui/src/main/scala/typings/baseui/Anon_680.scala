package typings.baseui

import typings.baseui.baseuiStrings.PW
import typings.baseui.baseuiStrings.Palau
import typings.baseui.baseuiStrings.Plussign680
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_680 extends js.Object {
  var dialCode: Plussign680
  var id: PW
  var label: Palau
}

object Anon_680 {
  @scala.inline
  def apply(dialCode: Plussign680, id: PW, label: Palau): Anon_680 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_680]
  }
}

