package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyWorkspaceImageRequest extends StObject {
  
  /**
    * A description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.native
  
  /**
    * The name of the image.
    */
  var Name: WorkspaceImageName = js.native
  
  /**
    * The identifier of the source image.
    */
  var SourceImageId: WorkspaceImageId = js.native
  
  /**
    * The identifier of the source Region.
    */
  var SourceRegion: Region = js.native
  
  /**
    * The tags for the image.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CopyWorkspaceImageRequest {
  
  @scala.inline
  def apply(Name: WorkspaceImageName, SourceImageId: WorkspaceImageId, SourceRegion: Region): CopyWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceImageId = SourceImageId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWorkspaceImageRequest]
  }
  
  @scala.inline
  implicit class CopyWorkspaceImageRequestMutableBuilder[Self <: CopyWorkspaceImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: WorkspaceImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: WorkspaceImageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceImageId(value: WorkspaceImageId): Self = StObject.set(x, "SourceImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegion(value: Region): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
