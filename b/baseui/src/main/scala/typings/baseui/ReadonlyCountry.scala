package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/phone-input.Country> */
trait ReadonlyCountry extends js.Object {
  val dialCode: String
  val id: String
  val label: String
}

object ReadonlyCountry {
  @scala.inline
  def apply(dialCode: String, id: String, label: String): ReadonlyCountry = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyCountry]
  }
}

