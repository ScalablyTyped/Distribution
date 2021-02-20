package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchReadOperation extends StObject {
  
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
  implicit class BatchReadOperationMutableBuilder[Self <: BatchReadOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLinkAttributes(value: BatchGetLinkAttributes): Self = StObject.set(x, "GetLinkAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLinkAttributesUndefined: Self = StObject.set(x, "GetLinkAttributes", js.undefined)
    
    @scala.inline
    def setGetObjectAttributes(value: BatchGetObjectAttributes): Self = StObject.set(x, "GetObjectAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjectAttributesUndefined: Self = StObject.set(x, "GetObjectAttributes", js.undefined)
    
    @scala.inline
    def setGetObjectInformation(value: BatchGetObjectInformation): Self = StObject.set(x, "GetObjectInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjectInformationUndefined: Self = StObject.set(x, "GetObjectInformation", js.undefined)
    
    @scala.inline
    def setListAttachedIndices(value: BatchListAttachedIndices): Self = StObject.set(x, "ListAttachedIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAttachedIndicesUndefined: Self = StObject.set(x, "ListAttachedIndices", js.undefined)
    
    @scala.inline
    def setListIncomingTypedLinks(value: BatchListIncomingTypedLinks): Self = StObject.set(x, "ListIncomingTypedLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIncomingTypedLinksUndefined: Self = StObject.set(x, "ListIncomingTypedLinks", js.undefined)
    
    @scala.inline
    def setListIndex(value: BatchListIndex): Self = StObject.set(x, "ListIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIndexUndefined: Self = StObject.set(x, "ListIndex", js.undefined)
    
    @scala.inline
    def setListObjectAttributes(value: BatchListObjectAttributes): Self = StObject.set(x, "ListObjectAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListObjectAttributesUndefined: Self = StObject.set(x, "ListObjectAttributes", js.undefined)
    
    @scala.inline
    def setListObjectChildren(value: BatchListObjectChildren): Self = StObject.set(x, "ListObjectChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListObjectChildrenUndefined: Self = StObject.set(x, "ListObjectChildren", js.undefined)
    
    @scala.inline
    def setListObjectParentPaths(value: BatchListObjectParentPaths): Self = StObject.set(x, "ListObjectParentPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListObjectParentPathsUndefined: Self = StObject.set(x, "ListObjectParentPaths", js.undefined)
    
    @scala.inline
    def setListObjectParents(value: BatchListObjectParents): Self = StObject.set(x, "ListObjectParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListObjectParentsUndefined: Self = StObject.set(x, "ListObjectParents", js.undefined)
    
    @scala.inline
    def setListObjectPolicies(value: BatchListObjectPolicies): Self = StObject.set(x, "ListObjectPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListObjectPoliciesUndefined: Self = StObject.set(x, "ListObjectPolicies", js.undefined)
    
    @scala.inline
    def setListOutgoingTypedLinks(value: BatchListOutgoingTypedLinks): Self = StObject.set(x, "ListOutgoingTypedLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListOutgoingTypedLinksUndefined: Self = StObject.set(x, "ListOutgoingTypedLinks", js.undefined)
    
    @scala.inline
    def setListPolicyAttachments(value: BatchListPolicyAttachments): Self = StObject.set(x, "ListPolicyAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPolicyAttachmentsUndefined: Self = StObject.set(x, "ListPolicyAttachments", js.undefined)
    
    @scala.inline
    def setLookupPolicy(value: BatchLookupPolicy): Self = StObject.set(x, "LookupPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupPolicyUndefined: Self = StObject.set(x, "LookupPolicy", js.undefined)
  }
}
