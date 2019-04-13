package typings
package coinlistLib.coinlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoinsAPI extends js.Object {
  def get(symbol: java.lang.String): js.UndefOr[Coin] = js.native
  @JSName("get")
  def get_id(symbol: java.lang.String, property: coinlistLib.coinlistLibStrings.id): js.UndefOr[java.lang.String] = js.native
  @JSName("get")
  def get_name(symbol: java.lang.String, property: coinlistLib.coinlistLibStrings.name): js.UndefOr[java.lang.String] = js.native
  @JSName("get")
  def get_symbol(symbol: java.lang.String, property: coinlistLib.coinlistLibStrings.symbol): js.UndefOr[java.lang.String] = js.native
}

