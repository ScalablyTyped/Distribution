package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestStatusChangedEventMetadataMod {
  
  @js.native
  trait PullRequestStatusChangedEventMetadata extends StObject {
    
    /**
      * <p>The changed status of the pull request.</p>
      */
    var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.native
  }
  object PullRequestStatusChangedEventMetadata {
    
    @scala.inline
    def apply(): PullRequestStatusChangedEventMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
    }
    
    @scala.inline
    implicit class PullRequestStatusChangedEventMetadataMutableBuilder[Self <: PullRequestStatusChangedEventMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPullRequestStatus(value: OPEN | CLOSED | String): Self = StObject.set(x, "pullRequestStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestStatusUndefined: Self = StObject.set(x, "pullRequestStatus", js.undefined)
    }
  }
  
  type UnmarshalledPullRequestStatusChangedEventMetadata = PullRequestStatusChangedEventMetadata
}
