package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotAttributeResult extends StObject {
  
  /**
    * The users and groups that have the permissions for creating volumes from the snapshot.
    */
  var CreateVolumePermissions: js.UndefOr[CreateVolumePermissionList] = js.undefined
  
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  
  /**
    * The ID of the EBS snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
}
object DescribeSnapshotAttributeResult {
  
  inline def apply(): DescribeSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotAttributeResult]
  }
  
  extension [Self <: DescribeSnapshotAttributeResult](x: Self) {
    
    inline def setCreateVolumePermissions(value: CreateVolumePermissionList): Self = StObject.set(x, "CreateVolumePermissions", value.asInstanceOf[js.Any])
    
    inline def setCreateVolumePermissionsUndefined: Self = StObject.set(x, "CreateVolumePermissions", js.undefined)
    
    inline def setCreateVolumePermissionsVarargs(value: CreateVolumePermission*): Self = StObject.set(x, "CreateVolumePermissions", js.Array(value*))
    
    inline def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value*))
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
