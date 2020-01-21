package typings.baseui

import typings.baseui.baseuiStrings.Plussign255
import typings.baseui.baseuiStrings.TZ
import typings.baseui.baseuiStrings.Tanzania
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon255 extends js.Object {
  var dialCode: Plussign255
  var id: TZ
  var label: Tanzania
}

object Anon255 {
  @scala.inline
  def apply(dialCode: Plussign255, id: TZ, label: Tanzania): Anon255 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon255]
  }
}

