package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspaceImagePermissionsResult extends StObject {
  
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
  implicit class DescribeWorkspaceImagePermissionsResultMutableBuilder[Self <: DescribeWorkspaceImagePermissionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setImagePermissions(value: ImagePermissions): Self = StObject.set(x, "ImagePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePermissionsUndefined: Self = StObject.set(x, "ImagePermissions", js.undefined)
    
    @scala.inline
    def setImagePermissionsVarargs(value: ImagePermission*): Self = StObject.set(x, "ImagePermissions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
