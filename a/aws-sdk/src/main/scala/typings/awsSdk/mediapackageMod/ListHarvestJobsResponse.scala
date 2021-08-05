package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHarvestJobsResponse extends StObject {
  
  /**
    * A list of HarvestJob records.
    */
  var HarvestJobs: js.UndefOr[listOfHarvestJob] = js.undefined
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListHarvestJobsResponse {
  
  inline def apply(): ListHarvestJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHarvestJobsResponse]
  }
  
  extension [Self <: ListHarvestJobsResponse](x: Self) {
    
    inline def setHarvestJobs(value: listOfHarvestJob): Self = StObject.set(x, "HarvestJobs", value.asInstanceOf[js.Any])
    
    inline def setHarvestJobsUndefined: Self = StObject.set(x, "HarvestJobs", js.undefined)
    
    inline def setHarvestJobsVarargs(value: HarvestJob*): Self = StObject.set(x, "HarvestJobs", js.Array(value :_*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
