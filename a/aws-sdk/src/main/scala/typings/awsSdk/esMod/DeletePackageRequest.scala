package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePackageRequest extends StObject {
  
  /**
    * Internal ID of the package that you want to delete. Use DescribePackages to find this value.
    */
  var PackageID: typings.awsSdk.esMod.PackageID = js.native
}
object DeletePackageRequest {
  
  @scala.inline
  def apply(PackageID: PackageID): DeletePackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageRequest]
  }
  
  @scala.inline
  implicit class DeletePackageRequestMutableBuilder[Self <: DeletePackageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
  }
}
