package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteOperationResponse extends StObject {
  
  /**
    * The result of an add facet to object batch operation.
    */
  var AddFacetToObject: js.UndefOr[BatchAddFacetToObjectResponse] = js.undefined
  
  /**
    * Attaches an object to a Directory.
    */
  var AttachObject: js.UndefOr[BatchAttachObjectResponse] = js.undefined
  
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  var AttachPolicy: js.UndefOr[BatchAttachPolicyResponse] = js.undefined
  
  /**
    * Attaches the specified object to the specified index.
    */
  var AttachToIndex: js.UndefOr[BatchAttachToIndexResponse] = js.undefined
  
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  var AttachTypedLink: js.UndefOr[BatchAttachTypedLinkResponse] = js.undefined
  
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  var CreateIndex: js.UndefOr[BatchCreateIndexResponse] = js.undefined
  
  /**
    * Creates an object in a Directory.
    */
  var CreateObject: js.UndefOr[BatchCreateObjectResponse] = js.undefined
  
  /**
    * Deletes an object in a Directory.
    */
  var DeleteObject: js.UndefOr[BatchDeleteObjectResponse] = js.undefined
  
  /**
    * Detaches the specified object from the specified index.
    */
  var DetachFromIndex: js.UndefOr[BatchDetachFromIndexResponse] = js.undefined
  
  /**
    * Detaches an object from a Directory.
    */
  var DetachObject: js.UndefOr[BatchDetachObjectResponse] = js.undefined
  
  /**
    * Detaches a policy from a Directory.
    */
  var DetachPolicy: js.UndefOr[BatchDetachPolicyResponse] = js.undefined
  
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  var DetachTypedLink: js.UndefOr[BatchDetachTypedLinkResponse] = js.undefined
  
  /**
    * The result of a batch remove facet from object operation.
    */
  var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObjectResponse] = js.undefined
  
  /**
    * Represents the output of a BatchWrite response operation.
    */
  var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributesResponse] = js.undefined
  
  /**
    * Updates a given object’s attributes.
    */
  var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributesResponse] = js.undefined
}
object BatchWriteOperationResponse {
  
  inline def apply(): BatchWriteOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteOperationResponse]
  }
  
  extension [Self <: BatchWriteOperationResponse](x: Self) {
    
    inline def setAddFacetToObject(value: BatchAddFacetToObjectResponse): Self = StObject.set(x, "AddFacetToObject", value.asInstanceOf[js.Any])
    
    inline def setAddFacetToObjectUndefined: Self = StObject.set(x, "AddFacetToObject", js.undefined)
    
    inline def setAttachObject(value: BatchAttachObjectResponse): Self = StObject.set(x, "AttachObject", value.asInstanceOf[js.Any])
    
    inline def setAttachObjectUndefined: Self = StObject.set(x, "AttachObject", js.undefined)
    
    inline def setAttachPolicy(value: BatchAttachPolicyResponse): Self = StObject.set(x, "AttachPolicy", value.asInstanceOf[js.Any])
    
    inline def setAttachPolicyUndefined: Self = StObject.set(x, "AttachPolicy", js.undefined)
    
    inline def setAttachToIndex(value: BatchAttachToIndexResponse): Self = StObject.set(x, "AttachToIndex", value.asInstanceOf[js.Any])
    
    inline def setAttachToIndexUndefined: Self = StObject.set(x, "AttachToIndex", js.undefined)
    
    inline def setAttachTypedLink(value: BatchAttachTypedLinkResponse): Self = StObject.set(x, "AttachTypedLink", value.asInstanceOf[js.Any])
    
    inline def setAttachTypedLinkUndefined: Self = StObject.set(x, "AttachTypedLink", js.undefined)
    
    inline def setCreateIndex(value: BatchCreateIndexResponse): Self = StObject.set(x, "CreateIndex", value.asInstanceOf[js.Any])
    
    inline def setCreateIndexUndefined: Self = StObject.set(x, "CreateIndex", js.undefined)
    
    inline def setCreateObject(value: BatchCreateObjectResponse): Self = StObject.set(x, "CreateObject", value.asInstanceOf[js.Any])
    
    inline def setCreateObjectUndefined: Self = StObject.set(x, "CreateObject", js.undefined)
    
    inline def setDeleteObject(value: BatchDeleteObjectResponse): Self = StObject.set(x, "DeleteObject", value.asInstanceOf[js.Any])
    
    inline def setDeleteObjectUndefined: Self = StObject.set(x, "DeleteObject", js.undefined)
    
    inline def setDetachFromIndex(value: BatchDetachFromIndexResponse): Self = StObject.set(x, "DetachFromIndex", value.asInstanceOf[js.Any])
    
    inline def setDetachFromIndexUndefined: Self = StObject.set(x, "DetachFromIndex", js.undefined)
    
    inline def setDetachObject(value: BatchDetachObjectResponse): Self = StObject.set(x, "DetachObject", value.asInstanceOf[js.Any])
    
    inline def setDetachObjectUndefined: Self = StObject.set(x, "DetachObject", js.undefined)
    
    inline def setDetachPolicy(value: BatchDetachPolicyResponse): Self = StObject.set(x, "DetachPolicy", value.asInstanceOf[js.Any])
    
    inline def setDetachPolicyUndefined: Self = StObject.set(x, "DetachPolicy", js.undefined)
    
    inline def setDetachTypedLink(value: BatchDetachTypedLinkResponse): Self = StObject.set(x, "DetachTypedLink", value.asInstanceOf[js.Any])
    
    inline def setDetachTypedLinkUndefined: Self = StObject.set(x, "DetachTypedLink", js.undefined)
    
    inline def setRemoveFacetFromObject(value: BatchRemoveFacetFromObjectResponse): Self = StObject.set(x, "RemoveFacetFromObject", value.asInstanceOf[js.Any])
    
    inline def setRemoveFacetFromObjectUndefined: Self = StObject.set(x, "RemoveFacetFromObject", js.undefined)
    
    inline def setUpdateLinkAttributes(value: BatchUpdateLinkAttributesResponse): Self = StObject.set(x, "UpdateLinkAttributes", value.asInstanceOf[js.Any])
    
    inline def setUpdateLinkAttributesUndefined: Self = StObject.set(x, "UpdateLinkAttributes", js.undefined)
    
    inline def setUpdateObjectAttributes(value: BatchUpdateObjectAttributesResponse): Self = StObject.set(x, "UpdateObjectAttributes", value.asInstanceOf[js.Any])
    
    inline def setUpdateObjectAttributesUndefined: Self = StObject.set(x, "UpdateObjectAttributes", js.undefined)
  }
}
