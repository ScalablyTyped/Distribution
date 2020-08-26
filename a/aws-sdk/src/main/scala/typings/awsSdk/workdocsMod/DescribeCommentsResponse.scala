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
  def apply(): DescribeCommentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommentsResponse]
  }
  @scala.inline
  implicit class DescribeCommentsResponseOps[Self <: DescribeCommentsResponse] (val x: Self) extends AnyVal {
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
    def setCommentsVarargs(value: Comment*): Self = this.set("Comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: CommentList): Self = this.set("Comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("Comments", js.undefined)
    @scala.inline
    def setMarker(value: MarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

