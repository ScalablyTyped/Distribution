package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalDiscounts
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Optional array of charges that may be part of the invoice (for example services fees) (exclusive of GST)
    */
  var otherCharges: js.UndefOr[DictkAmountDescription] = js.undefined
  
  /**
    * The aggregate total of account level discounts or credits for the period covered by the invoice
    */
  var totalDiscounts: String
  
  /**
    * The total GST for all account level charges.  If absent then zero is assumed
    */
  var totalGst: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The aggregate total of any once off charges arising from usage for the period covered by the invoice (exclusive of GST)
    */
  var totalOnceOffCharges: String
  
  /**
    * The aggregate total of usage charges for the period covered by the invoice (exclusive of GST)
    */
  var totalUsageCharges: String
}
object TotalDiscounts {
  
  inline def apply(totalDiscounts: String, totalOnceOffCharges: String, totalUsageCharges: String): TotalDiscounts = {
    val __obj = js.Dynamic.literal(totalDiscounts = totalDiscounts.asInstanceOf[js.Any], totalOnceOffCharges = totalOnceOffCharges.asInstanceOf[js.Any], totalUsageCharges = totalUsageCharges.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalDiscounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotalDiscounts] (val x: Self) extends AnyVal {
    
    inline def setOtherCharges(value: DictkAmountDescription): Self = StObject.set(x, "otherCharges", value.asInstanceOf[js.Any])
    
    inline def setOtherChargesUndefined: Self = StObject.set(x, "otherCharges", js.undefined)
    
    inline def setTotalDiscounts(value: String): Self = StObject.set(x, "totalDiscounts", value.asInstanceOf[js.Any])
    
    inline def setTotalGst(value: String): Self = StObject.set(x, "totalGst", value.asInstanceOf[js.Any])
    
    inline def setTotalGstNull: Self = StObject.set(x, "totalGst", null)
    
    inline def setTotalGstUndefined: Self = StObject.set(x, "totalGst", js.undefined)
    
    inline def setTotalOnceOffCharges(value: String): Self = StObject.set(x, "totalOnceOffCharges", value.asInstanceOf[js.Any])
    
    inline def setTotalUsageCharges(value: String): Self = StObject.set(x, "totalUsageCharges", value.asInstanceOf[js.Any])
  }
}
