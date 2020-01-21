package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchWriteOperation extends js.Object {
  /**
    * A batch operation that adds a facet to an object.
    */
  var AddFacetToObject: js.UndefOr[BatchAddFacetToObject] = js.native
  /**
    * Attaches an object to a Directory.
    */
  var AttachObject: js.UndefOr[BatchAttachObject] = js.native
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  var AttachPolicy: js.UndefOr[BatchAttachPolicy] = js.native
  /**
    * Attaches the specified object to the specified index.
    */
  var AttachToIndex: js.UndefOr[BatchAttachToIndex] = js.native
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  var AttachTypedLink: js.UndefOr[BatchAttachTypedLink] = js.native
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  var CreateIndex: js.UndefOr[BatchCreateIndex] = js.native
  /**
    * Creates an object.
    */
  var CreateObject: js.UndefOr[BatchCreateObject] = js.native
  /**
    * Deletes an object in a Directory.
    */
  var DeleteObject: js.UndefOr[BatchDeleteObject] = js.native
  /**
    * Detaches the specified object from the specified index.
    */
  var DetachFromIndex: js.UndefOr[BatchDetachFromIndex] = js.native
  /**
    * Detaches an object from a Directory.
    */
  var DetachObject: js.UndefOr[BatchDetachObject] = js.native
  /**
    * Detaches a policy from a Directory.
    */
  var DetachPolicy: js.UndefOr[BatchDetachPolicy] = js.native
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  var DetachTypedLink: js.UndefOr[BatchDetachTypedLink] = js.native
  /**
    * A batch operation that removes a facet from an object.
    */
  var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObject] = js.native
  /**
    * Updates a given object's attributes.
    */
  var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributes] = js.native
  /**
    * Updates a given object's attributes.
    */
  var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributes] = js.native
}

object BatchWriteOperation {
  @scala.inline
  def apply(
    AddFacetToObject: BatchAddFacetToObject = null,
    AttachObject: BatchAttachObject = null,
    AttachPolicy: BatchAttachPolicy = null,
    AttachToIndex: BatchAttachToIndex = null,
    AttachTypedLink: BatchAttachTypedLink = null,
    CreateIndex: BatchCreateIndex = null,
    CreateObject: BatchCreateObject = null,
    DeleteObject: BatchDeleteObject = null,
    DetachFromIndex: BatchDetachFromIndex = null,
    DetachObject: BatchDetachObject = null,
    DetachPolicy: BatchDetachPolicy = null,
    DetachTypedLink: BatchDetachTypedLink = null,
    RemoveFacetFromObject: BatchRemoveFacetFromObject = null,
    UpdateLinkAttributes: BatchUpdateLinkAttributes = null,
    UpdateObjectAttributes: BatchUpdateObjectAttributes = null
  ): BatchWriteOperation = {
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
    __obj.asInstanceOf[BatchWriteOperation]
  }
}

