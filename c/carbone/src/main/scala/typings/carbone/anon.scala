package typings.carbone

import typings.carbone.mod.CurrencyRates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Rates extends StObject {
    
    var rates: CurrencyRates
    
    var source: String
    
    var target: String
  }
  object Rates {
    
    @scala.inline
    def apply(rates: CurrencyRates, source: String, target: String): Rates = {
      val __obj = js.Dynamic.literal(rates = rates.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rates]
    }
    
    @scala.inline
    implicit class RatesMutableBuilder[Self <: Rates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRates(value: CurrencyRates): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
