package typings.baseui

import typings.baseui.baseuiStrings.MY
import typings.baseui.baseuiStrings.Malaysia
import typings.baseui.baseuiStrings.Plussign60
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon60 extends js.Object {
  var dialCode: Plussign60
  var id: MY
  var label: Malaysia
}

object Anon60 {
  @scala.inline
  def apply(dialCode: Plussign60, id: MY, label: Malaysia): Anon60 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon60]
  }
}

