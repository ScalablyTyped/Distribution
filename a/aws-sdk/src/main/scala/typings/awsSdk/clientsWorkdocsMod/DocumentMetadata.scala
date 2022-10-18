package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentMetadata extends StObject {
  
  /**
    * The time when the document was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
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
  var ModifiedTimestamp: js.UndefOr[js.Date] = js.undefined
  
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
  
  inline def apply(): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMetadata]
  }
  
  extension [Self <: DocumentMetadata](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setCreatorId(value: IdType): Self = StObject.set(x, "CreatorId", value.asInstanceOf[js.Any])
    
    inline def setCreatorIdUndefined: Self = StObject.set(x, "CreatorId", js.undefined)
    
    inline def setId(value: ResourceIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLabels(value: SharedLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: SharedLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setLatestVersionMetadata(value: DocumentVersionMetadata): Self = StObject.set(x, "LatestVersionMetadata", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionMetadataUndefined: Self = StObject.set(x, "LatestVersionMetadata", js.undefined)
    
    inline def setModifiedTimestamp(value: js.Date): Self = StObject.set(x, "ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimestampUndefined: Self = StObject.set(x, "ModifiedTimestamp", js.undefined)
    
    inline def setParentFolderId(value: ResourceIdType): Self = StObject.set(x, "ParentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "ParentFolderId", js.undefined)
    
    inline def setResourceState(value: ResourceStateType): Self = StObject.set(x, "ResourceState", value.asInstanceOf[js.Any])
    
    inline def setResourceStateUndefined: Self = StObject.set(x, "ResourceState", js.undefined)
  }
}
