package typings.baseui

import typings.baseui.baseuiStrings.JP
import typings.baseui.baseuiStrings.Plussign81
import typings.baseui.baseuiStrings.`Japan Leftparenthesis日本Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon81 extends js.Object {
  var dialCode: Plussign81
  var id: JP
  var label: `Japan Leftparenthesis日本Rightparenthesis`
}

object Anon81 {
  @scala.inline
  def apply(dialCode: Plussign81, id: JP, label: `Japan Leftparenthesis日本Rightparenthesis`): Anon81 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon81]
  }
}

