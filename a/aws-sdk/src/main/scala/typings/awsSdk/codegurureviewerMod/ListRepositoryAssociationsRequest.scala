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
  def apply(): ListRepositoryAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoryAssociationsRequest]
  }
  @scala.inline
  implicit class ListRepositoryAssociationsRequestOps[Self <: ListRepositoryAssociationsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNamesVarargs(value: Name*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: Names): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setOwnersVarargs(value: Owner*): Self = this.set("Owners", js.Array(value :_*))
    @scala.inline
    def setOwners(value: Owners): Self = this.set("Owners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwners: Self = this.set("Owners", js.undefined)
    @scala.inline
    def setProviderTypesVarargs(value: ProviderType*): Self = this.set("ProviderTypes", js.Array(value :_*))
    @scala.inline
    def setProviderTypes(value: ProviderTypes): Self = this.set("ProviderTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderTypes: Self = this.set("ProviderTypes", js.undefined)
    @scala.inline
    def setStatesVarargs(value: RepositoryAssociationState*): Self = this.set("States", js.Array(value :_*))
    @scala.inline
    def setStates(value: RepositoryAssociationStates): Self = this.set("States", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("States", js.undefined)
  }
  
}

