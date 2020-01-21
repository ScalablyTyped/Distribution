package typings.baseui

import typings.baseui.baseuiStrings.CU
import typings.baseui.baseuiStrings.Cuba
import typings.baseui.baseuiStrings.Plussign53
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon53 extends js.Object {
  var dialCode: Plussign53
  var id: CU
  var label: Cuba
}

object Anon53 {
  @scala.inline
  def apply(dialCode: Plussign53, id: CU, label: Cuba): Anon53 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon53]
  }
}

