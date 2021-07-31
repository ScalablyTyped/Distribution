package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceImagePermissionsRequest extends StObject {
  
  /**
    * The identifier of the image.
    */
  var ImageId: WorkspaceImageId
  
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeWorkspaceImagePermissionsRequest {
  
  @scala.inline
  def apply(ImageId: WorkspaceImageId): DescribeWorkspaceImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceImagePermissionsRequest]
  }
  
  @scala.inline
  implicit class DescribeWorkspaceImagePermissionsRequestMutableBuilder[Self <: DescribeWorkspaceImagePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
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
