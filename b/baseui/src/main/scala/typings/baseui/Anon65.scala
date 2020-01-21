package typings.baseui

import typings.baseui.baseuiStrings.Plussign65
import typings.baseui.baseuiStrings.SG
import typings.baseui.baseuiStrings.Singapore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon65 extends js.Object {
  var dialCode: Plussign65
  var id: SG
  var label: Singapore
}

object Anon65 {
  @scala.inline
  def apply(dialCode: Plussign65, id: SG, label: Singapore): Anon65 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon65]
  }
}

