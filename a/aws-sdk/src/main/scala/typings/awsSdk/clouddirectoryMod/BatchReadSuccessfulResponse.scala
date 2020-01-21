package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadSuccessfulResponse extends js.Object {
  /**
    * The list of attributes to retrieve from the typed link.
    */
  var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributesResponse] = js.native
  /**
    * Retrieves attributes within a facet that are associated with an object.
    */
  var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributesResponse] = js.native
  /**
    * Retrieves metadata about an object.
    */
  var GetObjectInformation: js.UndefOr[BatchGetObjectInformationResponse] = js.native
  /**
    * Lists indices attached to an object.
    */
  var ListAttachedIndices: js.UndefOr[BatchListAttachedIndicesResponse] = js.native
  /**
    * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinksResponse] = js.native
  /**
    * Lists objects attached to the specified index.
    */
  var ListIndex: js.UndefOr[BatchListIndexResponse] = js.native
  /**
    * Lists all attributes that are associated with an object.
    */
  var ListObjectAttributes: js.UndefOr[BatchListObjectAttributesResponse] = js.native
  /**
    * Returns a paginated list of child objects that are associated with a given object.
    */
  var ListObjectChildren: js.UndefOr[BatchListObjectChildrenResponse] = js.native
  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure.
    */
  var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPathsResponse] = js.native
  var ListObjectParents: js.UndefOr[BatchListObjectParentsResponse] = js.native
  /**
    * Returns policies attached to an object in pagination fashion.
    */
  var ListObjectPolicies: js.UndefOr[BatchListObjectPoliciesResponse] = js.native
  /**
    * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinksResponse] = js.native
  /**
    * Returns all of the ObjectIdentifiers to which a given policy is attached.
    */
  var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachmentsResponse] = js.native
  /**
    * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
    */
  var LookupPolicy: js.UndefOr[BatchLookupPolicyResponse] = js.native
}

object BatchReadSuccessfulResponse {
  @scala.inline
  def apply(
    GetLinkAttributes: BatchGetLinkAttributesResponse = null,
    GetObjectAttributes: BatchGetObjectAttributesResponse = null,
    GetObjectInformation: BatchGetObjectInformationResponse = null,
    ListAttachedIndices: BatchListAttachedIndicesResponse = null,
    ListIncomingTypedLinks: BatchListIncomingTypedLinksResponse = null,
    ListIndex: BatchListIndexResponse = null,
    ListObjectAttributes: BatchListObjectAttributesResponse = null,
    ListObjectChildren: BatchListObjectChildrenResponse = null,
    ListObjectParentPaths: BatchListObjectParentPathsResponse = null,
    ListObjectParents: BatchListObjectParentsResponse = null,
    ListObjectPolicies: BatchListObjectPoliciesResponse = null,
    ListOutgoingTypedLinks: BatchListOutgoingTypedLinksResponse = null,
    ListPolicyAttachments: BatchListPolicyAttachmentsResponse = null,
    LookupPolicy: BatchLookupPolicyResponse = null
  ): BatchReadSuccessfulResponse = {
    val __obj = js.Dynamic.literal()
    if (GetLinkAttributes != null) __obj.updateDynamic("GetLinkAttributes")(GetLinkAttributes.asInstanceOf[js.Any])
    if (GetObjectAttributes != null) __obj.updateDynamic("GetObjectAttributes")(GetObjectAttributes.asInstanceOf[js.Any])
    if (GetObjectInformation != null) __obj.updateDynamic("GetObjectInformation")(GetObjectInformation.asInstanceOf[js.Any])
    if (ListAttachedIndices != null) __obj.updateDynamic("ListAttachedIndices")(ListAttachedIndices.asInstanceOf[js.Any])
    if (ListIncomingTypedLinks != null) __obj.updateDynamic("ListIncomingTypedLinks")(ListIncomingTypedLinks.asInstanceOf[js.Any])
    if (ListIndex != null) __obj.updateDynamic("ListIndex")(ListIndex.asInstanceOf[js.Any])
    if (ListObjectAttributes != null) __obj.updateDynamic("ListObjectAttributes")(ListObjectAttributes.asInstanceOf[js.Any])
    if (ListObjectChildren != null) __obj.updateDynamic("ListObjectChildren")(ListObjectChildren.asInstanceOf[js.Any])
    if (ListObjectParentPaths != null) __obj.updateDynamic("ListObjectParentPaths")(ListObjectParentPaths.asInstanceOf[js.Any])
    if (ListObjectParents != null) __obj.updateDynamic("ListObjectParents")(ListObjectParents.asInstanceOf[js.Any])
    if (ListObjectPolicies != null) __obj.updateDynamic("ListObjectPolicies")(ListObjectPolicies.asInstanceOf[js.Any])
    if (ListOutgoingTypedLinks != null) __obj.updateDynamic("ListOutgoingTypedLinks")(ListOutgoingTypedLinks.asInstanceOf[js.Any])
    if (ListPolicyAttachments != null) __obj.updateDynamic("ListPolicyAttachments")(ListPolicyAttachments.asInstanceOf[js.Any])
    if (LookupPolicy != null) __obj.updateDynamic("LookupPolicy")(LookupPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchReadSuccessfulResponse]
  }
}

