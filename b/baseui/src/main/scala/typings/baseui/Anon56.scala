package typings.baseui

import typings.baseui.baseuiStrings.CL
import typings.baseui.baseuiStrings.Chile
import typings.baseui.baseuiStrings.Plussign56
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon56 extends js.Object {
  var dialCode: Plussign56
  var id: CL
  var label: Chile
}

object Anon56 {
  @scala.inline
  def apply(dialCode: Plussign56, id: CL, label: Chile): Anon56 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon56]
  }
}

