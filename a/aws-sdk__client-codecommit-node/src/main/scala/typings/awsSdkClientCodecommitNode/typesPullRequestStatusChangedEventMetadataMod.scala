package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestStatusChangedEventMetadataMod {
  
  trait PullRequestStatusChangedEventMetadata extends StObject {
    
    /**
      * <p>The changed status of the pull request.</p>
      */
    var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.undefined
  }
  object PullRequestStatusChangedEventMetadata {
    
    inline def apply(): PullRequestStatusChangedEventMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PullRequestStatusChangedEventMetadata] (val x: Self) extends AnyVal {
      
      inline def setPullRequestStatus(value: OPEN | CLOSED | String): Self = StObject.set(x, "pullRequestStatus", value.asInstanceOf[js.Any])
      
      inline def setPullRequestStatusUndefined: Self = StObject.set(x, "pullRequestStatus", js.undefined)
    }
  }
  
  type UnmarshalledPullRequestStatusChangedEventMetadata = PullRequestStatusChangedEventMetadata
}
