package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageDetails extends StObject {
  
  var AvailablePackageVersion: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    * Timestamp which tells creation date of the package.
    */
  var CreatedAt: js.UndefOr[typings.awsSdk.esMod.CreatedAt] = js.undefined
  
  /**
    * Additional information if the package is in an error state. Null otherwise.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.esMod.ErrorDetails] = js.undefined
  
  var LastUpdatedAt: js.UndefOr[LastUpdated] = js.undefined
  
  /**
    * User-specified description of the package.
    */
  var PackageDescription: js.UndefOr[typings.awsSdk.esMod.PackageDescription] = js.undefined
  
  /**
    * Internal ID of the package.
    */
  var PackageID: js.UndefOr[typings.awsSdk.esMod.PackageID] = js.undefined
  
  /**
    * User specified name of the package.
    */
  var PackageName: js.UndefOr[typings.awsSdk.esMod.PackageName] = js.undefined
  
  /**
    * Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
    */
  var PackageStatus: js.UndefOr[typings.awsSdk.esMod.PackageStatus] = js.undefined
  
  /**
    * Currently supports only TXT-DICTIONARY.
    */
  var PackageType: js.UndefOr[typings.awsSdk.esMod.PackageType] = js.undefined
}
object PackageDetails {
  
  @scala.inline
  def apply(): PackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageDetails]
  }
  
  @scala.inline
  implicit class PackageDetailsMutableBuilder[Self <: PackageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailablePackageVersion(value: PackageVersion): Self = StObject.set(x, "AvailablePackageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailablePackageVersionUndefined: Self = StObject.set(x, "AvailablePackageVersion", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: LastUpdated): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    @scala.inline
    def setPackageDescription(value: PackageDescription): Self = StObject.set(x, "PackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDescriptionUndefined: Self = StObject.set(x, "PackageDescription", js.undefined)
    
    @scala.inline
    def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIDUndefined: Self = StObject.set(x, "PackageID", js.undefined)
    
    @scala.inline
    def setPackageName(value: PackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "PackageName", js.undefined)
    
    @scala.inline
    def setPackageStatus(value: PackageStatus): Self = StObject.set(x, "PackageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageStatusUndefined: Self = StObject.set(x, "PackageStatus", js.undefined)
    
    @scala.inline
    def setPackageType(value: PackageType): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageTypeUndefined: Self = StObject.set(x, "PackageType", js.undefined)
  }
}
