package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPullRequestOverrideStateInput extends StObject {
  
  /**
    * The ID of the pull request for which you want to get information about whether approval rules have been set aside (overridden).
    */
  var pullRequestId: PullRequestId
  
  /**
    * The system-generated ID of the revision for the pull request. To retrieve the most recent revision ID, use GetPullRequest.
    */
  var revisionId: RevisionId
}
object GetPullRequestOverrideStateInput {
  
  inline def apply(pullRequestId: PullRequestId, revisionId: RevisionId): GetPullRequestOverrideStateInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPullRequestOverrideStateInput]
  }
  
  extension [Self <: GetPullRequestOverrideStateInput](x: Self) {
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
