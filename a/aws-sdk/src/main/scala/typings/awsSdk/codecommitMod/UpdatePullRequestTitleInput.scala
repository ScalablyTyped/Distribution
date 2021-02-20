package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePullRequestTitleInput extends StObject {
  
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId = js.native
  
  /**
    * The updated title of the pull request. This replaces the existing title.
    */
  var title: Title = js.native
}
object UpdatePullRequestTitleInput {
  
  @scala.inline
  def apply(pullRequestId: PullRequestId, title: Title): UpdatePullRequestTitleInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestTitleInput]
  }
  
  @scala.inline
  implicit class UpdatePullRequestTitleInputMutableBuilder[Self <: UpdatePullRequestTitleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
