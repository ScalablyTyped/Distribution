package typings.coinbase.mod

import typings.coinbase.anon.Minsize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currencies extends StObject {
  
  var data: js.Array[Minsize]
}
object Currencies {
  
  @scala.inline
  def apply(data: js.Array[Minsize]): Currencies = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currencies]
  }
  
  @scala.inline
  implicit class CurrenciesMutableBuilder[Self <: Currencies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Minsize]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Minsize*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
