package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceImagePermissionsResult extends StObject {
  
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
  
  /**
    * The identifiers of the Amazon Web Services accounts that the image has been shared with.
    */
  var ImagePermissions: js.UndefOr[typings.awsSdk.workspacesMod.ImagePermissions] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeWorkspaceImagePermissionsResult {
  
  inline def apply(): DescribeWorkspaceImagePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceImagePermissionsResult]
  }
  
  extension [Self <: DescribeWorkspaceImagePermissionsResult](x: Self) {
    
    inline def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setImagePermissions(value: ImagePermissions): Self = StObject.set(x, "ImagePermissions", value.asInstanceOf[js.Any])
    
    inline def setImagePermissionsUndefined: Self = StObject.set(x, "ImagePermissions", js.undefined)
    
    inline def setImagePermissionsVarargs(value: ImagePermission*): Self = StObject.set(x, "ImagePermissions", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
