package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceImagePermissionsRequest extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageId: WorkspaceImageId = js.native
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.native
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeWorkspaceImagePermissionsRequest {
  @scala.inline
  def apply(ImageId: WorkspaceImageId): DescribeWorkspaceImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceImagePermissionsRequest]
  }
  @scala.inline
  implicit class DescribeWorkspaceImagePermissionsRequestOps[Self <: DescribeWorkspaceImagePermissionsRequest] (val x: Self) extends AnyVal {
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
    def setImageId(value: WorkspaceImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: Limit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

