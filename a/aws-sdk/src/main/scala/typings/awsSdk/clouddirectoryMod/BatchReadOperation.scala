package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadOperation extends js.Object {
  /**
    * Retrieves attributes that are associated with a typed link.
    */
  var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributes] = js.native
  /**
    * Retrieves attributes within a facet that are associated with an object.
    */
  var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributes] = js.native
  /**
    * Retrieves metadata about an object.
    */
  var GetObjectInformation: js.UndefOr[BatchGetObjectInformation] = js.native
  /**
    * Lists indices attached to an object.
    */
  var ListAttachedIndices: js.UndefOr[BatchListAttachedIndices] = js.native
  /**
    * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinks] = js.native
  /**
    * Lists objects attached to the specified index.
    */
  var ListIndex: js.UndefOr[BatchListIndex] = js.native
  /**
    * Lists all attributes that are associated with an object.
    */
  var ListObjectAttributes: js.UndefOr[BatchListObjectAttributes] = js.native
  /**
    * Returns a paginated list of child objects that are associated with a given object.
    */
  var ListObjectChildren: js.UndefOr[BatchListObjectChildren] = js.native
  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure.
    */
  var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPaths] = js.native
  var ListObjectParents: js.UndefOr[BatchListObjectParents] = js.native
  /**
    * Returns policies attached to an object in pagination fashion.
    */
  var ListObjectPolicies: js.UndefOr[BatchListObjectPolicies] = js.native
  /**
    * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinks] = js.native
  /**
    * Returns all of the ObjectIdentifiers to which a given policy is attached.
    */
  var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachments] = js.native
  /**
    * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
    */
  var LookupPolicy: js.UndefOr[BatchLookupPolicy] = js.native
}

object BatchReadOperation {
  @scala.inline
  def apply(): BatchReadOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadOperation]
  }
  @scala.inline
  implicit class BatchReadOperationOps[Self <: BatchReadOperation] (val x: Self) extends AnyVal {
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
    def setGetLinkAttributes(value: BatchGetLinkAttributes): Self = this.set("GetLinkAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetLinkAttributes: Self = this.set("GetLinkAttributes", js.undefined)
    @scala.inline
    def setGetObjectAttributes(value: BatchGetObjectAttributes): Self = this.set("GetObjectAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetObjectAttributes: Self = this.set("GetObjectAttributes", js.undefined)
    @scala.inline
    def setGetObjectInformation(value: BatchGetObjectInformation): Self = this.set("GetObjectInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetObjectInformation: Self = this.set("GetObjectInformation", js.undefined)
    @scala.inline
    def setListAttachedIndices(value: BatchListAttachedIndices): Self = this.set("ListAttachedIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListAttachedIndices: Self = this.set("ListAttachedIndices", js.undefined)
    @scala.inline
    def setListIncomingTypedLinks(value: BatchListIncomingTypedLinks): Self = this.set("ListIncomingTypedLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListIncomingTypedLinks: Self = this.set("ListIncomingTypedLinks", js.undefined)
    @scala.inline
    def setListIndex(value: BatchListIndex): Self = this.set("ListIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListIndex: Self = this.set("ListIndex", js.undefined)
    @scala.inline
    def setListObjectAttributes(value: BatchListObjectAttributes): Self = this.set("ListObjectAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListObjectAttributes: Self = this.set("ListObjectAttributes", js.undefined)
    @scala.inline
    def setListObjectChildren(value: BatchListObjectChildren): Self = this.set("ListObjectChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListObjectChildren: Self = this.set("ListObjectChildren", js.undefined)
    @scala.inline
    def setListObjectParentPaths(value: BatchListObjectParentPaths): Self = this.set("ListObjectParentPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListObjectParentPaths: Self = this.set("ListObjectParentPaths", js.undefined)
    @scala.inline
    def setListObjectParents(value: BatchListObjectParents): Self = this.set("ListObjectParents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListObjectParents: Self = this.set("ListObjectParents", js.undefined)
    @scala.inline
    def setListObjectPolicies(value: BatchListObjectPolicies): Self = this.set("ListObjectPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListObjectPolicies: Self = this.set("ListObjectPolicies", js.undefined)
    @scala.inline
    def setListOutgoingTypedLinks(value: BatchListOutgoingTypedLinks): Self = this.set("ListOutgoingTypedLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListOutgoingTypedLinks: Self = this.set("ListOutgoingTypedLinks", js.undefined)
    @scala.inline
    def setListPolicyAttachments(value: BatchListPolicyAttachments): Self = this.set("ListPolicyAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListPolicyAttachments: Self = this.set("ListPolicyAttachments", js.undefined)
    @scala.inline
    def setLookupPolicy(value: BatchLookupPolicy): Self = this.set("LookupPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookupPolicy: Self = this.set("LookupPolicy", js.undefined)
  }
  
}

