package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePullRequestOutput extends StObject {
  
  /**
    * Information about the newly created pull request.
    */
  var pullRequest: PullRequest
}
object CreatePullRequestOutput {
  
  @scala.inline
  def apply(pullRequest: PullRequest): CreatePullRequestOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePullRequestOutput]
  }
  
  @scala.inline
  implicit class CreatePullRequestOutputMutableBuilder[Self <: CreatePullRequestOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
  }
}
