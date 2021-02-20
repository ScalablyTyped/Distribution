package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrincipalResourcePermissions extends StObject {
  
  /**
    * This attribute can be used to return any additional details of PrincipalResourcePermissions. Currently returns only as a RAM share resource ARN.
    */
  var AdditionalDetails: js.UndefOr[DetailsMap] = js.native
  
  /**
    * The permissions to be granted or revoked on the resource.
    */
  var Permissions: js.UndefOr[PermissionList] = js.native
  
  /**
    * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  
  /**
    * The Data Lake principal to be granted or revoked permissions.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.native
  
  /**
    * The resource where permissions are to be granted or revoked.
    */
  var Resource: js.UndefOr[typings.awsSdk.lakeformationMod.Resource] = js.native
}
object PrincipalResourcePermissions {
  
  @scala.inline
  def apply(): PrincipalResourcePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalResourcePermissions]
  }
  
  @scala.inline
  implicit class PrincipalResourcePermissionsMutableBuilder[Self <: PrincipalResourcePermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalDetails(value: DetailsMap): Self = StObject.set(x, "AdditionalDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDetailsUndefined: Self = StObject.set(x, "AdditionalDetails", js.undefined)
    
    @scala.inline
    def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissionsWithGrantOption(value: PermissionList): Self = StObject.set(x, "PermissionsWithGrantOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsWithGrantOptionUndefined: Self = StObject.set(x, "PermissionsWithGrantOption", js.undefined)
    
    @scala.inline
    def setPermissionsWithGrantOptionVarargs(value: Permission*): Self = StObject.set(x, "PermissionsWithGrantOption", js.Array(value :_*))
    
    @scala.inline
    def setPrincipal(value: DataLakePrincipal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
  }
}
