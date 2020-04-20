package typings.coinlist.coinsJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coin extends js.Object {
  var id: String
  var name: String
  var symbol: String
}

object Coin {
  @scala.inline
  def apply(id: String, name: String, symbol: String): Coin = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coin]
  }
}

