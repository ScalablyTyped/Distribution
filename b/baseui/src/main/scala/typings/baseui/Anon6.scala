package typings.baseui

import typings.baseui.baseuiStrings.AU
import typings.baseui.baseuiStrings.Australia
import typings.baseui.baseuiStrings.Plussign61
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon6 extends js.Object {
  var dialCode: Plussign61
  var id: AU
  var label: Australia
}

object Anon6 {
  @scala.inline
  def apply(dialCode: Plussign61, id: AU, label: Australia): Anon6 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon6]
  }
}

