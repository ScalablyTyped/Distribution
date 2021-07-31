package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePackageResponse extends StObject {
  
  /**
    * Information about the package PackageDetails.
    */
  var PackageDetails: js.UndefOr[typings.awsSdk.esMod.PackageDetails] = js.undefined
}
object UpdatePackageResponse {
  
  @scala.inline
  def apply(): UpdatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePackageResponse]
  }
  
  @scala.inline
  implicit class UpdatePackageResponseMutableBuilder[Self <: UpdatePackageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageDetails(value: PackageDetails): Self = StObject.set(x, "PackageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDetailsUndefined: Self = StObject.set(x, "PackageDetails", js.undefined)
  }
}
