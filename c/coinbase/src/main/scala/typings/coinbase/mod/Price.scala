package typings.coinbase.mod

import typings.coinbase.anon.Amount
import typings.coinbase.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  var data: Amount
  var warnings: js.UndefOr[js.Array[Id]] = js.undefined
}

object Price {
  @scala.inline
  def apply(data: Amount, warnings: js.Array[Id] = null): Price = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
}

