package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainPackageDetails extends StObject {
  
  /**
    * The name of the domain you've associated a package with.
    */
  var DomainName: js.UndefOr[typings.awsSdk.opensearchMod.DomainName] = js.undefined
  
  /**
    * State of the association. Values are ASSOCIATING, ASSOCIATION_FAILED, ACTIVE, DISSOCIATING, and DISSOCIATION_FAILED.
    */
  var DomainPackageStatus: js.UndefOr[typings.awsSdk.opensearchMod.DomainPackageStatus] = js.undefined
  
  /**
    * Additional information if the package is in an error state. Null otherwise.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.opensearchMod.ErrorDetails] = js.undefined
  
  /**
    * The timestamp of the most recent update to the package association status.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The internal ID of the package.
    */
  var PackageID: js.UndefOr[typings.awsSdk.opensearchMod.PackageID] = js.undefined
  
  /**
    * User-specified name of the package.
    */
  var PackageName: js.UndefOr[typings.awsSdk.opensearchMod.PackageName] = js.undefined
  
  /**
    * Currently supports only TXT-DICTIONARY.
    */
  var PackageType: js.UndefOr[typings.awsSdk.opensearchMod.PackageType] = js.undefined
  
  var PackageVersion: js.UndefOr[typings.awsSdk.opensearchMod.PackageVersion] = js.undefined
  
  /**
    * The relative path on Amazon OpenSearch Service nodes, which can be used as synonym_path when the package is a synonym file.
    */
  var ReferencePath: js.UndefOr[typings.awsSdk.opensearchMod.ReferencePath] = js.undefined
}
object DomainPackageDetails {
  
  inline def apply(): DomainPackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainPackageDetails]
  }
  
  extension [Self <: DomainPackageDetails](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setDomainPackageStatus(value: DomainPackageStatus): Self = StObject.set(x, "DomainPackageStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainPackageStatusUndefined: Self = StObject.set(x, "DomainPackageStatus", js.undefined)
    
    inline def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    inline def setPackageIDUndefined: Self = StObject.set(x, "PackageID", js.undefined)
    
    inline def setPackageName(value: PackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "PackageName", js.undefined)
    
    inline def setPackageType(value: PackageType): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "PackageType", js.undefined)
    
    inline def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionUndefined: Self = StObject.set(x, "PackageVersion", js.undefined)
    
    inline def setReferencePath(value: ReferencePath): Self = StObject.set(x, "ReferencePath", value.asInstanceOf[js.Any])
    
    inline def setReferencePathUndefined: Self = StObject.set(x, "ReferencePath", js.undefined)
  }
}
