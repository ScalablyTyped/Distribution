package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePullRequestStatusOutput extends StObject {
  
  /**
    * Information about the pull request.
    */
  var pullRequest: PullRequest = js.native
}
object UpdatePullRequestStatusOutput {
  
  @scala.inline
  def apply(pullRequest: PullRequest): UpdatePullRequestStatusOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestStatusOutput]
  }
  
  @scala.inline
  implicit class UpdatePullRequestStatusOutputMutableBuilder[Self <: UpdatePullRequestStatusOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
  }
}
