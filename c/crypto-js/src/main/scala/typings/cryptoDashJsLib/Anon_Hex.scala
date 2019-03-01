package typings
package cryptoDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hex extends js.Object {
  var Hex: js.Any
  var OpenSSL: js.Any
}

object Anon_Hex {
  @scala.inline
  def apply(Hex: js.Any, OpenSSL: js.Any): Anon_Hex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Hex")(Hex)
    __obj.updateDynamic("OpenSSL")(OpenSSL)
    __obj.asInstanceOf[Anon_Hex]
  }
}

