package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpenseCurrency extends StObject {
  
  /**
    * Currency code for detected currency. the current supported codes are:   USD   EUR   GBP   CAD   INR   JPY   CHF   AUD   CNY   BZR   SEK   HKD  
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * Percentage confideence in the detected currency.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
}
object ExpenseCurrency {
  
  inline def apply(): ExpenseCurrency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpenseCurrency]
  }
  
  extension [Self <: ExpenseCurrency](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
  }
}
