package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountAuthorizationDetailsResponse extends StObject {
  
  /**
    * A list containing information about IAM groups.
    */
  var GroupDetailList: js.UndefOr[groupDetailListType] = js.undefined
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
  
  /**
    * A list containing information about managed policies.
    */
  var Policies: js.UndefOr[ManagedPolicyDetailListType] = js.undefined
  
  /**
    * A list containing information about IAM roles.
    */
  var RoleDetailList: js.UndefOr[roleDetailListType] = js.undefined
  
  /**
    * A list containing information about IAM users.
    */
  var UserDetailList: js.UndefOr[userDetailListType] = js.undefined
}
object GetAccountAuthorizationDetailsResponse {
  
  inline def apply(): GetAccountAuthorizationDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountAuthorizationDetailsResponse]
  }
  
  extension [Self <: GetAccountAuthorizationDetailsResponse](x: Self) {
    
    inline def setGroupDetailList(value: groupDetailListType): Self = StObject.set(x, "GroupDetailList", value.asInstanceOf[js.Any])
    
    inline def setGroupDetailListUndefined: Self = StObject.set(x, "GroupDetailList", js.undefined)
    
    inline def setGroupDetailListVarargs(value: GroupDetail*): Self = StObject.set(x, "GroupDetailList", js.Array(value :_*))
    
    inline def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setPolicies(value: ManagedPolicyDetailListType): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setPoliciesVarargs(value: ManagedPolicyDetail*): Self = StObject.set(x, "Policies", js.Array(value :_*))
    
    inline def setRoleDetailList(value: roleDetailListType): Self = StObject.set(x, "RoleDetailList", value.asInstanceOf[js.Any])
    
    inline def setRoleDetailListUndefined: Self = StObject.set(x, "RoleDetailList", js.undefined)
    
    inline def setRoleDetailListVarargs(value: RoleDetail*): Self = StObject.set(x, "RoleDetailList", js.Array(value :_*))
    
    inline def setUserDetailList(value: userDetailListType): Self = StObject.set(x, "UserDetailList", value.asInstanceOf[js.Any])
    
    inline def setUserDetailListUndefined: Self = StObject.set(x, "UserDetailList", js.undefined)
    
    inline def setUserDetailListVarargs(value: UserDetail*): Self = StObject.set(x, "UserDetailList", js.Array(value :_*))
  }
}
