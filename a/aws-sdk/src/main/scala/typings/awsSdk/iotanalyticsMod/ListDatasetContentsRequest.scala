package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetContentsRequest extends StObject {
  
  /**
    * The name of the data set whose contents information you want to list.
    */
  var datasetName: DatasetName
  
  /**
    * The maximum number of results to return in this request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A filter to limit results to those data set contents whose creation is scheduled before the given time. See the field triggers.schedule in the CreateDataset request. (timestamp)
    */
  var scheduledBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter to limit results to those data set contents whose creation is scheduled on or after the given time. See the field triggers.schedule in the CreateDataset request. (timestamp)
    */
  var scheduledOnOrAfter: js.UndefOr[Timestamp] = js.undefined
}
object ListDatasetContentsRequest {
  
  @scala.inline
  def apply(datasetName: DatasetName): ListDatasetContentsRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetContentsRequest]
  }
  
  @scala.inline
  implicit class ListDatasetContentsRequestMutableBuilder[Self <: ListDatasetContentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setScheduledBefore(value: Timestamp): Self = StObject.set(x, "scheduledBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledBeforeUndefined: Self = StObject.set(x, "scheduledBefore", js.undefined)
    
    @scala.inline
    def setScheduledOnOrAfter(value: Timestamp): Self = StObject.set(x, "scheduledOnOrAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledOnOrAfterUndefined: Self = StObject.set(x, "scheduledOnOrAfter", js.undefined)
  }
}
