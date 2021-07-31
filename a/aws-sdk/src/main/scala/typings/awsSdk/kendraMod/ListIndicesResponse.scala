package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndicesResponse extends StObject {
  
  /**
    * An array of summary information for one or more indexes.
    */
  var IndexConfigurationSummaryItems: js.UndefOr[IndexConfigurationSummaryList] = js.undefined
  
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of indexes.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.undefined
}
object ListIndicesResponse {
  
  @scala.inline
  def apply(): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesResponse]
  }
  
  @scala.inline
  implicit class ListIndicesResponseMutableBuilder[Self <: ListIndicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexConfigurationSummaryItems(value: IndexConfigurationSummaryList): Self = StObject.set(x, "IndexConfigurationSummaryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexConfigurationSummaryItemsUndefined: Self = StObject.set(x, "IndexConfigurationSummaryItems", js.undefined)
    
    @scala.inline
    def setIndexConfigurationSummaryItemsVarargs(value: IndexConfigurationSummary*): Self = StObject.set(x, "IndexConfigurationSummaryItems", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
