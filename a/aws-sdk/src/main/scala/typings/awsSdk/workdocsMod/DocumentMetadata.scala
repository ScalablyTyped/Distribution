package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentMetadata extends StObject {
  
  /**
    * The time when the document was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The ID of the document.
    */
  var Id: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * List of labels on the document.
    */
  var Labels: js.UndefOr[SharedLabels] = js.undefined
  
  /**
    * The latest version of the document.
    */
  var LatestVersionMetadata: js.UndefOr[DocumentVersionMetadata] = js.undefined
  
  /**
    * The time when the document was updated.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * The resource state.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
}
object DocumentMetadata {
  
  @scala.inline
  def apply(): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMetadata]
  }
  
  @scala.inline
  implicit class DocumentMetadataMutableBuilder[Self <: DocumentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: TimestampType): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setCreatorId(value: IdType): Self = StObject.set(x, "CreatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorIdUndefined: Self = StObject.set(x, "CreatorId", js.undefined)
    
    @scala.inline
    def setId(value: ResourceIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLabels(value: SharedLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SharedLabel*): Self = StObject.set(x, "Labels", js.Array(value :_*))
    
    @scala.inline
    def setLatestVersionMetadata(value: DocumentVersionMetadata): Self = StObject.set(x, "LatestVersionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionMetadataUndefined: Self = StObject.set(x, "LatestVersionMetadata", js.undefined)
    
    @scala.inline
    def setModifiedTimestamp(value: TimestampType): Self = StObject.set(x, "ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimestampUndefined: Self = StObject.set(x, "ModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: ResourceIdType): Self = StObject.set(x, "ParentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "ParentFolderId", js.undefined)
    
    @scala.inline
    def setResourceState(value: ResourceStateType): Self = StObject.set(x, "ResourceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStateUndefined: Self = StObject.set(x, "ResourceState", js.undefined)
  }
}
