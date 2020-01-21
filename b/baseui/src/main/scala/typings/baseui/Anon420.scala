package typings.baseui

import typings.baseui.baseuiStrings.CZ
import typings.baseui.baseuiStrings.Plussign420
import typings.baseui.baseuiStrings.`Czech Republic LeftparenthesisČeská republikaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon420 extends js.Object {
  var dialCode: Plussign420
  var id: CZ
  var label: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`
}

object Anon420 {
  @scala.inline
  def apply(
    dialCode: Plussign420,
    id: CZ,
    label: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`
  ): Anon420 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon420]
  }
}

