package typings.baseui

import typings.baseui.baseuiStrings.BN
import typings.baseui.baseuiStrings.Brunei
import typings.baseui.baseuiStrings.Plussign673
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon25 extends js.Object {
  var dialCode: Plussign673
  var id: BN
  var label: Brunei
}

object Anon25 {
  @scala.inline
  def apply(dialCode: Plussign673, id: BN, label: Brunei): Anon25 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon25]
  }
}

