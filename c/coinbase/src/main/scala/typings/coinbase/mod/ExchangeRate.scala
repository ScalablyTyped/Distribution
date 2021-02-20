package typings.coinbase.mod

import typings.coinbase.anon.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeRate extends StObject {
  
  var data: Currency = js.native
}
object ExchangeRate {
  
  @scala.inline
  def apply(data: Currency): ExchangeRate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeRate]
  }
  
  @scala.inline
  implicit class ExchangeRateMutableBuilder[Self <: ExchangeRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Currency): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
