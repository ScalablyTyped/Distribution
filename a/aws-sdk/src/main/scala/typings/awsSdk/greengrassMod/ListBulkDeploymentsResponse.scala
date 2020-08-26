package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBulkDeploymentsResponse extends js.Object {
  /**
    * A list of bulk deployments.
    */
  var BulkDeployments: js.UndefOr[typings.awsSdk.greengrassMod.BulkDeployments] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListBulkDeploymentsResponse {
  @scala.inline
  def apply(): ListBulkDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBulkDeploymentsResponse]
  }
  @scala.inline
  implicit class ListBulkDeploymentsResponseOps[Self <: ListBulkDeploymentsResponse] (val x: Self) extends AnyVal {
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
    def setBulkDeploymentsVarargs(value: BulkDeployment*): Self = this.set("BulkDeployments", js.Array(value :_*))
    @scala.inline
    def setBulkDeployments(value: BulkDeployments): Self = this.set("BulkDeployments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBulkDeployments: Self = this.set("BulkDeployments", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

