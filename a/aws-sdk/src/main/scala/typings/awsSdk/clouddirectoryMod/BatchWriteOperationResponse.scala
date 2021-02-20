package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchWriteOperationResponse extends StObject {
  
  /**
    * The result of an add facet to object batch operation.
    */
  var AddFacetToObject: js.UndefOr[BatchAddFacetToObjectResponse] = js.native
  
  /**
    * Attaches an object to a Directory.
    */
  var AttachObject: js.UndefOr[BatchAttachObjectResponse] = js.native
  
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  var AttachPolicy: js.UndefOr[BatchAttachPolicyResponse] = js.native
  
  /**
    * Attaches the specified object to the specified index.
    */
  var AttachToIndex: js.UndefOr[BatchAttachToIndexResponse] = js.native
  
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  var AttachTypedLink: js.UndefOr[BatchAttachTypedLinkResponse] = js.native
  
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  var CreateIndex: js.UndefOr[BatchCreateIndexResponse] = js.native
  
  /**
    * Creates an object in a Directory.
    */
  var CreateObject: js.UndefOr[BatchCreateObjectResponse] = js.native
  
  /**
    * Deletes an object in a Directory.
    */
  var DeleteObject: js.UndefOr[BatchDeleteObjectResponse] = js.native
  
  /**
    * Detaches the specified object from the specified index.
    */
  var DetachFromIndex: js.UndefOr[BatchDetachFromIndexResponse] = js.native
  
  /**
    * Detaches an object from a Directory.
    */
  var DetachObject: js.UndefOr[BatchDetachObjectResponse] = js.native
  
  /**
    * Detaches a policy from a Directory.
    */
  var DetachPolicy: js.UndefOr[BatchDetachPolicyResponse] = js.native
  
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  var DetachTypedLink: js.UndefOr[BatchDetachTypedLinkResponse] = js.native
  
  /**
    * The result of a batch remove facet from object operation.
    */
  var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObjectResponse] = js.native
  
  /**
    * Represents the output of a BatchWrite response operation.
    */
  var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributesResponse] = js.native
  
  /**
    * Updates a given object’s attributes.
    */
  var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributesResponse] = js.native
}
object BatchWriteOperationResponse {
  
  @scala.inline
  def apply(): BatchWriteOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteOperationResponse]
  }
  
  @scala.inline
  implicit class BatchWriteOperationResponseMutableBuilder[Self <: BatchWriteOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddFacetToObject(value: BatchAddFacetToObjectResponse): Self = StObject.set(x, "AddFacetToObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddFacetToObjectUndefined: Self = StObject.set(x, "AddFacetToObject", js.undefined)
    
    @scala.inline
    def setAttachObject(value: BatchAttachObjectResponse): Self = StObject.set(x, "AttachObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachObjectUndefined: Self = StObject.set(x, "AttachObject", js.undefined)
    
    @scala.inline
    def setAttachPolicy(value: BatchAttachPolicyResponse): Self = StObject.set(x, "AttachPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachPolicyUndefined: Self = StObject.set(x, "AttachPolicy", js.undefined)
    
    @scala.inline
    def setAttachToIndex(value: BatchAttachToIndexResponse): Self = StObject.set(x, "AttachToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachToIndexUndefined: Self = StObject.set(x, "AttachToIndex", js.undefined)
    
    @scala.inline
    def setAttachTypedLink(value: BatchAttachTypedLinkResponse): Self = StObject.set(x, "AttachTypedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachTypedLinkUndefined: Self = StObject.set(x, "AttachTypedLink", js.undefined)
    
    @scala.inline
    def setCreateIndex(value: BatchCreateIndexResponse): Self = StObject.set(x, "CreateIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateIndexUndefined: Self = StObject.set(x, "CreateIndex", js.undefined)
    
    @scala.inline
    def setCreateObject(value: BatchCreateObjectResponse): Self = StObject.set(x, "CreateObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateObjectUndefined: Self = StObject.set(x, "CreateObject", js.undefined)
    
    @scala.inline
    def setDeleteObject(value: BatchDeleteObjectResponse): Self = StObject.set(x, "DeleteObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteObjectUndefined: Self = StObject.set(x, "DeleteObject", js.undefined)
    
    @scala.inline
    def setDetachFromIndex(value: BatchDetachFromIndexResponse): Self = StObject.set(x, "DetachFromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachFromIndexUndefined: Self = StObject.set(x, "DetachFromIndex", js.undefined)
    
    @scala.inline
    def setDetachObject(value: BatchDetachObjectResponse): Self = StObject.set(x, "DetachObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachObjectUndefined: Self = StObject.set(x, "DetachObject", js.undefined)
    
    @scala.inline
    def setDetachPolicy(value: BatchDetachPolicyResponse): Self = StObject.set(x, "DetachPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachPolicyUndefined: Self = StObject.set(x, "DetachPolicy", js.undefined)
    
    @scala.inline
    def setDetachTypedLink(value: BatchDetachTypedLinkResponse): Self = StObject.set(x, "DetachTypedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachTypedLinkUndefined: Self = StObject.set(x, "DetachTypedLink", js.undefined)
    
    @scala.inline
    def setRemoveFacetFromObject(value: BatchRemoveFacetFromObjectResponse): Self = StObject.set(x, "RemoveFacetFromObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFacetFromObjectUndefined: Self = StObject.set(x, "RemoveFacetFromObject", js.undefined)
    
    @scala.inline
    def setUpdateLinkAttributes(value: BatchUpdateLinkAttributesResponse): Self = StObject.set(x, "UpdateLinkAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLinkAttributesUndefined: Self = StObject.set(x, "UpdateLinkAttributes", js.undefined)
    
    @scala.inline
    def setUpdateObjectAttributes(value: BatchUpdateObjectAttributesResponse): Self = StObject.set(x, "UpdateObjectAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateObjectAttributesUndefined: Self = StObject.set(x, "UpdateObjectAttributes", js.undefined)
  }
}
