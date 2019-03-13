package typings
package boxenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hex extends js.Object {
  var hex: js.UndefOr[js.Any] = js.undefined
}

object Anon_Hex {
  @scala.inline
  def apply(hex: js.Any = null): Anon_Hex = {
    val __obj = js.Dynamic.literal()
    if (hex != null) __obj.updateDynamic("hex")(hex)
    __obj.asInstanceOf[Anon_Hex]
  }
}

