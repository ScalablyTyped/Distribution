package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetContentsResponse extends StObject {
  
  /**
    * Summary information about data set contents that have been created.
    */
  var datasetContentSummaries: js.UndefOr[DatasetContentSummaries] = js.undefined
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDatasetContentsResponse {
  
  @scala.inline
  def apply(): ListDatasetContentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetContentsResponse]
  }
  
  @scala.inline
  implicit class ListDatasetContentsResponseMutableBuilder[Self <: ListDatasetContentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetContentSummaries(value: DatasetContentSummaries): Self = StObject.set(x, "datasetContentSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetContentSummariesUndefined: Self = StObject.set(x, "datasetContentSummaries", js.undefined)
    
    @scala.inline
    def setDatasetContentSummariesVarargs(value: DatasetContentSummary*): Self = StObject.set(x, "datasetContentSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
