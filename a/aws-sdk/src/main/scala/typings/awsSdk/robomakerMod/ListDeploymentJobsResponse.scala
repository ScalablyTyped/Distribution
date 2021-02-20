package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeploymentJobsResponse extends StObject {
  
  /**
    * A list of deployment jobs that meet the criteria of the request.
    */
  var deploymentJobs: js.UndefOr[DeploymentJobs] = js.native
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListDeploymentJobs again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListDeploymentJobsResponse {
  
  @scala.inline
  def apply(): ListDeploymentJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentJobsResponse]
  }
  
  @scala.inline
  implicit class ListDeploymentJobsResponseMutableBuilder[Self <: ListDeploymentJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentJobs(value: DeploymentJobs): Self = StObject.set(x, "deploymentJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentJobsUndefined: Self = StObject.set(x, "deploymentJobs", js.undefined)
    
    @scala.inline
    def setDeploymentJobsVarargs(value: DeploymentJob*): Self = StObject.set(x, "deploymentJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
