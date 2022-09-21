package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetImportJobsResponse extends StObject {
  
  /**
    * An array of objects that summarize each dataset import job's properties.
    */
  var DatasetImportJobs: js.UndefOr[typings.awsSdk.forecastserviceMod.DatasetImportJobs] = js.undefined
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.undefined
}
object ListDatasetImportJobsResponse {
  
  inline def apply(): ListDatasetImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetImportJobsResponse]
  }
  
  extension [Self <: ListDatasetImportJobsResponse](x: Self) {
    
    inline def setDatasetImportJobs(value: DatasetImportJobs): Self = StObject.set(x, "DatasetImportJobs", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobsUndefined: Self = StObject.set(x, "DatasetImportJobs", js.undefined)
    
    inline def setDatasetImportJobsVarargs(value: DatasetImportJobSummary*): Self = StObject.set(x, "DatasetImportJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
