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
  def apply(): BatchWriteOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteOperationResponse]
  }
  @scala.inline
  implicit class BatchWriteOperationResponseOps[Self <: BatchWriteOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddFacetToObject(value: BatchAddFacetToObjectResponse): Self = this.set("AddFacetToObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddFacetToObject: Self = this.set("AddFacetToObject", js.undefined)
    @scala.inline
    def setAttachObject(value: BatchAttachObjectResponse): Self = this.set("AttachObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachObject: Self = this.set("AttachObject", js.undefined)
    @scala.inline
    def setAttachPolicy(value: BatchAttachPolicyResponse): Self = this.set("AttachPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachPolicy: Self = this.set("AttachPolicy", js.undefined)
    @scala.inline
    def setAttachToIndex(value: BatchAttachToIndexResponse): Self = this.set("AttachToIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachToIndex: Self = this.set("AttachToIndex", js.undefined)
    @scala.inline
    def setAttachTypedLink(value: BatchAttachTypedLinkResponse): Self = this.set("AttachTypedLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachTypedLink: Self = this.set("AttachTypedLink", js.undefined)
    @scala.inline
    def setCreateIndex(value: BatchCreateIndexResponse): Self = this.set("CreateIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateIndex: Self = this.set("CreateIndex", js.undefined)
    @scala.inline
    def setCreateObject(value: BatchCreateObjectResponse): Self = this.set("CreateObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateObject: Self = this.set("CreateObject", js.undefined)
    @scala.inline
    def setDeleteObject(value: BatchDeleteObjectResponse): Self = this.set("DeleteObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteObject: Self = this.set("DeleteObject", js.undefined)
    @scala.inline
    def setDetachFromIndex(value: BatchDetachFromIndexResponse): Self = this.set("DetachFromIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetachFromIndex: Self = this.set("DetachFromIndex", js.undefined)
    @scala.inline
    def setDetachObject(value: BatchDetachObjectResponse): Self = this.set("DetachObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetachObject: Self = this.set("DetachObject", js.undefined)
    @scala.inline
    def setDetachPolicy(value: BatchDetachPolicyResponse): Self = this.set("DetachPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetachPolicy: Self = this.set("DetachPolicy", js.undefined)
    @scala.inline
    def setDetachTypedLink(value: BatchDetachTypedLinkResponse): Self = this.set("DetachTypedLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetachTypedLink: Self = this.set("DetachTypedLink", js.undefined)
    @scala.inline
    def setRemoveFacetFromObject(value: BatchRemoveFacetFromObjectResponse): Self = this.set("RemoveFacetFromObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveFacetFromObject: Self = this.set("RemoveFacetFromObject", js.undefined)
    @scala.inline
    def setUpdateLinkAttributes(value: BatchUpdateLinkAttributesResponse): Self = this.set("UpdateLinkAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateLinkAttributes: Self = this.set("UpdateLinkAttributes", js.undefined)
    @scala.inline
    def setUpdateObjectAttributes(value: BatchUpdateObjectAttributesResponse): Self = this.set("UpdateObjectAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateObjectAttributes: Self = this.set("UpdateObjectAttributes", js.undefined)
  }
  
}

