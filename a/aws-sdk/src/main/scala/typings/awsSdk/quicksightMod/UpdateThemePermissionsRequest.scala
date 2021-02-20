package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateThemePermissionsRequest extends StObject {
  
  /**
    * The ID of the AWS account that contains the theme.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * A list of resource permissions to be granted for the theme.
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  
  /**
    * A list of resource permissions to be revoked from the theme.
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  
  /**
    * The ID for the theme.
    */
  var ThemeId: RestrictiveResourceId = js.native
}
object UpdateThemePermissionsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, ThemeId: RestrictiveResourceId): UpdateThemePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThemePermissionsRequest]
  }
  
  @scala.inline
  implicit class UpdateThemePermissionsRequestMutableBuilder[Self <: UpdateThemePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantPermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "GrantPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantPermissionsUndefined: Self = StObject.set(x, "GrantPermissions", js.undefined)
    
    @scala.inline
    def setGrantPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "GrantPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRevokePermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "RevokePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokePermissionsUndefined: Self = StObject.set(x, "RevokePermissions", js.undefined)
    
    @scala.inline
    def setRevokePermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "RevokePermissions", js.Array(value :_*))
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
  }
}
