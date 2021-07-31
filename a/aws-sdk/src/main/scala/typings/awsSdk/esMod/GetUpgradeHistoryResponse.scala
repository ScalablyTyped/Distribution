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
  
  @scala.inline
  def apply(): GetUpgradeHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpgradeHistoryResponse]
  }
  
  @scala.inline
  implicit class GetUpgradeHistoryResponseMutableBuilder[Self <: GetUpgradeHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUpgradeHistories(value: UpgradeHistoryList): Self = StObject.set(x, "UpgradeHistories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeHistoriesUndefined: Self = StObject.set(x, "UpgradeHistories", js.undefined)
    
    @scala.inline
    def setUpgradeHistoriesVarargs(value: UpgradeHistory*): Self = StObject.set(x, "UpgradeHistories", js.Array(value :_*))
  }
}
