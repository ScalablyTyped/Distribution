package typings.baseui

import typings.baseui.baseuiStrings.CW
import typings.baseui.baseuiStrings.Curaçao
import typings.baseui.baseuiStrings.Plussign599
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon599 extends js.Object {
  var dialCode: Plussign599
  var id: CW
  var label: Curaçao
}

object Anon599 {
  @scala.inline
  def apply(dialCode: Plussign599, id: CW, label: Curaçao): Anon599 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon599]
  }
}

