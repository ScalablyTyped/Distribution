package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPullRequestsInput extends StObject {
  
  /**
    * Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters the results to pull requests created by that user.
    */
  var authorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Optional. The status of the pull request. If used, this refines the results to the pull requests that match the specified status.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
  
  /**
    * The name of the repository for which you want to list pull requests.
    */
  var repositoryName: RepositoryName
}
object ListPullRequestsInput {
  
  inline def apply(repositoryName: RepositoryName): ListPullRequestsInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPullRequestsInput]
  }
  
  extension [Self <: ListPullRequestsInput](x: Self) {
    
    inline def setAuthorArn(value: Arn): Self = StObject.set(x, "authorArn", value.asInstanceOf[js.Any])
    
    inline def setAuthorArnUndefined: Self = StObject.set(x, "authorArn", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPullRequestStatus(value: PullRequestStatusEnum): Self = StObject.set(x, "pullRequestStatus", value.asInstanceOf[js.Any])
    
    inline def setPullRequestStatusUndefined: Self = StObject.set(x, "pullRequestStatus", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
