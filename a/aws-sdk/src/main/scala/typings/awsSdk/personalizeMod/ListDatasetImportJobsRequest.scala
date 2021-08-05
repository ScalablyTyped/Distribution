package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetImportJobsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset to list the dataset import jobs for.
    */
  var datasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The maximum number of dataset import jobs to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A token returned from the previous call to ListDatasetImportJobs for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDatasetImportJobsRequest {
  
  inline def apply(): ListDatasetImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetImportJobsRequest]
  }
  
  extension [Self <: ListDatasetImportJobsRequest](x: Self) {
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "datasetArn", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
