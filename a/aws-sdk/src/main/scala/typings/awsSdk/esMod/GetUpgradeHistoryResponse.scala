package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUpgradeHistoryResponse extends StObject {
  
  /**
    * Pagination token that needs to be supplied to the next call to get the next page of results
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  A list of  UpgradeHistory  objects corresponding to each Upgrade or Upgrade Eligibility Check performed on a domain returned as part of  GetUpgradeHistoryResponse  object. 
    */
  var UpgradeHistories: js.UndefOr[UpgradeHistoryList] = js.undefined
}
object GetUpgradeHistoryResponse {
  
  inline def apply(): GetUpgradeHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpgradeHistoryResponse]
  }
  
  extension [Self <: GetUpgradeHistoryResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUpgradeHistories(value: UpgradeHistoryList): Self = StObject.set(x, "UpgradeHistories", value.asInstanceOf[js.Any])
    
    inline def setUpgradeHistoriesUndefined: Self = StObject.set(x, "UpgradeHistories", js.undefined)
    
    inline def setUpgradeHistoriesVarargs(value: UpgradeHistory*): Self = StObject.set(x, "UpgradeHistories", js.Array(value*))
  }
}
