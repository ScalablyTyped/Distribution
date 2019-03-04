package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  var data: coinbaseLib.Anon_Amount
  var warnings: js.UndefOr[js.Array[coinbaseLib.Anon_Id]] = js.undefined
}

object Price {
  @scala.inline
  def apply(data: coinbaseLib.Anon_Amount, warnings: js.Array[coinbaseLib.Anon_Id] = null): Price = {
    val __obj = js.Dynamic.literal(data = data)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[Price]
  }
}

