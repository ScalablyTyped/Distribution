package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPullRequestsOutput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The system-generated IDs of the pull requests.
    */
  var pullRequestIds: PullRequestIdList = js.native
}

object ListPullRequestsOutput {
  @scala.inline
  def apply(pullRequestIds: PullRequestIdList): ListPullRequestsOutput = {
    val __obj = js.Dynamic.literal(pullRequestIds = pullRequestIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPullRequestsOutput]
  }
  @scala.inline
  implicit class ListPullRequestsOutputOps[Self <: ListPullRequestsOutput] (val x: Self) extends AnyVal {
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
    def setPullRequestIdsVarargs(value: PullRequestId*): Self = this.set("pullRequestIds", js.Array(value :_*))
    @scala.inline
    def setPullRequestIds(value: PullRequestIdList): Self = this.set("pullRequestIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

