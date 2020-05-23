package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPullRequestsInput extends js.Object {
  /**
    * Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters the results to pull requests created by that user.
    */
  var authorArn: js.UndefOr[Arn] = js.native
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Optional. The status of the pull request. If used, this refines the results to the pull requests that match the specified status.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.native
  /**
    * The name of the repository for which you want to list pull requests.
    */
  var repositoryName: RepositoryName = js.native
}

object ListPullRequestsInput {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    authorArn: Arn = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    pullRequestStatus: PullRequestStatusEnum = null
  ): ListPullRequestsInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPullRequestsInput]
  }
}

