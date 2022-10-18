package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_CREATED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_MERGE_STATE_CHANGED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_STATUS_CHANGED
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribePullRequestEventsInputMod {
  
  trait DescribePullRequestEventsInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.</p>
      */
    var actorArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A non-negative integer used to limit the number of returned results. The default is 100 events, which is also the maximum number of events that can be returned in a result.</p>
      */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Optional. The pull request event type about which you want to return information.</p>
      */
    var pullRequestEventType: js.UndefOr[
        PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
      ] = js.undefined
    
    /**
      * <p>The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.</p>
      */
    var pullRequestId: String
  }
  object DescribePullRequestEventsInput {
    
    inline def apply(pullRequestId: String): DescribePullRequestEventsInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribePullRequestEventsInput]
    }
    
    extension [Self <: DescribePullRequestEventsInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setActorArn(value: String): Self = StObject.set(x, "actorArn", value.asInstanceOf[js.Any])
      
      inline def setActorArnUndefined: Self = StObject.set(x, "actorArn", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      inline def setPullRequestEventType(
        value: PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
      ): Self = StObject.set(x, "pullRequestEventType", value.asInstanceOf[js.Any])
      
      inline def setPullRequestEventTypeUndefined: Self = StObject.set(x, "pullRequestEventType", js.undefined)
      
      inline def setPullRequestId(value: String): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    }
  }
}
