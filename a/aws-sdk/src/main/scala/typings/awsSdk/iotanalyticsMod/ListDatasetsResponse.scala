package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsResponse extends StObject {
  
  /**
    * A list of DatasetSummary objects.
    */
  var datasetSummaries: js.UndefOr[DatasetSummaries] = js.undefined
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDatasetsResponse {
  
  @scala.inline
  def apply(): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsResponse]
  }
  
  @scala.inline
  implicit class ListDatasetsResponseMutableBuilder[Self <: ListDatasetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetSummaries(value: DatasetSummaries): Self = StObject.set(x, "datasetSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetSummariesUndefined: Self = StObject.set(x, "datasetSummaries", js.undefined)
    
    @scala.inline
    def setDatasetSummariesVarargs(value: DatasetSummary*): Self = StObject.set(x, "datasetSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
