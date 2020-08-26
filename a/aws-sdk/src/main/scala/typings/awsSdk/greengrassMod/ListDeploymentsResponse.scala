package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentsResponse extends js.Object {
  /**
    * A list of deployments for the requested groups.
    */
  var Deployments: js.UndefOr[typings.awsSdk.greengrassMod.Deployments] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListDeploymentsResponse {
  @scala.inline
  def apply(): ListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsResponse]
  }
  @scala.inline
  implicit class ListDeploymentsResponseOps[Self <: ListDeploymentsResponse] (val x: Self) extends AnyVal {
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
    def setDeploymentsVarargs(value: Deployment*): Self = this.set("Deployments", js.Array(value :_*))
    @scala.inline
    def setDeployments(value: Deployments): Self = this.set("Deployments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployments: Self = this.set("Deployments", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

