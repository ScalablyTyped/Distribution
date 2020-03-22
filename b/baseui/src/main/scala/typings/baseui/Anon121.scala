package typings.baseui

import typings.baseui.baseuiStrings.MW
import typings.baseui.baseuiStrings.Malawi
import typings.baseui.baseuiStrings.Plussign265
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon121 extends js.Object {
  var dialCode: Plussign265
  var id: MW
  var label: Malawi
}

object Anon121 {
  @scala.inline
  def apply(dialCode: Plussign265, id: MW, label: Malawi): Anon121 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon121]
  }
}

