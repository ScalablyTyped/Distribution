package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceProfilesForRoleResponse extends StObject {
  
  /**
    * A list of instance profiles.
    */
  var InstanceProfiles: instanceProfileListType
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
}
object ListInstanceProfilesForRoleResponse {
  
  inline def apply(InstanceProfiles: instanceProfileListType): ListInstanceProfilesForRoleResponse = {
    val __obj = js.Dynamic.literal(InstanceProfiles = InstanceProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceProfilesForRoleResponse]
  }
  
  extension [Self <: ListInstanceProfilesForRoleResponse](x: Self) {
    
    inline def setInstanceProfiles(value: instanceProfileListType): Self = StObject.set(x, "InstanceProfiles", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfilesVarargs(value: InstanceProfile*): Self = StObject.set(x, "InstanceProfiles", js.Array(value*))
    
    inline def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
