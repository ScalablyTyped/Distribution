package typings.baseui

import typings.baseui.baseuiStrings.Plussign256
import typings.baseui.baseuiStrings.UG
import typings.baseui.baseuiStrings.Uganda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_256 extends js.Object {
  var dialCode: Plussign256
  var id: UG
  var label: Uganda
}

object Anon_256 {
  @scala.inline
  def apply(dialCode: Plussign256, id: UG, label: Uganda): Anon_256 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_256]
  }
}

