package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageStatisticsResponse extends StObject {
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The usage statistics object. If a UsageStatisticType was provided, the objects representing other types will be null.
    */
  var UsageStatistics: js.UndefOr[typings.awsSdk.guarddutyMod.UsageStatistics] = js.undefined
}
object GetUsageStatisticsResponse {
  
  inline def apply(): GetUsageStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageStatisticsResponse]
  }
  
  extension [Self <: GetUsageStatisticsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUsageStatistics(value: UsageStatistics): Self = StObject.set(x, "UsageStatistics", value.asInstanceOf[js.Any])
    
    inline def setUsageStatisticsUndefined: Self = StObject.set(x, "UsageStatistics", js.undefined)
  }
}
