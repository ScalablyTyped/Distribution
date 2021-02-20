package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import typings.awsSdkClientCodecommitNode.typesPullRequestTargetMod.PullRequestTarget
import typings.awsSdkClientCodecommitNode.typesPullRequestTargetMod.UnmarshalledPullRequestTarget
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestMod {
  
  @js.native
  trait PullRequest extends StObject {
    
    /**
      * <p>The Amazon Resource Name (ARN) of the user who created the pull request.</p>
      */
    var authorArn: js.UndefOr[String] = js.native
    
    /**
      * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
      */
    var clientRequestToken: js.UndefOr[String] = js.native
    
    /**
      * <p>The date and time the pull request was originally created, in timestamp format.</p>
      */
    var creationDate: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.</p>
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * <p>The day and time of the last user or system activity on the pull request, in timestamp format.</p>
      */
    var lastActivityDate: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>The system-generated ID of the pull request. </p>
      */
    var pullRequestId: js.UndefOr[String] = js.native
    
    /**
      * <p>The status of the pull request. Pull request status can only change from <code>OPEN</code> to <code>CLOSED</code>.</p>
      */
    var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.native
    
    /**
      * <p>The targets of the pull request, including the source branch and destination branch for the pull request.</p>
      */
    var pullRequestTargets: js.UndefOr[js.Array[PullRequestTarget] | Iterable[PullRequestTarget]] = js.native
    
    /**
      * <p>The user-defined title of the pull request. This title is displayed in the list of pull requests to other users of the repository.</p>
      */
    var title: js.UndefOr[String] = js.native
  }
  object PullRequest {
    
    @scala.inline
    def apply(): PullRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullRequest]
    }
    
    @scala.inline
    implicit class PullRequestMutableBuilder[Self <: PullRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorArn(value: String): Self = StObject.set(x, "authorArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorArnUndefined: Self = StObject.set(x, "authorArn", js.undefined)
      
      @scala.inline
      def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
      
      @scala.inline
      def setCreationDate(value: Date | String | Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLastActivityDate(value: Date | String | Double): Self = StObject.set(x, "lastActivityDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastActivityDateUndefined: Self = StObject.set(x, "lastActivityDate", js.undefined)
      
      @scala.inline
      def setPullRequestId(value: String): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
      
      @scala.inline
      def setPullRequestStatus(value: OPEN | CLOSED | String): Self = StObject.set(x, "pullRequestStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestStatusUndefined: Self = StObject.set(x, "pullRequestStatus", js.undefined)
      
      @scala.inline
      def setPullRequestTargets(value: js.Array[PullRequestTarget] | Iterable[PullRequestTarget]): Self = StObject.set(x, "pullRequestTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestTargetsUndefined: Self = StObject.set(x, "pullRequestTargets", js.undefined)
      
      @scala.inline
      def setPullRequestTargetsVarargs(value: PullRequestTarget*): Self = StObject.set(x, "pullRequestTargets", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledPullRequest extends PullRequest {
    
    /**
      * <p>The date and time the pull request was originally created, in timestamp format.</p>
      */
    @JSName("creationDate")
    var creationDate_UnmarshalledPullRequest: js.UndefOr[Date] = js.native
    
    /**
      * <p>The day and time of the last user or system activity on the pull request, in timestamp format.</p>
      */
    @JSName("lastActivityDate")
    var lastActivityDate_UnmarshalledPullRequest: js.UndefOr[Date] = js.native
    
    /**
      * <p>The targets of the pull request, including the source branch and destination branch for the pull request.</p>
      */
    @JSName("pullRequestTargets")
    var pullRequestTargets_UnmarshalledPullRequest: js.UndefOr[js.Array[UnmarshalledPullRequestTarget]] = js.native
  }
  object UnmarshalledPullRequest {
    
    @scala.inline
    def apply(): UnmarshalledPullRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPullRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledPullRequestMutableBuilder[Self <: UnmarshalledPullRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setLastActivityDate(value: Date): Self = StObject.set(x, "lastActivityDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastActivityDateUndefined: Self = StObject.set(x, "lastActivityDate", js.undefined)
      
      @scala.inline
      def setPullRequestTargets(value: js.Array[UnmarshalledPullRequestTarget]): Self = StObject.set(x, "pullRequestTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestTargetsUndefined: Self = StObject.set(x, "pullRequestTargets", js.undefined)
      
      @scala.inline
      def setPullRequestTargetsVarargs(value: UnmarshalledPullRequestTarget*): Self = StObject.set(x, "pullRequestTargets", js.Array(value :_*))
    }
  }
}
