package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspaceImagesRequest extends StObject {
  
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
  implicit class DescribeWorkspaceImagesRequestMutableBuilder[Self <: DescribeWorkspaceImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageIds(value: WorkspaceImageIdList): Self = StObject.set(x, "ImageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdsUndefined: Self = StObject.set(x, "ImageIds", js.undefined)
    
    @scala.inline
    def setImageIdsVarargs(value: WorkspaceImageId*): Self = StObject.set(x, "ImageIds", js.Array(value :_*))
    
    @scala.inline
    def setImageType(value: ImageType): Self = StObject.set(x, "ImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTypeUndefined: Self = StObject.set(x, "ImageType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Limit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
