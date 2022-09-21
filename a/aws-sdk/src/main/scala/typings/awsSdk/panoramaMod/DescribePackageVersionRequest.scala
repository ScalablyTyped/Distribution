package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackageVersionRequest extends StObject {
  
  /**
    * The version's owner account.
    */
  var OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined
  
  /**
    * The version's ID.
    */
  var PackageId: NodePackageId
  
  /**
    * The version's version.
    */
  var PackageVersion: NodePackageVersion
  
  /**
    * The version's patch version.
    */
  var PatchVersion: js.UndefOr[NodePackagePatchVersion] = js.undefined
}
object DescribePackageVersionRequest {
  
  inline def apply(PackageId: NodePackageId, PackageVersion: NodePackageVersion): DescribePackageVersionRequest = {
    val __obj = js.Dynamic.literal(PackageId = PackageId.asInstanceOf[js.Any], PackageVersion = PackageVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageVersionRequest]
  }
  
  extension [Self <: DescribePackageVersionRequest](x: Self) {
    
    inline def setOwnerAccount(value: PackageOwnerAccount): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "PatchVersion", value.asInstanceOf[js.Any])
    
    inline def setPatchVersionUndefined: Self = StObject.set(x, "PatchVersion", js.undefined)
  }
}
