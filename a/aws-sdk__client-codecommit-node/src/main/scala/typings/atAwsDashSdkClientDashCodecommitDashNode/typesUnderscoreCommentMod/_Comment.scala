package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Comment extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the person who posted the comment.</p>
    */
  var authorArn: js.UndefOr[String] = js.undefined
  /**
    * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The system-generated comment ID.</p>
    */
  var commentId: js.UndefOr[String] = js.undefined
  /**
    * <p>The content of the comment.</p>
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * <p>The date and time the comment was created, in timestamp format.</p>
    */
  var creationDate: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>A Boolean value indicating whether the comment has been deleted.</p>
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The ID of the comment for which this comment is a reply, if any.</p>
    */
  var inReplyTo: js.UndefOr[String] = js.undefined
  /**
    * <p>The date and time the comment was most recently modified, in timestamp format.</p>
    */
  var lastModifiedDate: js.UndefOr[Date | String | Double] = js.undefined
}

object _Comment {
  @scala.inline
  def apply(
    authorArn: String = null,
    clientRequestToken: String = null,
    commentId: String = null,
    content: String = null,
    creationDate: Date | String | Double = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    inReplyTo: String = null,
    lastModifiedDate: Date | String | Double = null
  ): _Comment = {
    val __obj = js.Dynamic.literal()
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (commentId != null) __obj.updateDynamic("commentId")(commentId)
    if (content != null) __obj.updateDynamic("content")(content)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Comment]
  }
}

