package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrincipalResourcePermissions extends StObject {
  
  /**
    * This attribute can be used to return any additional details of PrincipalResourcePermissions. Currently returns only as a RAM resource share ARN.
    */
  var AdditionalDetails: js.UndefOr[DetailsMap] = js.undefined
  
  /**
    * The permissions to be granted or revoked on the resource.
    */
  var Permissions: js.UndefOr[PermissionList] = js.undefined
  
  /**
    * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined
  
  /**
    * The Data Lake principal to be granted or revoked permissions.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.undefined
  
  /**
    * The resource where permissions are to be granted or revoked.
    */
  var Resource: js.UndefOr[typings.awsSdk.lakeformationMod.Resource] = js.undefined
}
object PrincipalResourcePermissions {
  
  inline def apply(): PrincipalResourcePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalResourcePermissions]
  }
  
  extension [Self <: PrincipalResourcePermissions](x: Self) {
    
    inline def setAdditionalDetails(value: DetailsMap): Self = StObject.set(x, "AdditionalDetails", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDetailsUndefined: Self = StObject.set(x, "AdditionalDetails", js.undefined)
    
    inline def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setPermissionsWithGrantOption(value: PermissionList): Self = StObject.set(x, "PermissionsWithGrantOption", value.asInstanceOf[js.Any])
    
    inline def setPermissionsWithGrantOptionUndefined: Self = StObject.set(x, "PermissionsWithGrantOption", js.undefined)
    
    inline def setPermissionsWithGrantOptionVarargs(value: Permission*): Self = StObject.set(x, "PermissionsWithGrantOption", js.Array(value*))
    
    inline def setPrincipal(value: DataLakePrincipal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    inline def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
  }
}
