package typings.backlogDashJs.backlogDashJsMod.Option.Issue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchIssueCommentParams extends js.Object {
  var content: String
}

object PatchIssueCommentParams {
  @scala.inline
  def apply(content: String): PatchIssueCommentParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchIssueCommentParams]
  }
}

