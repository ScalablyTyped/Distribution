package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspaceImagesRequest extends js.Object {
  
  /**
    * The identifier of the image.
    */
  var ImageIds: js.UndefOr[WorkspaceImageIdList] = js.native
  
  /**
    * The type (owned or shared) of the image.
    */
  var ImageType: js.UndefOr[typings.awsSdk.workspacesMod.ImageType] = js.native
  
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
  def apply(): DescribeWorkspaceImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceImagesRequest]
  }
  
  @scala.inline
  implicit class DescribeWorkspaceImagesRequestOps[Self <: DescribeWorkspaceImagesRequest] (val x: Self) extends AnyVal {
    
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
    def setImageIdsVarargs(value: WorkspaceImageId*): Self = this.set("ImageIds", js.Array(value :_*))
    
    @scala.inline
    def setImageIds(value: WorkspaceImageIdList): Self = this.set("ImageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageIds: Self = this.set("ImageIds", js.undefined)
    
    @scala.inline
    def setImageType(value: ImageType): Self = this.set("ImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageType: Self = this.set("ImageType", js.undefined)
    
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
