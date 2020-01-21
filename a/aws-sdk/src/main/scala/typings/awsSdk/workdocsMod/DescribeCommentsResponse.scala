package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCommentsResponse extends js.Object {
  /**
    * The list of comments for the specified document version.
    */
  var Comments: js.UndefOr[CommentList] = js.native
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[MarkerType] = js.native
}

object DescribeCommentsResponse {
  @scala.inline
  def apply(Comments: CommentList = null, Marker: MarkerType = null): DescribeCommentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Comments != null) __obj.updateDynamic("Comments")(Comments.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCommentsResponse]
  }
}

