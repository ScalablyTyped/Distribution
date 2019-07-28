package typings.coinlist.srcCoinsDotJsonMod

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
    val __obj = js.Dynamic.literal(id = id, name = name, symbol = symbol)
  
    __obj.asInstanceOf[Coin]
  }
}

