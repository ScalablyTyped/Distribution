package typings.baseui.phoneInputMod

import typings.baseui.ReadonlyCountry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var country: ReadonlyCountry
  var text: js.UndefOr[String] = js.undefined
}

object State {
  @scala.inline
  def apply(country: ReadonlyCountry, text: String = null): State = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

