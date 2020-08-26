package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceImagesResult extends js.Object {
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[WorkspaceImageList] = js.native
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeWorkspaceImagesResult {
  @scala.inline
  def apply(): DescribeWorkspaceImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceImagesResult]
  }
  @scala.inline
  implicit class DescribeWorkspaceImagesResultOps[Self <: DescribeWorkspaceImagesResult] (val x: Self) extends AnyVal {
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
    def setImagesVarargs(value: WorkspaceImage*): Self = this.set("Images", js.Array(value :_*))
    @scala.inline
    def setImages(value: WorkspaceImageList): Self = this.set("Images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("Images", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

