package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentJobsResponse extends js.Object {
  /**
    * A list of deployment jobs that meet the criteria of the request.
    */
  var deploymentJobs: js.UndefOr[DeploymentJobs] = js.native
  /**
    * The nextToken value to include in a future ListDeploymentJobs request. When the results of a ListDeploymentJobs request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
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

