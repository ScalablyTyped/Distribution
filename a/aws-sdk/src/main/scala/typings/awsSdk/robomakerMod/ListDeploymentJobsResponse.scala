package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeploymentJobsResponse extends js.Object {
  
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
  implicit class ListDeploymentJobsResponseOps[Self <: ListDeploymentJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeploymentJobsVarargs(value: DeploymentJob*): Self = this.set("deploymentJobs", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentJobs(value: DeploymentJobs): Self = this.set("deploymentJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentJobs: Self = this.set("deploymentJobs", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
