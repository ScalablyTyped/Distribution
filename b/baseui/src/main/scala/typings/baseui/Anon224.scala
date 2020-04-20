package typings.baseui

import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.US
import typings.baseui.baseuiStrings.`United States`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon224 extends js.Object {
  var dialCode: Plussign1
  var id: US
  var label: `United States`
}

object Anon224 {
  @scala.inline
  def apply(dialCode: Plussign1, id: US, label: `United States`): Anon224 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon224]
  }
}

