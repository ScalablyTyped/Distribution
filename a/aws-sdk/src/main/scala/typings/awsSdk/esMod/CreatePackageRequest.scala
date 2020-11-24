package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePackageRequest extends js.Object {
  
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
  implicit class CreatePackageRequestOps[Self <: CreatePackageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPackageName(value: PackageName): Self = this.set("PackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageSource(value: PackageSource): Self = this.set("PackageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageType(value: PackageType): Self = this.set("PackageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDescription(value: PackageDescription): Self = this.set("PackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageDescription: Self = this.set("PackageDescription", js.undefined)
  }
}
