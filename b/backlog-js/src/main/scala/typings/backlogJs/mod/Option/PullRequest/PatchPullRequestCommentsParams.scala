package typings.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchPullRequestCommentsParams extends js.Object {
  var content: String
}

object PatchPullRequestCommentsParams {
  @scala.inline
  def apply(content: String): PatchPullRequestCommentsParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchPullRequestCommentsParams]
  }
}

