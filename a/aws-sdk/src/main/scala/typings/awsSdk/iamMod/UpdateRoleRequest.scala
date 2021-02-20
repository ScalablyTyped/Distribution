package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoleRequest extends StObject {
  
  /**
    * The new description that you want to apply to the specified role.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.native
  
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours. Anyone who assumes the role from the AWS CLI or API can use the DurationSeconds API parameter or the duration-seconds CLI parameter to request a longer session. The MaxSessionDuration setting determines the maximum duration that can be requested using the DurationSeconds parameter. If users don't specify a value for the DurationSeconds parameter, their security credentials are valid for one hour by default. This applies when you use the AssumeRole* API operations or the assume-role* CLI operations but does not apply when you use those operations to create a console URL. For more information, see Using IAM Roles in the IAM User Guide.
    */
  var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.native
  
  /**
    * The name of the role that you want to modify.
    */
  var RoleName: roleNameType = js.native
}
object UpdateRoleRequest {
  
  @scala.inline
  def apply(RoleName: roleNameType): UpdateRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleRequest]
  }
  
  @scala.inline
  implicit class UpdateRoleRequestMutableBuilder[Self <: UpdateRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: roleDescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setMaxSessionDuration(value: roleMaxSessionDurationType): Self = StObject.set(x, "MaxSessionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSessionDurationUndefined: Self = StObject.set(x, "MaxSessionDuration", js.undefined)
    
    @scala.inline
    def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
