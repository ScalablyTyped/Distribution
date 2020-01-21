package typings.baseui

import typings.baseui.baseuiStrings.ET
import typings.baseui.baseuiStrings.Ethiopia
import typings.baseui.baseuiStrings.Plussign251
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon251 extends js.Object {
  var dialCode: Plussign251
  var id: ET
  var label: Ethiopia
}

object Anon251 {
  @scala.inline
  def apply(dialCode: Plussign251, id: ET, label: Ethiopia): Anon251 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon251]
  }
}

