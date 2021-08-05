package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchReadSuccessfulResponse extends StObject {
  
  /**
    * The list of attributes to retrieve from the typed link.
    */
  var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributesResponse] = js.undefined
  
  /**
    * Retrieves attributes within a facet that are associated with an object.
    */
  var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributesResponse] = js.undefined
  
  /**
    * Retrieves metadata about an object.
    */
  var GetObjectInformation: js.UndefOr[BatchGetObjectInformationResponse] = js.undefined
  
  /**
    * Lists indices attached to an object.
    */
  var ListAttachedIndices: js.UndefOr[BatchListAttachedIndicesResponse] = js.undefined
  
  /**
    * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinksResponse] = js.undefined
  
  /**
    * Lists objects attached to the specified index.
    */
  var ListIndex: js.UndefOr[BatchListIndexResponse] = js.undefined
  
  /**
    * Lists all attributes that are associated with an object.
    */
  var ListObjectAttributes: js.UndefOr[BatchListObjectAttributesResponse] = js.undefined
  
  /**
    * Returns a paginated list of child objects that are associated with a given object.
    */
  var ListObjectChildren: js.UndefOr[BatchListObjectChildrenResponse] = js.undefined
  
  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure.
    */
  var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPathsResponse] = js.undefined
  
  var ListObjectParents: js.UndefOr[BatchListObjectParentsResponse] = js.undefined
  
  /**
    * Returns policies attached to an object in pagination fashion.
    */
  var ListObjectPolicies: js.UndefOr[BatchListObjectPoliciesResponse] = js.undefined
  
  /**
    * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinksResponse] = js.undefined
  
  /**
    * Returns all of the ObjectIdentifiers to which a given policy is attached.
    */
  var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachmentsResponse] = js.undefined
  
  /**
    * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
    */
  var LookupPolicy: js.UndefOr[BatchLookupPolicyResponse] = js.undefined
}
object BatchReadSuccessfulResponse {
  
  inline def apply(): BatchReadSuccessfulResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadSuccessfulResponse]
  }
  
  extension [Self <: BatchReadSuccessfulResponse](x: Self) {
    
    inline def setGetLinkAttributes(value: BatchGetLinkAttributesResponse): Self = StObject.set(x, "GetLinkAttributes", value.asInstanceOf[js.Any])
    
    inline def setGetLinkAttributesUndefined: Self = StObject.set(x, "GetLinkAttributes", js.undefined)
    
    inline def setGetObjectAttributes(value: BatchGetObjectAttributesResponse): Self = StObject.set(x, "GetObjectAttributes", value.asInstanceOf[js.Any])
    
    inline def setGetObjectAttributesUndefined: Self = StObject.set(x, "GetObjectAttributes", js.undefined)
    
    inline def setGetObjectInformation(value: BatchGetObjectInformationResponse): Self = StObject.set(x, "GetObjectInformation", value.asInstanceOf[js.Any])
    
    inline def setGetObjectInformationUndefined: Self = StObject.set(x, "GetObjectInformation", js.undefined)
    
    inline def setListAttachedIndices(value: BatchListAttachedIndicesResponse): Self = StObject.set(x, "ListAttachedIndices", value.asInstanceOf[js.Any])
    
    inline def setListAttachedIndicesUndefined: Self = StObject.set(x, "ListAttachedIndices", js.undefined)
    
    inline def setListIncomingTypedLinks(value: BatchListIncomingTypedLinksResponse): Self = StObject.set(x, "ListIncomingTypedLinks", value.asInstanceOf[js.Any])
    
    inline def setListIncomingTypedLinksUndefined: Self = StObject.set(x, "ListIncomingTypedLinks", js.undefined)
    
    inline def setListIndex(value: BatchListIndexResponse): Self = StObject.set(x, "ListIndex", value.asInstanceOf[js.Any])
    
    inline def setListIndexUndefined: Self = StObject.set(x, "ListIndex", js.undefined)
    
    inline def setListObjectAttributes(value: BatchListObjectAttributesResponse): Self = StObject.set(x, "ListObjectAttributes", value.asInstanceOf[js.Any])
    
    inline def setListObjectAttributesUndefined: Self = StObject.set(x, "ListObjectAttributes", js.undefined)
    
    inline def setListObjectChildren(value: BatchListObjectChildrenResponse): Self = StObject.set(x, "ListObjectChildren", value.asInstanceOf[js.Any])
    
    inline def setListObjectChildrenUndefined: Self = StObject.set(x, "ListObjectChildren", js.undefined)
    
    inline def setListObjectParentPaths(value: BatchListObjectParentPathsResponse): Self = StObject.set(x, "ListObjectParentPaths", value.asInstanceOf[js.Any])
    
    inline def setListObjectParentPathsUndefined: Self = StObject.set(x, "ListObjectParentPaths", js.undefined)
    
    inline def setListObjectParents(value: BatchListObjectParentsResponse): Self = StObject.set(x, "ListObjectParents", value.asInstanceOf[js.Any])
    
    inline def setListObjectParentsUndefined: Self = StObject.set(x, "ListObjectParents", js.undefined)
    
    inline def setListObjectPolicies(value: BatchListObjectPoliciesResponse): Self = StObject.set(x, "ListObjectPolicies", value.asInstanceOf[js.Any])
    
    inline def setListObjectPoliciesUndefined: Self = StObject.set(x, "ListObjectPolicies", js.undefined)
    
    inline def setListOutgoingTypedLinks(value: BatchListOutgoingTypedLinksResponse): Self = StObject.set(x, "ListOutgoingTypedLinks", value.asInstanceOf[js.Any])
    
    inline def setListOutgoingTypedLinksUndefined: Self = StObject.set(x, "ListOutgoingTypedLinks", js.undefined)
    
    inline def setListPolicyAttachments(value: BatchListPolicyAttachmentsResponse): Self = StObject.set(x, "ListPolicyAttachments", value.asInstanceOf[js.Any])
    
    inline def setListPolicyAttachmentsUndefined: Self = StObject.set(x, "ListPolicyAttachments", js.undefined)
    
    inline def setLookupPolicy(value: BatchLookupPolicyResponse): Self = StObject.set(x, "LookupPolicy", value.asInstanceOf[js.Any])
    
    inline def setLookupPolicyUndefined: Self = StObject.set(x, "LookupPolicy", js.undefined)
  }
}
