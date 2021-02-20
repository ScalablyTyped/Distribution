package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequestStatusChangedEventMetadata extends StObject {
  
  /**
    * The changed status of the pull request.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.native
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
    def setPullRequestStatus(value: PullRequestStatusEnum): Self = StObject.set(x, "pullRequestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestStatusUndefined: Self = StObject.set(x, "pullRequestStatus", js.undefined)
  }
}
