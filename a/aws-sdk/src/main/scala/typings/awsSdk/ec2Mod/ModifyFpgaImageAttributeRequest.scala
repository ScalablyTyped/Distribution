package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyFpgaImageAttributeRequest extends StObject {
  
  /**
    * The name of the attribute.
    */
  var Attribute: js.UndefOr[FpgaImageAttributeName] = js.undefined
  
  /**
    * A description for the AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typings.awsSdk.ec2Mod.FpgaImageId
  
  /**
    * The load permission for the AFI.
    */
  var LoadPermission: js.UndefOr[LoadPermissionModifications] = js.undefined
  
  /**
    * A name for the AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The operation type.
    */
  var OperationType: js.UndefOr[typings.awsSdk.ec2Mod.OperationType] = js.undefined
  
  /**
    * The product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid only when modifying the productCodes attribute.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.undefined
  
  /**
    * The user groups. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.undefined
  
  /**
    * The Amazon Web Services account IDs. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.undefined
}
object ModifyFpgaImageAttributeRequest {
  
  inline def apply(FpgaImageId: FpgaImageId): ModifyFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFpgaImageAttributeRequest]
  }
  
  extension [Self <: ModifyFpgaImageAttributeRequest](x: Self) {
    
    inline def setAttribute(value: FpgaImageAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFpgaImageId(value: FpgaImageId): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
    
    inline def setLoadPermission(value: LoadPermissionModifications): Self = StObject.set(x, "LoadPermission", value.asInstanceOf[js.Any])
    
    inline def setLoadPermissionUndefined: Self = StObject.set(x, "LoadPermission", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperationType(value: OperationType): Self = StObject.set(x, "OperationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "OperationType", js.undefined)
    
    inline def setProductCodes(value: ProductCodeStringList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: String*): Self = StObject.set(x, "ProductCodes", js.Array(value*))
    
    inline def setUserGroups(value: UserGroupStringList): Self = StObject.set(x, "UserGroups", value.asInstanceOf[js.Any])
    
    inline def setUserGroupsUndefined: Self = StObject.set(x, "UserGroups", js.undefined)
    
    inline def setUserGroupsVarargs(value: String*): Self = StObject.set(x, "UserGroups", js.Array(value*))
    
    inline def setUserIds(value: UserIdStringList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    inline def setUserIdsVarargs(value: String*): Self = StObject.set(x, "UserIds", js.Array(value*))
  }
}
