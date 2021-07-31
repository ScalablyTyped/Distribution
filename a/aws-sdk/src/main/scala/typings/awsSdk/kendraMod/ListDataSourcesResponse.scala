package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSourcesResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of data sources. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.undefined
  
  /**
    * An array of summary information for one or more data sources.
    */
  var SummaryItems: js.UndefOr[DataSourceSummaryList] = js.undefined
}
object ListDataSourcesResponse {
  
  @scala.inline
  def apply(): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
  
  @scala.inline
  implicit class ListDataSourcesResponseMutableBuilder[Self <: ListDataSourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSummaryItems(value: DataSourceSummaryList): Self = StObject.set(x, "SummaryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryItemsUndefined: Self = StObject.set(x, "SummaryItems", js.undefined)
    
    @scala.inline
    def setSummaryItemsVarargs(value: DataSourceSummary*): Self = StObject.set(x, "SummaryItems", js.Array(value :_*))
  }
}
