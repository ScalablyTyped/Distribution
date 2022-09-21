package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PercentGreen
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The amount of the charge if the type implies the application of a fixed amount
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * The upper percentage of green power used applicable for this tier
    */
  var percentGreen: String
  
  /**
    * The rate of the charge if the type implies the application of a rate
    */
  var rate: js.UndefOr[String] = js.undefined
}
object PercentGreen {
  
  inline def apply(percentGreen: String): PercentGreen = {
    val __obj = js.Dynamic.literal(percentGreen = percentGreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentGreen]
  }
  
  extension [Self <: PercentGreen](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setPercentGreen(value: String): Self = StObject.set(x, "percentGreen", value.asInstanceOf[js.Any])
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
  }
}
