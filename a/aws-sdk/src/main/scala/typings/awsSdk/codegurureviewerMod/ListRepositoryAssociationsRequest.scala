package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoryAssociationsRequest extends js.Object {
  /**
    * The maximum number of repository association results returned by ListRepositoryAssociations in paginated output. When this parameter is used, ListRepositoryAssociations only returns maxResults results in a single page with a nextToken response element. The remaining results of the initial request can be seen by sending another ListRepositoryAssociations request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, ListRepositoryAssociations returns up to 100 results and a nextToken value if applicable. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codegurureviewerMod.MaxResults] = js.native
  /**
    * List of repository names to use as a filter.
    */
  var Names: js.UndefOr[typings.awsSdk.codegurureviewerMod.Names] = js.native
  /**
    * The nextToken value returned from a previous paginated ListRepositoryAssociations request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   Treat this token as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
  /**
    * List of owners to use as a filter. For AWS CodeCommit, it is the name of the CodeCommit account that was used to associate the repository. For other repository source providers, such as Bitbucket, this is name of the account that was used to associate the repository. 
    */
  var Owners: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owners] = js.native
  /**
    * List of provider types to use as a filter.
    */
  var ProviderTypes: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderTypes] = js.native
  /**
    * List of repository association states to use as a filter. The valid repository association states are:    Associated: The repository association is complete.     Associating: CodeGuru Reviewer is:     Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.    If your repository ProviderType is GitHub or Bitbucket, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.      Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.       Failed: The repository failed to associate or disassociate.     Disassociating: CodeGuru Reviewer is removing the repository's pull request notifications and source code access.   
    */
  var States: js.UndefOr[RepositoryAssociationStates] = js.native
}

object ListRepositoryAssociationsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    Names: Names = null,
    NextToken: NextToken = null,
    Owners: Owners = null,
    ProviderTypes: ProviderTypes = null,
    States: RepositoryAssociationStates = null
  ): ListRepositoryAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Owners != null) __obj.updateDynamic("Owners")(Owners.asInstanceOf[js.Any])
    if (ProviderTypes != null) __obj.updateDynamic("ProviderTypes")(ProviderTypes.asInstanceOf[js.Any])
    if (States != null) __obj.updateDynamic("States")(States.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoryAssociationsRequest]
  }
}

