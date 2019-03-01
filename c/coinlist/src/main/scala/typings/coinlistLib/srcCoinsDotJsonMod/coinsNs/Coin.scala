package typings
package coinlistLib.srcCoinsDotJsonMod.coinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coin extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var symbol: java.lang.String
}

object Coin {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, symbol: java.lang.String): Coin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[Coin]
  }
}

