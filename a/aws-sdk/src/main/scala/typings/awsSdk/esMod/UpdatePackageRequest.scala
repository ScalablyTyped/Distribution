package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePackageRequest extends StObject {
  
  /**
    * An info message for the new version which will be shown as part of GetPackageVersionHistoryResponse.
    */
  var CommitMessage: js.UndefOr[typings.awsSdk.esMod.CommitMessage] = js.undefined
  
  /**
    * New description of the package.
    */
  var PackageDescription: js.UndefOr[typings.awsSdk.esMod.PackageDescription] = js.undefined
  
  /**
    * Unique identifier for the package.
    */
  var PackageID: typings.awsSdk.esMod.PackageID
  
  var PackageSource: typings.awsSdk.esMod.PackageSource
}
object UpdatePackageRequest {
  
  @scala.inline
  def apply(PackageID: PackageID, PackageSource: PackageSource): UpdatePackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any], PackageSource = PackageSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackageRequest]
  }
  
  @scala.inline
  implicit class UpdatePackageRequestMutableBuilder[Self <: UpdatePackageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitMessage(value: CommitMessage): Self = StObject.set(x, "CommitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitMessageUndefined: Self = StObject.set(x, "CommitMessage", js.undefined)
    
    @scala.inline
    def setPackageDescription(value: PackageDescription): Self = StObject.set(x, "PackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDescriptionUndefined: Self = StObject.set(x, "PackageDescription", js.undefined)
    
    @scala.inline
    def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageSource(value: PackageSource): Self = StObject.set(x, "PackageSource", value.asInstanceOf[js.Any])
  }
}
