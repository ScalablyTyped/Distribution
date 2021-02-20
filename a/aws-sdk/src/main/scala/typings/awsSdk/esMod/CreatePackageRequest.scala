package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePackageRequest extends StObject {
  
  /**
    * Description of the package.
    */
  var PackageDescription: js.UndefOr[typings.awsSdk.esMod.PackageDescription] = js.native
  
  /**
    * Unique identifier for the package.
    */
  var PackageName: typings.awsSdk.esMod.PackageName = js.native
  
  /**
    * The customer S3 location PackageSource for importing the package.
    */
  var PackageSource: typings.awsSdk.esMod.PackageSource = js.native
  
  /**
    * Type of package. Currently supports only TXT-DICTIONARY.
    */
  var PackageType: typings.awsSdk.esMod.PackageType = js.native
}
object CreatePackageRequest {
  
  @scala.inline
  def apply(PackageName: PackageName, PackageSource: PackageSource, PackageType: PackageType): CreatePackageRequest = {
    val __obj = js.Dynamic.literal(PackageName = PackageName.asInstanceOf[js.Any], PackageSource = PackageSource.asInstanceOf[js.Any], PackageType = PackageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackageRequest]
  }
  
  @scala.inline
  implicit class CreatePackageRequestMutableBuilder[Self <: CreatePackageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageDescription(value: PackageDescription): Self = StObject.set(x, "PackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDescriptionUndefined: Self = StObject.set(x, "PackageDescription", js.undefined)
    
    @scala.inline
    def setPackageName(value: PackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageSource(value: PackageSource): Self = StObject.set(x, "PackageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageType(value: PackageType): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
  }
}
