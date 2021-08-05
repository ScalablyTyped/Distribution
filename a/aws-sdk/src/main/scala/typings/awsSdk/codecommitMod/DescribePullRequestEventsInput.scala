package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePullRequestEventsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with more commits or changing the status of a pull request.
    */
  var actorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results. The default is 100 events, which is also the maximum number of events that can be returned in a result.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Optional. The pull request event type about which you want to return information.
    */
  var pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined
  
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
}
object DescribePullRequestEventsInput {
  
  inline def apply(pullRequestId: PullRequestId): DescribePullRequestEventsInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePullRequestEventsInput]
  }
  
  extension [Self <: DescribePullRequestEventsInput](x: Self) {
    
    inline def setActorArn(value: Arn): Self = StObject.set(x, "actorArn", value.asInstanceOf[js.Any])
    
    inline def setActorArnUndefined: Self = StObject.set(x, "actorArn", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPullRequestEventType(value: PullRequestEventType): Self = StObject.set(x, "pullRequestEventType", value.asInstanceOf[js.Any])
    
    inline def setPullRequestEventTypeUndefined: Self = StObject.set(x, "pullRequestEventType", js.undefined)
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
