package typings.coinlist

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoinsDotjsonMod extends Shortcut {
  
  @JSImport("coinlist/src/coins.json", JSImport.Namespace)
  @js.native
  val ^ : js.Array[Coin] = js.native
  
  trait Coin extends StObject {
    
    var id: String
    
    var name: String
    
    var symbol: String
  }
  object Coin {
    
    inline def apply(id: String, name: String, symbol: String): Coin = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Coin] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Array[Coin]
  
  /* This means you don't have to write `^`, but can instead just say `srcCoinsDotjsonMod.foo` */
  override def _to: js.Array[Coin] = ^
}
