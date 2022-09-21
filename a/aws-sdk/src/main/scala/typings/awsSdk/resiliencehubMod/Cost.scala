package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cost extends StObject {
  
  /**
    * The cost amount.
    */
  var amount: Double
  
  /**
    * The cost currency, for example USD.
    */
  var currency: CurrencyCode
  
  /**
    * The cost frequency.
    */
  var frequency: CostFrequency
}
object Cost {
  
  inline def apply(amount: Double, currency: CurrencyCode, frequency: CostFrequency): Cost = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cost]
  }
  
  extension [Self <: Cost](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: CurrencyCode): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: CostFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
  }
}
