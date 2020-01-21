package typings.baseui

import typings.baseui.baseuiStrings.JM
import typings.baseui.baseuiStrings.Jamaica
import typings.baseui.baseuiStrings.Plussign1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1DialCode extends js.Object {
  var dialCode: Plussign1
  var id: JM
  var label: Jamaica
}

object Anon1DialCode {
  @scala.inline
  def apply(dialCode: Plussign1, id: JM, label: Jamaica): Anon1DialCode = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1DialCode]
  }
}

