package typings.coinbase.mod

import typings.coinbase.anon.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeRate extends StObject {
  
  var data: Currency
}
object ExchangeRate {
  
  inline def apply(data: Currency): ExchangeRate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeRate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExchangeRate] (val x: Self) extends AnyVal {
    
    inline def setData(value: Currency): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
