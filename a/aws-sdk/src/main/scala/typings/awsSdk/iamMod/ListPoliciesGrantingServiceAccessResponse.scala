package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPoliciesGrantingServiceAccessResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
  
  /**
    * A ListPoliciesGrantingServiceAccess object that contains details about the permissions policies attached to the specified identity (user, group, or role).
    */
  var PoliciesGrantingServiceAccess: listPolicyGrantingServiceAccessResponseListType
}
object ListPoliciesGrantingServiceAccessResponse {
  
  @scala.inline
  def apply(PoliciesGrantingServiceAccess: listPolicyGrantingServiceAccessResponseListType): ListPoliciesGrantingServiceAccessResponse = {
    val __obj = js.Dynamic.literal(PoliciesGrantingServiceAccess = PoliciesGrantingServiceAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPoliciesGrantingServiceAccessResponse]
  }
  
  @scala.inline
  implicit class ListPoliciesGrantingServiceAccessResponseMutableBuilder[Self <: ListPoliciesGrantingServiceAccessResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setPoliciesGrantingServiceAccess(value: listPolicyGrantingServiceAccessResponseListType): Self = StObject.set(x, "PoliciesGrantingServiceAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesGrantingServiceAccessVarargs(value: ListPoliciesGrantingServiceAccessEntry*): Self = StObject.set(x, "PoliciesGrantingServiceAccess", js.Array(value :_*))
  }
}
