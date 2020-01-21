package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociatedApprovalRuleTemplatesForRepositoryInput extends js.Object {
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the repository for which you want to list all associated approval rule templates.
    */
  var repositoryName: RepositoryName = js.native
}

object ListAssociatedApprovalRuleTemplatesForRepositoryInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, maxResults: Int | Double = null, nextToken: NextToken = null): ListAssociatedApprovalRuleTemplatesForRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedApprovalRuleTemplatesForRepositoryInput]
  }
}

