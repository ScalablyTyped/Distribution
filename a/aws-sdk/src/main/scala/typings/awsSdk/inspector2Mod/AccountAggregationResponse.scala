package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAggregationResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The number of findings by severity.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object AccountAggregationResponse {
  
  inline def apply(): AccountAggregationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAggregationResponse]
  }
  
  extension [Self <: AccountAggregationResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
