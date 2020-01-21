package typings.baseui

import typings.baseui.baseuiStrings.Plussign58
import typings.baseui.baseuiStrings.VE
import typings.baseui.baseuiStrings.Venezuela
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon58 extends js.Object {
  var dialCode: Plussign58
  var id: VE
  var label: Venezuela
}

object Anon58 {
  @scala.inline
  def apply(dialCode: Plussign58, id: VE, label: Venezuela): Anon58 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon58]
  }
}

