package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageTotalsResponse extends StObject {
  
  /**
    * An array of objects that contains the results of the query. Each object contains the data for a specific usage metric.
    */
  var usageTotals: js.UndefOr[listOfUsageTotal] = js.undefined
}
object GetUsageTotalsResponse {
  
  inline def apply(): GetUsageTotalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageTotalsResponse]
  }
  
  extension [Self <: GetUsageTotalsResponse](x: Self) {
    
    inline def setUsageTotals(value: listOfUsageTotal): Self = StObject.set(x, "usageTotals", value.asInstanceOf[js.Any])
    
    inline def setUsageTotalsUndefined: Self = StObject.set(x, "usageTotals", js.undefined)
    
    inline def setUsageTotalsVarargs(value: UsageTotal*): Self = StObject.set(x, "usageTotals", js.Array(value :_*))
  }
}
