package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyImageAttributeRequest extends StObject {
  
  /**
    * The name of the attribute to modify. The valid values are description, launchPermission, and productCodes.
    */
  var Attribute: js.UndefOr[String] = js.undefined
  
  /**
    * A new description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId
  
  /**
    * A new launch permission for the AMI.
    */
  var LaunchPermission: js.UndefOr[LaunchPermissionModifications] = js.undefined
  
  /**
    * The operation type. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var OperationType: js.UndefOr[typings.awsSdk.ec2Mod.OperationType] = js.undefined
  
  /**
    * The DevPay product codes. After you add a product code to an AMI, it can't be removed.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.undefined
  
  /**
    * The user groups. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.undefined
  
  /**
    * The AWS account IDs. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.undefined
  
  /**
    * The value of the attribute being modified. This parameter can be used only when the Attribute parameter is description or productCodes.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object ModifyImageAttributeRequest {
  
  @scala.inline
  def apply(ImageId: ImageId): ModifyImageAttributeRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyImageAttributeRequest]
  }
  
  @scala.inline
  implicit class ModifyImageAttributeRequestMutableBuilder[Self <: ModifyImageAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    @scala.inline
    def setDescription(value: AttributeValue): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPermission(value: LaunchPermissionModifications): Self = StObject.set(x, "LaunchPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPermissionUndefined: Self = StObject.set(x, "LaunchPermission", js.undefined)
    
    @scala.inline
    def setOperationType(value: OperationType): Self = StObject.set(x, "OperationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "OperationType", js.undefined)
    
    @scala.inline
    def setProductCodes(value: ProductCodeStringList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: String*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setUserGroups(value: UserGroupStringList): Self = StObject.set(x, "UserGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupsUndefined: Self = StObject.set(x, "UserGroups", js.undefined)
    
    @scala.inline
    def setUserGroupsVarargs(value: String*): Self = StObject.set(x, "UserGroups", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: UserIdStringList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: String*): Self = StObject.set(x, "UserIds", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
