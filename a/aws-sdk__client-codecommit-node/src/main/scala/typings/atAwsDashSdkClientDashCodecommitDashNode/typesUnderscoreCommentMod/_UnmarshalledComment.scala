package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledComment extends _Comment {
  /**
    * <p>The date and time the comment was created, in timestamp format.</p>
    */
  @JSName("creationDate")
  var creationDate__UnmarshalledComment: js.UndefOr[Date] = js.undefined
  /**
    * <p>The date and time the comment was most recently modified, in timestamp format.</p>
    */
  @JSName("lastModifiedDate")
  var lastModifiedDate__UnmarshalledComment: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledComment {
  @scala.inline
  def apply(
    authorArn: String = null,
    clientRequestToken: String = null,
    commentId: String = null,
    content: String = null,
    creationDate: Date = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    inReplyTo: String = null,
    lastModifiedDate: Date = null
  ): _UnmarshalledComment = {
    val __obj = js.Dynamic.literal()
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (commentId != null) __obj.updateDynamic("commentId")(commentId)
    if (content != null) __obj.updateDynamic("content")(content)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    __obj.asInstanceOf[_UnmarshalledComment]
  }
}

