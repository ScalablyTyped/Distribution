package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalCharges
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The aggregate total of account level charges for the period covered by the invoice
    */
  var totalCharges: String
  
  /**
    * The aggregate total of account level discounts or credits for the period covered by the invoice
    */
  var totalDiscounts: String
  
  /**
    * The total GST for all account level charges.  If absent then zero is assumed
    */
  var totalGst: js.UndefOr[String | Null] = js.undefined
}
object TotalCharges {
  
  inline def apply(totalCharges: String, totalDiscounts: String): TotalCharges = {
    val __obj = js.Dynamic.literal(totalCharges = totalCharges.asInstanceOf[js.Any], totalDiscounts = totalDiscounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalCharges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotalCharges] (val x: Self) extends AnyVal {
    
    inline def setTotalCharges(value: String): Self = StObject.set(x, "totalCharges", value.asInstanceOf[js.Any])
    
    inline def setTotalDiscounts(value: String): Self = StObject.set(x, "totalDiscounts", value.asInstanceOf[js.Any])
    
    inline def setTotalGst(value: String): Self = StObject.set(x, "totalGst", value.asInstanceOf[js.Any])
    
    inline def setTotalGstNull: Self = StObject.set(x, "totalGst", null)
    
    inline def setTotalGstUndefined: Self = StObject.set(x, "totalGst", js.undefined)
  }
}
