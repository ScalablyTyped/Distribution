package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/phone-input.State> */
trait ReadonlyState extends js.Object {
  val country: ReadonlyCountry
  val text: js.UndefOr[String] = js.undefined
}

object ReadonlyState {
  @scala.inline
  def apply(country: ReadonlyCountry, text: String = null): ReadonlyState = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
}

