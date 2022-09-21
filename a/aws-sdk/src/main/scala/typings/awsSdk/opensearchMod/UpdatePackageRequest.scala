package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePackageRequest extends StObject {
  
  /**
    * A commit message for the new version which is shown as part of GetPackageVersionHistoryResponse. 
    */
  var CommitMessage: js.UndefOr[typings.awsSdk.opensearchMod.CommitMessage] = js.undefined
  
  /**
    * A new description of the package.
    */
  var PackageDescription: js.UndefOr[typings.awsSdk.opensearchMod.PackageDescription] = js.undefined
  
  /**
    * The unique identifier for the package.
    */
  var PackageID: typings.awsSdk.opensearchMod.PackageID
  
  var PackageSource: typings.awsSdk.opensearchMod.PackageSource
}
object UpdatePackageRequest {
  
  inline def apply(PackageID: PackageID, PackageSource: PackageSource): UpdatePackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any], PackageSource = PackageSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackageRequest]
  }
  
  extension [Self <: UpdatePackageRequest](x: Self) {
    
    inline def setCommitMessage(value: CommitMessage): Self = StObject.set(x, "CommitMessage", value.asInstanceOf[js.Any])
    
    inline def setCommitMessageUndefined: Self = StObject.set(x, "CommitMessage", js.undefined)
    
    inline def setPackageDescription(value: PackageDescription): Self = StObject.set(x, "PackageDescription", value.asInstanceOf[js.Any])
    
    inline def setPackageDescriptionUndefined: Self = StObject.set(x, "PackageDescription", js.undefined)
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    inline def setPackageSource(value: PackageSource): Self = StObject.set(x, "PackageSource", value.asInstanceOf[js.Any])
  }
}
