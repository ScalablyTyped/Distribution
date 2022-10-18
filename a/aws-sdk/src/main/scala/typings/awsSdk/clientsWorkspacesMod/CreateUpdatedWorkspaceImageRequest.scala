package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUpdatedWorkspaceImageRequest extends StObject {
  
  /**
    * A description of whether updates for the WorkSpace image are available.
    */
  var Description: WorkspaceImageDescription
  
  /**
    * The name of the new updated WorkSpace image.
    */
  var Name: WorkspaceImageName
  
  /**
    * The identifier of the source WorkSpace image.
    */
  var SourceImageId: WorkspaceImageId
  
  /**
    * The tags that you want to add to the new updated WorkSpace image.  To add tags at the same time when you're creating the updated image, you must create an IAM policy that grants your IAM user permissions to use workspaces:CreateTags.  
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateUpdatedWorkspaceImageRequest {
  
  inline def apply(Description: WorkspaceImageDescription, Name: WorkspaceImageName, SourceImageId: WorkspaceImageId): CreateUpdatedWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceImageId = SourceImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUpdatedWorkspaceImageRequest]
  }
  
  extension [Self <: CreateUpdatedWorkspaceImageRequest](x: Self) {
    
    inline def setDescription(value: WorkspaceImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: WorkspaceImageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSourceImageId(value: WorkspaceImageId): Self = StObject.set(x, "SourceImageId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
