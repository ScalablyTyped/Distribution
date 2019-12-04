package typings.baseui

import typings.baseui.baseuiStrings.CA
import typings.baseui.baseuiStrings.Canada
import typings.baseui.baseuiStrings.`+1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1 extends js.Object {
  var dialCode: `+1`
  var id: CA
  var label: Canada
}

object Anon_1 {
  @scala.inline
  def apply(dialCode: `+1`, id: CA, label: Canada): Anon_1 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_1]
  }
}

