package typings.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostPullRequestCommentsParams extends js.Object {
  
  var content: String = js.native
  
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
}
object PostPullRequestCommentsParams {
  
  @scala.inline
  def apply(content: String): PostPullRequestCommentsParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPullRequestCommentsParams]
  }
  
  @scala.inline
  implicit class PostPullRequestCommentsParamsOps[Self <: PostPullRequestCommentsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifiedUserIdVarargs(value: Double*): Self = this.set("notifiedUserId", js.Array(value :_*))
    
    @scala.inline
    def setNotifiedUserId(value: js.Array[Double]): Self = this.set("notifiedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifiedUserId: Self = this.set("notifiedUserId", js.undefined)
  }
}
