package typings.checCommerceJs

import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOrderTaxLineMod {
  
  trait OrderTaxLine extends StObject {
    
    var amount: Price
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var rate_percentage: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object OrderTaxLine {
    
    inline def apply(amount: Price, `type`: String): OrderTaxLine = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrderTaxLine]
    }
    
    extension [Self <: OrderTaxLine](x: Self) {
      
      inline def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setRate_percentage(value: String): Self = StObject.set(x, "rate_percentage", value.asInstanceOf[js.Any])
      
      inline def setRate_percentageUndefined: Self = StObject.set(x, "rate_percentage", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
