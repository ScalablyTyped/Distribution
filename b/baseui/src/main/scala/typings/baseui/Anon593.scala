package typings.baseui

import typings.baseui.baseuiStrings.EC
import typings.baseui.baseuiStrings.Ecuador
import typings.baseui.baseuiStrings.Plussign593
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon593 extends js.Object {
  var dialCode: Plussign593
  var id: EC
  var label: Ecuador
}

object Anon593 {
  @scala.inline
  def apply(dialCode: Plussign593, id: EC, label: Ecuador): Anon593 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon593]
  }
}

