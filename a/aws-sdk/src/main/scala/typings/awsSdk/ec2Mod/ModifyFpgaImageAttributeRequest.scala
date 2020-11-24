package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyFpgaImageAttributeRequest extends js.Object {
  
  /**
    * The name of the attribute.
    */
  var Attribute: js.UndefOr[FpgaImageAttributeName] = js.native
  
  /**
    * A description for the AFI.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typings.awsSdk.ec2Mod.FpgaImageId = js.native
  
  /**
    * The load permission for the AFI.
    */
  var LoadPermission: js.UndefOr[LoadPermissionModifications] = js.native
  
  /**
    * A name for the AFI.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The operation type.
    */
  var OperationType: js.UndefOr[typings.awsSdk.ec2Mod.OperationType] = js.native
  
  /**
    * The product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid only when modifying the productCodes attribute.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.native
  
  /**
    * The user groups. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.native
  
  /**
    * The AWS account IDs. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.native
}
object ModifyFpgaImageAttributeRequest {
  
  @scala.inline
  def apply(FpgaImageId: FpgaImageId): ModifyFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFpgaImageAttributeRequest]
  }
  
  @scala.inline
  implicit class ModifyFpgaImageAttributeRequestOps[Self <: ModifyFpgaImageAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFpgaImageId(value: FpgaImageId): Self = this.set("FpgaImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute(value: FpgaImageAttributeName): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setLoadPermission(value: LoadPermissionModifications): Self = this.set("LoadPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadPermission: Self = this.set("LoadPermission", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOperationType(value: OperationType): Self = this.set("OperationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("OperationType", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: String*): Self = this.set("ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setProductCodes(value: ProductCodeStringList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    
    @scala.inline
    def setUserGroupsVarargs(value: String*): Self = this.set("UserGroups", js.Array(value :_*))
    
    @scala.inline
    def setUserGroups(value: UserGroupStringList): Self = this.set("UserGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGroups: Self = this.set("UserGroups", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: String*): Self = this.set("UserIds", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: UserIdStringList): Self = this.set("UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIds: Self = this.set("UserIds", js.undefined)
  }
}
