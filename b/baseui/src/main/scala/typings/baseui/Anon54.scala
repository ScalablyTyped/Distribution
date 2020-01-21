package typings.baseui

import typings.baseui.baseuiStrings.AR
import typings.baseui.baseuiStrings.Argentina
import typings.baseui.baseuiStrings.Plussign54
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon54 extends js.Object {
  var dialCode: Plussign54
  var id: AR
  var label: Argentina
}

object Anon54 {
  @scala.inline
  def apply(dialCode: Plussign54, id: AR, label: Argentina): Anon54 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon54]
  }
}

