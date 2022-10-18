package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderMetadata extends StObject {
  
  /**
    * The time when the folder was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var Id: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * List of labels on the folder.
    */
  var Labels: js.UndefOr[SharedLabels] = js.undefined
  
  /**
    * The size of the latest version of the folder metadata.
    */
  var LatestVersionSize: js.UndefOr[SizeType] = js.undefined
  
  /**
    * The time when the folder was updated.
    */
  var ModifiedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * The resource state of the folder.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
  
  /**
    * The unique identifier created from the subfolders and documents of the folder.
    */
  var Signature: js.UndefOr[HashType] = js.undefined
  
  /**
    * The size of the folder metadata.
    */
  var Size: js.UndefOr[SizeType] = js.undefined
}
object FolderMetadata {
  
  inline def apply(): FolderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderMetadata]
  }
  
  extension [Self <: FolderMetadata](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setCreatorId(value: IdType): Self = StObject.set(x, "CreatorId", value.asInstanceOf[js.Any])
    
    inline def setCreatorIdUndefined: Self = StObject.set(x, "CreatorId", js.undefined)
    
    inline def setId(value: ResourceIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLabels(value: SharedLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: SharedLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setLatestVersionSize(value: SizeType): Self = StObject.set(x, "LatestVersionSize", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionSizeUndefined: Self = StObject.set(x, "LatestVersionSize", js.undefined)
    
    inline def setModifiedTimestamp(value: js.Date): Self = StObject.set(x, "ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimestampUndefined: Self = StObject.set(x, "ModifiedTimestamp", js.undefined)
    
    inline def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParentFolderId(value: ResourceIdType): Self = StObject.set(x, "ParentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "ParentFolderId", js.undefined)
    
    inline def setResourceState(value: ResourceStateType): Self = StObject.set(x, "ResourceState", value.asInstanceOf[js.Any])
    
    inline def setResourceStateUndefined: Self = StObject.set(x, "ResourceState", js.undefined)
    
    inline def setSignature(value: HashType): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    inline def setSize(value: SizeType): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
