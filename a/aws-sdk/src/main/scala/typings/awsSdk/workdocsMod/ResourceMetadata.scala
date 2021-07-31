package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceMetadata extends StObject {
  
  /**
    * The ID of the resource.
    */
  var Id: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * The original name of the resource before a rename operation.
    */
  var OriginalName: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * The owner of the resource.
    */
  var Owner: js.UndefOr[UserMetadata] = js.undefined
  
  /**
    * The parent ID of the resource before a rename operation.
    */
  var ParentId: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The version ID of the resource. This is an optional field and is filled for action on document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined
}
object ResourceMetadata {
  
  @scala.inline
  def apply(): ResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceMetadata]
  }
  
  @scala.inline
  implicit class ResourceMetadataMutableBuilder[Self <: ResourceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOriginalName(value: ResourceNameType): Self = StObject.set(x, "OriginalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalNameUndefined: Self = StObject.set(x, "OriginalName", js.undefined)
    
    @scala.inline
    def setOwner(value: UserMetadata): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setParentId(value: ResourceIdType): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
    
    @scala.inline
    def setType(value: ResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
