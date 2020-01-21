package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchWriteOperationResponse extends js.Object {
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
  def apply(
    AddFacetToObject: BatchAddFacetToObjectResponse = null,
    AttachObject: BatchAttachObjectResponse = null,
    AttachPolicy: BatchAttachPolicyResponse = null,
    AttachToIndex: BatchAttachToIndexResponse = null,
    AttachTypedLink: BatchAttachTypedLinkResponse = null,
    CreateIndex: BatchCreateIndexResponse = null,
    CreateObject: BatchCreateObjectResponse = null,
    DeleteObject: BatchDeleteObjectResponse = null,
    DetachFromIndex: BatchDetachFromIndexResponse = null,
    DetachObject: BatchDetachObjectResponse = null,
    DetachPolicy: BatchDetachPolicyResponse = null,
    DetachTypedLink: BatchDetachTypedLinkResponse = null,
    RemoveFacetFromObject: BatchRemoveFacetFromObjectResponse = null,
    UpdateLinkAttributes: BatchUpdateLinkAttributesResponse = null,
    UpdateObjectAttributes: BatchUpdateObjectAttributesResponse = null
  ): BatchWriteOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (AddFacetToObject != null) __obj.updateDynamic("AddFacetToObject")(AddFacetToObject.asInstanceOf[js.Any])
    if (AttachObject != null) __obj.updateDynamic("AttachObject")(AttachObject.asInstanceOf[js.Any])
    if (AttachPolicy != null) __obj.updateDynamic("AttachPolicy")(AttachPolicy.asInstanceOf[js.Any])
    if (AttachToIndex != null) __obj.updateDynamic("AttachToIndex")(AttachToIndex.asInstanceOf[js.Any])
    if (AttachTypedLink != null) __obj.updateDynamic("AttachTypedLink")(AttachTypedLink.asInstanceOf[js.Any])
    if (CreateIndex != null) __obj.updateDynamic("CreateIndex")(CreateIndex.asInstanceOf[js.Any])
    if (CreateObject != null) __obj.updateDynamic("CreateObject")(CreateObject.asInstanceOf[js.Any])
    if (DeleteObject != null) __obj.updateDynamic("DeleteObject")(DeleteObject.asInstanceOf[js.Any])
    if (DetachFromIndex != null) __obj.updateDynamic("DetachFromIndex")(DetachFromIndex.asInstanceOf[js.Any])
    if (DetachObject != null) __obj.updateDynamic("DetachObject")(DetachObject.asInstanceOf[js.Any])
    if (DetachPolicy != null) __obj.updateDynamic("DetachPolicy")(DetachPolicy.asInstanceOf[js.Any])
    if (DetachTypedLink != null) __obj.updateDynamic("DetachTypedLink")(DetachTypedLink.asInstanceOf[js.Any])
    if (RemoveFacetFromObject != null) __obj.updateDynamic("RemoveFacetFromObject")(RemoveFacetFromObject.asInstanceOf[js.Any])
    if (UpdateLinkAttributes != null) __obj.updateDynamic("UpdateLinkAttributes")(UpdateLinkAttributes.asInstanceOf[js.Any])
    if (UpdateObjectAttributes != null) __obj.updateDynamic("UpdateObjectAttributes")(UpdateObjectAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchWriteOperationResponse]
  }
}

