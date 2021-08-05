package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventTrackersRequest extends StObject {
  
  /**
    * The ARN of a dataset group used to filter the response.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The maximum number of event trackers to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A token returned from the previous call to ListEventTrackers for getting the next set of event trackers (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEventTrackersRequest {
  
  inline def apply(): ListEventTrackersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTrackersRequest]
  }
  
  extension [Self <: ListEventTrackersRequest](x: Self) {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
