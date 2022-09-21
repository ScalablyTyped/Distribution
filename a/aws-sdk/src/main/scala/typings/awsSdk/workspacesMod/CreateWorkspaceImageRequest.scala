package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceImageRequest extends StObject {
  
  /**
    * The description of the new WorkSpace image.
    */
  var Description: WorkspaceImageDescription
  
  /**
    * The name of the new WorkSpace image.
    */
  var Name: WorkspaceImageName
  
  /**
    * The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you must create an IAM policy that grants your IAM user permission to use workspaces:CreateTags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The identifier of the source WorkSpace
    */
  var WorkspaceId: typings.awsSdk.workspacesMod.WorkspaceId
}
object CreateWorkspaceImageRequest {
  
  inline def apply(Description: WorkspaceImageDescription, Name: WorkspaceImageName, WorkspaceId: WorkspaceId): CreateWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], WorkspaceId = WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceImageRequest]
  }
  
  extension [Self <: CreateWorkspaceImageRequest](x: Self) {
    
    inline def setDescription(value: WorkspaceImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: WorkspaceImageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
  }
}
