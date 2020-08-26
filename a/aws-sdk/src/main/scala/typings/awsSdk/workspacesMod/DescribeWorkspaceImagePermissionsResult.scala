package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceImagePermissionsResult extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
  /**
    * The identifiers of the AWS accounts that the image has been shared with.
    */
  var ImagePermissions: js.UndefOr[typings.awsSdk.workspacesMod.ImagePermissions] = js.native
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeWorkspaceImagePermissionsResult {
  @scala.inline
  def apply(): DescribeWorkspaceImagePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceImagePermissionsResult]
  }
  @scala.inline
  implicit class DescribeWorkspaceImagePermissionsResultOps[Self <: DescribeWorkspaceImagePermissionsResult] (val x: Self) extends AnyVal {
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
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    @scala.inline
    def setImagePermissionsVarargs(value: ImagePermission*): Self = this.set("ImagePermissions", js.Array(value :_*))
    @scala.inline
    def setImagePermissions(value: ImagePermissions): Self = this.set("ImagePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePermissions: Self = this.set("ImagePermissions", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

