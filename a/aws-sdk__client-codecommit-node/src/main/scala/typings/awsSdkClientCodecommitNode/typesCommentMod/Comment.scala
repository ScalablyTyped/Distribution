package typings.awsSdkClientCodecommitNode.typesCommentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the person who posted the comment.</p>
    */
  var authorArn: js.UndefOr[String] = js.native
  /**
    * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * <p>The system-generated comment ID.</p>
    */
  var commentId: js.UndefOr[String] = js.native
  /**
    * <p>The content of the comment.</p>
    */
  var content: js.UndefOr[String] = js.native
  /**
    * <p>The date and time the comment was created, in timestamp format.</p>
    */
  var creationDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>A Boolean value indicating whether the comment has been deleted.</p>
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * <p>The ID of the comment for which this comment is a reply, if any.</p>
    */
  var inReplyTo: js.UndefOr[String] = js.native
  /**
    * <p>The date and time the comment was most recently modified, in timestamp format.</p>
    */
  var lastModifiedDate: js.UndefOr[Date | String | Double] = js.native
}

object Comment {
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def setAuthorArn(value: String): Self = this.set("authorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorArn: Self = this.set("authorArn", js.undefined)
    @scala.inline
    def setClientRequestToken(value: String): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setCommentId(value: String): Self = this.set("commentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentId: Self = this.set("commentId", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setCreationDate(value: Date | String | Double): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setInReplyTo(value: String): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInReplyTo: Self = this.set("inReplyTo", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Date | String | Double): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
  }
  
}

