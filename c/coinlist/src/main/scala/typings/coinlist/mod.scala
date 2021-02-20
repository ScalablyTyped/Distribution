package typings.coinlist

import org.scalablytyped.runtime.Shortcut
import typings.coinlist.coinlistStrings.id
import typings.coinlist.coinlistStrings.name
import typings.coinlist.coinlistStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("coinlist", JSImport.Namespace)
  @js.native
  val ^ : js.Array[Coin] with CoinsAPI = js.native
  
  type Coin = typings.coinlist.coinsJsonMod.Coin
  
  @js.native
  trait CoinsAPI extends StObject {
    
    def get(symbol: String): js.UndefOr[Coin] = js.native
    @JSName("get")
    def get_id(symbol: String, property: id): js.UndefOr[String] = js.native
    @JSName("get")
    def get_name(symbol: String, property: name): js.UndefOr[String] = js.native
    @JSName("get")
    def get_symbol(symbol: String, property: symbol): js.UndefOr[String] = js.native
  }
  
  type _To = js.Array[Coin] with CoinsAPI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Array[Coin] with CoinsAPI = ^
}
