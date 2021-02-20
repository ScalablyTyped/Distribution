package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHarvestJobsResponse extends StObject {
  
  /**
    * A list of HarvestJob records.
    */
  var HarvestJobs: js.UndefOr[listOfHarvestJob] = js.native
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListHarvestJobsResponse {
  
  @scala.inline
  def apply(): ListHarvestJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHarvestJobsResponse]
  }
  
  @scala.inline
  implicit class ListHarvestJobsResponseMutableBuilder[Self <: ListHarvestJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHarvestJobs(value: listOfHarvestJob): Self = StObject.set(x, "HarvestJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHarvestJobsUndefined: Self = StObject.set(x, "HarvestJobs", js.undefined)
    
    @scala.inline
    def setHarvestJobsVarargs(value: HarvestJob*): Self = StObject.set(x, "HarvestJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
