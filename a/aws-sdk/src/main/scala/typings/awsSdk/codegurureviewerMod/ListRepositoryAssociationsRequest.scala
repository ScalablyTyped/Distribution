package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositoryAssociationsRequest extends StObject {
  
  /**
    * The maximum number of repository association results returned by ListRepositoryAssociations in paginated output. When this parameter is used, ListRepositoryAssociations only returns maxResults results in a single page with a nextToken response element. The remaining results of the initial request can be seen by sending another ListRepositoryAssociations request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, ListRepositoryAssociations returns up to 100 results and a nextToken value if applicable. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codegurureviewerMod.MaxResults] = js.undefined
  
  /**
    * List of repository names to use as a filter.
    */
  var Names: js.UndefOr[typings.awsSdk.codegurureviewerMod.Names] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListRepositoryAssociations request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   Treat this token as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.undefined
  
  /**
    * List of owners to use as a filter. For AWS CodeCommit, it is the name of the CodeCommit account that was used to associate the repository. For other repository source providers, such as Bitbucket and GitHub Enterprise Server, this is name of the account that was used to associate the repository. 
    */
  var Owners: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owners] = js.undefined
  
  /**
    * List of provider types to use as a filter.
    */
  var ProviderTypes: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderTypes] = js.undefined
  
  /**
    * List of repository association states to use as a filter. The valid repository association states are:    Associated: The repository association is complete.     Associating: CodeGuru Reviewer is:     Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.    If your repository ProviderType is GitHub, GitHub Enterprise Server, or Bitbucket, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.      Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.       Failed: The repository failed to associate or disassociate.     Disassociating: CodeGuru Reviewer is removing the repository's pull request notifications and source code access.     Disassociated: CodeGuru Reviewer successfully disassociated the repository. You can create a new association with this repository if you want to review source code in it later. You can control access to code reviews created in an associated repository with tags after it has been disassociated. For more information, see Using tags to control access to associated repositories in the Amazon CodeGuru Reviewer User Guide.   
    */
  var States: js.UndefOr[RepositoryAssociationStates] = js.undefined
}
object ListRepositoryAssociationsRequest {
  
  @scala.inline
  def apply(): ListRepositoryAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoryAssociationsRequest]
  }
  
  @scala.inline
  implicit class ListRepositoryAssociationsRequestMutableBuilder[Self <: ListRepositoryAssociationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNames(value: Names): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: Name*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOwners(value: Owners): Self = StObject.set(x, "Owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersUndefined: Self = StObject.set(x, "Owners", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: Owner*): Self = StObject.set(x, "Owners", js.Array(value :_*))
    
    @scala.inline
    def setProviderTypes(value: ProviderTypes): Self = StObject.set(x, "ProviderTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTypesUndefined: Self = StObject.set(x, "ProviderTypes", js.undefined)
    
    @scala.inline
    def setProviderTypesVarargs(value: ProviderType*): Self = StObject.set(x, "ProviderTypes", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: RepositoryAssociationStates): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "States", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: RepositoryAssociationState*): Self = StObject.set(x, "States", js.Array(value :_*))
  }
}
