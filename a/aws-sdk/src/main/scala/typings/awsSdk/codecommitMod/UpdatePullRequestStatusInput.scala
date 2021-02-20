package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePullRequestStatusInput extends StObject {
  
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId = js.native
  
  /**
    * The status of the pull request. The only valid operations are to update the status from OPEN to OPEN, OPEN to CLOSED or from CLOSED to CLOSED.
    */
  var pullRequestStatus: PullRequestStatusEnum = js.native
}
object UpdatePullRequestStatusInput {
  
  @scala.inline
  def apply(pullRequestId: PullRequestId, pullRequestStatus: PullRequestStatusEnum): UpdatePullRequestStatusInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], pullRequestStatus = pullRequestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestStatusInput]
  }
  
  @scala.inline
  implicit class UpdatePullRequestStatusInputMutableBuilder[Self <: UpdatePullRequestStatusInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestStatus(value: PullRequestStatusEnum): Self = StObject.set(x, "pullRequestStatus", value.asInstanceOf[js.Any])
  }
}
