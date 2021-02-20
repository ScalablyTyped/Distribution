package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsageStatisticsResponse extends StObject {
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
  
  /**
    * An array of objects that contains the results of the query. Each object contains the data for an account that meets the filter criteria specified in the request.
    */
  var records: js.UndefOr[listOfUsageRecord] = js.native
}
object GetUsageStatisticsResponse {
  
  @scala.inline
  def apply(): GetUsageStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageStatisticsResponse]
  }
  
  @scala.inline
  implicit class GetUsageStatisticsResponseMutableBuilder[Self <: GetUsageStatisticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRecords(value: listOfUsageRecord): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    @scala.inline
    def setRecordsVarargs(value: UsageRecord*): Self = StObject.set(x, "records", js.Array(value :_*))
  }
}
