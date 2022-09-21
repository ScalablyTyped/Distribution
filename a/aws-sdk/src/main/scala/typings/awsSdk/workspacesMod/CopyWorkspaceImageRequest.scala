package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyWorkspaceImageRequest extends StObject {
  
  /**
    * A description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.undefined
  
  /**
    * The name of the image.
    */
  var Name: WorkspaceImageName
  
  /**
    * The identifier of the source image.
    */
  var SourceImageId: WorkspaceImageId
  
  /**
    * The identifier of the source Region.
    */
  var SourceRegion: Region
  
  /**
    * The tags for the image.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CopyWorkspaceImageRequest {
  
  inline def apply(Name: WorkspaceImageName, SourceImageId: WorkspaceImageId, SourceRegion: Region): CopyWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceImageId = SourceImageId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWorkspaceImageRequest]
  }
  
  extension [Self <: CopyWorkspaceImageRequest](x: Self) {
    
    inline def setDescription(value: WorkspaceImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: WorkspaceImageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSourceImageId(value: WorkspaceImageId): Self = StObject.set(x, "SourceImageId", value.asInstanceOf[js.Any])
    
    inline def setSourceRegion(value: Region): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
