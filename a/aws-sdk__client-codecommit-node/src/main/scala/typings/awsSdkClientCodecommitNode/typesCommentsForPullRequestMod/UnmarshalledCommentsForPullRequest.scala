package typings.awsSdkClientCodecommitNode.typesCommentsForPullRequestMod

import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledCommentsForPullRequest extends CommentsForPullRequest {
  
  /**
    * <p>An array of comment objects. Each comment object contains information about a comment on the pull request.</p>
    */
  @JSName("comments")
  var comments_UnmarshalledCommentsForPullRequest: js.UndefOr[js.Array[UnmarshalledComment]] = js.native
  
  /**
    * <p>Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).</p>
    */
  @JSName("location")
  var location_UnmarshalledCommentsForPullRequest: js.UndefOr[UnmarshalledLocation] = js.native
}
object UnmarshalledCommentsForPullRequest {
  
  @scala.inline
  def apply(): UnmarshalledCommentsForPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCommentsForPullRequest]
  }
  
  @scala.inline
  implicit class UnmarshalledCommentsForPullRequestOps[Self <: UnmarshalledCommentsForPullRequest] (val x: Self) extends AnyVal {
    
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
    def setCommentsVarargs(value: UnmarshalledComment*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[UnmarshalledComment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setLocation(value: UnmarshalledLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
