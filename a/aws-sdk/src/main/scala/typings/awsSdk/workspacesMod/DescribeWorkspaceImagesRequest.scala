package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceImagesRequest extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageIds: js.UndefOr[WorkspaceImageIdList] = js.native
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.native
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeWorkspaceImagesRequest {
  @scala.inline
  def apply(
    ImageIds: WorkspaceImageIdList = null,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null
  ): DescribeWorkspaceImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (ImageIds != null) __obj.updateDynamic("ImageIds")(ImageIds.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceImagesRequest]
  }
}

