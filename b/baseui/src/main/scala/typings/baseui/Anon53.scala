package typings.baseui

import typings.baseui.baseuiStrings.DJ
import typings.baseui.baseuiStrings.Djibouti
import typings.baseui.baseuiStrings.Plussign253
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon53 extends js.Object {
  var dialCode: Plussign253
  var id: DJ
  var label: Djibouti
}

object Anon53 {
  @scala.inline
  def apply(dialCode: Plussign253, id: DJ, label: Djibouti): Anon53 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon53]
  }
}

