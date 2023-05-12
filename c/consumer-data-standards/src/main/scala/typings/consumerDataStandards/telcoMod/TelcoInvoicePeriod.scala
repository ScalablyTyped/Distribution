package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoInvoicePeriod
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The end date of the period covered by this invoice
    */
  var endDate: String
  
  /**
    * The start date of the period covered by this invoice
    */
  var startDate: String
}
object TelcoInvoicePeriod {
  
  inline def apply(endDate: String, startDate: String): TelcoInvoicePeriod = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoInvoicePeriod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoInvoicePeriod] (val x: Self) extends AnyVal {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
