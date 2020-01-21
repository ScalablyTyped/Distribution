package typings.baseui

import typings.baseui.baseuiStrings.Plussign250
import typings.baseui.baseuiStrings.RW
import typings.baseui.baseuiStrings.Rwanda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon250 extends js.Object {
  var dialCode: Plussign250
  var id: RW
  var label: Rwanda
}

object Anon250 {
  @scala.inline
  def apply(dialCode: Plussign250, id: RW, label: Rwanda): Anon250 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon250]
  }
}

