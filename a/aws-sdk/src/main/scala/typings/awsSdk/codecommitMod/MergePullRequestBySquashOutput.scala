package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergePullRequestBySquashOutput extends StObject {
  
  var pullRequest: js.UndefOr[PullRequest] = js.undefined
}
object MergePullRequestBySquashOutput {
  
  @scala.inline
  def apply(): MergePullRequestBySquashOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergePullRequestBySquashOutput]
  }
  
  @scala.inline
  implicit class MergePullRequestBySquashOutputMutableBuilder[Self <: MergePullRequestBySquashOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
  }
}
