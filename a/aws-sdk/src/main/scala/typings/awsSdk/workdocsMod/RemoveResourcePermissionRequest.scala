package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveResourcePermissionRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The principal ID of the resource.
    */
  var PrincipalId: IdType
  
  /**
    * The principal type of the resource.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.workdocsMod.PrincipalType] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}
object RemoveResourcePermissionRequest {
  
  inline def apply(PrincipalId: IdType, ResourceId: ResourceIdType): RemoveResourcePermissionRequest = {
    val __obj = js.Dynamic.literal(PrincipalId = PrincipalId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResourcePermissionRequest]
  }
  
  extension [Self <: RemoveResourcePermissionRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setPrincipalId(value: IdType): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
    
    inline def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
