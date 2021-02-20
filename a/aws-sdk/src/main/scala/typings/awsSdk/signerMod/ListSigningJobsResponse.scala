package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSigningJobsResponse extends StObject {
  
  /**
    * A list of your signing jobs.
    */
  var jobs: js.UndefOr[SigningJobs] = js.native
  
  /**
    * String for specifying the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListSigningJobsResponse {
  
  @scala.inline
  def apply(): ListSigningJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningJobsResponse]
  }
  
  @scala.inline
  implicit class ListSigningJobsResponseMutableBuilder[Self <: ListSigningJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: SigningJobs): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: SigningJob*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
