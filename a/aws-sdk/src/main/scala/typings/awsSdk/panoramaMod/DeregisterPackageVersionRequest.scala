package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterPackageVersionRequest extends StObject {
  
  /**
    * An owner account.
    */
  var OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined
  
  /**
    * A package ID.
    */
  var PackageId: NodePackageId
  
  /**
    * A package version.
    */
  var PackageVersion: NodePackageVersion
  
  /**
    * A patch version.
    */
  var PatchVersion: NodePackagePatchVersion
  
  /**
    * If the version was marked latest, the new version to maker as latest.
    */
  var UpdatedLatestPatchVersion: js.UndefOr[NodePackagePatchVersion] = js.undefined
}
object DeregisterPackageVersionRequest {
  
  inline def apply(
    PackageId: NodePackageId,
    PackageVersion: NodePackageVersion,
    PatchVersion: NodePackagePatchVersion
  ): DeregisterPackageVersionRequest = {
    val __obj = js.Dynamic.literal(PackageId = PackageId.asInstanceOf[js.Any], PackageVersion = PackageVersion.asInstanceOf[js.Any], PatchVersion = PatchVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterPackageVersionRequest]
  }
  
  extension [Self <: DeregisterPackageVersionRequest](x: Self) {
    
    inline def setOwnerAccount(value: PackageOwnerAccount): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "PatchVersion", value.asInstanceOf[js.Any])
    
    inline def setUpdatedLatestPatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "UpdatedLatestPatchVersion", value.asInstanceOf[js.Any])
    
    inline def setUpdatedLatestPatchVersionUndefined: Self = StObject.set(x, "UpdatedLatestPatchVersion", js.undefined)
  }
}
