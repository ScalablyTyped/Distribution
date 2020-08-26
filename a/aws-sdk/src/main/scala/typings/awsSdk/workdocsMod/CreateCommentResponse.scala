package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommentResponse extends js.Object {
  /**
    * The comment that has been created.
    */
  var Comment: js.UndefOr[typings.awsSdk.workdocsMod.Comment] = js.native
}

object CreateCommentResponse {
  @scala.inline
  def apply(): CreateCommentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCommentResponse]
  }
  @scala.inline
  implicit class CreateCommentResponseOps[Self <: CreateCommentResponse] (val x: Self) extends AnyVal {
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
    def setComment(value: Comment): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
  
}

