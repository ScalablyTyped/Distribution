package typings.baseui

import typings.baseui.baseuiStrings.DE
import typings.baseui.baseuiStrings.`+49`
import typings.baseui.baseuiStrings.`Germany (Deutschland)`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_49 extends js.Object {
  var dialCode: `+49`
  var id: DE
  var label: `Germany (Deutschland)`
}

object Anon_49 {
  @scala.inline
  def apply(dialCode: `+49`, id: DE, label: `Germany (Deutschland)`): Anon_49 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_49]
  }
}

