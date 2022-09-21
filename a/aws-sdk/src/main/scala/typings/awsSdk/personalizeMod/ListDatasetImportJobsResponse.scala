package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetImportJobsResponse extends StObject {
  
  /**
    * The list of dataset import jobs.
    */
  var datasetImportJobs: js.UndefOr[DatasetImportJobs] = js.undefined
  
  /**
    * A token for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDatasetImportJobsResponse {
  
  inline def apply(): ListDatasetImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetImportJobsResponse]
  }
  
  extension [Self <: ListDatasetImportJobsResponse](x: Self) {
    
    inline def setDatasetImportJobs(value: DatasetImportJobs): Self = StObject.set(x, "datasetImportJobs", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobsUndefined: Self = StObject.set(x, "datasetImportJobs", js.undefined)
    
    inline def setDatasetImportJobsVarargs(value: DatasetImportJobSummary*): Self = StObject.set(x, "datasetImportJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
