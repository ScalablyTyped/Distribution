package typings.baseui

import typings.baseui.baseuiStrings.AI
import typings.baseui.baseuiStrings.Anguilla
import typings.baseui.baseuiStrings.Plussign1264
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var dialCode: Plussign1264
  var id: AI
  var label: Anguilla
}

object Anon1 {
  @scala.inline
  def apply(dialCode: Plussign1264, id: AI, label: Anguilla): Anon1 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1]
  }
}

