package typings.baseui

import typings.baseui.baseuiStrings.BS
import typings.baseui.baseuiStrings.Bahamas
import typings.baseui.baseuiStrings.Plussign1242
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon9 extends js.Object {
  var dialCode: Plussign1242
  var id: BS
  var label: Bahamas
}

object Anon9 {
  @scala.inline
  def apply(dialCode: Plussign1242, id: BS, label: Bahamas): Anon9 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon9]
  }
}

