package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceImagesRequest extends StObject {
  
  /**
    * The identifier of the image.
    */
  var ImageIds: js.UndefOr[WorkspaceImageIdList] = js.undefined
  
  /**
    * The type (owned or shared) of the image.
    */
  var ImageType: js.UndefOr[typings.awsSdk.workspacesMod.ImageType] = js.undefined
  
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeWorkspaceImagesRequest {
  
  inline def apply(): DescribeWorkspaceImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceImagesRequest]
  }
  
  extension [Self <: DescribeWorkspaceImagesRequest](x: Self) {
    
    inline def setImageIds(value: WorkspaceImageIdList): Self = StObject.set(x, "ImageIds", value.asInstanceOf[js.Any])
    
    inline def setImageIdsUndefined: Self = StObject.set(x, "ImageIds", js.undefined)
    
    inline def setImageIdsVarargs(value: WorkspaceImageId*): Self = StObject.set(x, "ImageIds", js.Array(value :_*))
    
    inline def setImageType(value: ImageType): Self = StObject.set(x, "ImageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "ImageType", js.undefined)
    
    inline def setMaxResults(value: Limit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
