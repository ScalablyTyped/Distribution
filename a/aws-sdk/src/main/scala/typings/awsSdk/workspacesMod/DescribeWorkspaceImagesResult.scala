package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceImagesResult extends StObject {
  
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[WorkspaceImageList] = js.undefined
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeWorkspaceImagesResult {
  
  @scala.inline
  def apply(): DescribeWorkspaceImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceImagesResult]
  }
  
  @scala.inline
  implicit class DescribeWorkspaceImagesResultMutableBuilder[Self <: DescribeWorkspaceImagesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: WorkspaceImageList): Self = StObject.set(x, "Images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "Images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: WorkspaceImage*): Self = StObject.set(x, "Images", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
