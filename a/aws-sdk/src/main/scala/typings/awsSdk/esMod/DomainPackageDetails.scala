package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainPackageDetails extends StObject {
  
  /**
    * Name of the domain you've associated a package with.
    */
  var DomainName: js.UndefOr[typings.awsSdk.esMod.DomainName] = js.undefined
  
  /**
    * State of the association. Values are ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
    */
  var DomainPackageStatus: js.UndefOr[typings.awsSdk.esMod.DomainPackageStatus] = js.undefined
  
  /**
    * Additional information if the package is in an error state. Null otherwise.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.esMod.ErrorDetails] = js.undefined
  
  /**
    * Timestamp of the most-recent update to the association status.
    */
  var LastUpdated: js.UndefOr[typings.awsSdk.esMod.LastUpdated] = js.undefined
  
  /**
    * Internal ID of the package.
    */
  var PackageID: js.UndefOr[typings.awsSdk.esMod.PackageID] = js.undefined
  
  /**
    * User specified name of the package.
    */
  var PackageName: js.UndefOr[typings.awsSdk.esMod.PackageName] = js.undefined
  
  /**
    * Currently supports only TXT-DICTIONARY.
    */
  var PackageType: js.UndefOr[typings.awsSdk.esMod.PackageType] = js.undefined
  
  var PackageVersion: js.UndefOr[typings.awsSdk.esMod.PackageVersion] = js.undefined
  
  /**
    * The relative path on Amazon ES nodes, which can be used as synonym_path when the package is synonym file.
    */
  var ReferencePath: js.UndefOr[typings.awsSdk.esMod.ReferencePath] = js.undefined
}
object DomainPackageDetails {
  
  @scala.inline
  def apply(): DomainPackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainPackageDetails]
  }
  
  @scala.inline
  implicit class DomainPackageDetailsMutableBuilder[Self <: DomainPackageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setDomainPackageStatus(value: DomainPackageStatus): Self = StObject.set(x, "DomainPackageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainPackageStatusUndefined: Self = StObject.set(x, "DomainPackageStatus", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: LastUpdated): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    @scala.inline
    def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIDUndefined: Self = StObject.set(x, "PackageID", js.undefined)
    
    @scala.inline
    def setPackageName(value: PackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "PackageName", js.undefined)
    
    @scala.inline
    def setPackageType(value: PackageType): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageTypeUndefined: Self = StObject.set(x, "PackageType", js.undefined)
    
    @scala.inline
    def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageVersionUndefined: Self = StObject.set(x, "PackageVersion", js.undefined)
    
    @scala.inline
    def setReferencePath(value: ReferencePath): Self = StObject.set(x, "ReferencePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencePathUndefined: Self = StObject.set(x, "ReferencePath", js.undefined)
  }
}
