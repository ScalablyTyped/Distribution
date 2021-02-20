package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DissociatePackageResponse extends StObject {
  
  /**
    * DomainPackageDetails
    */
  var DomainPackageDetails: js.UndefOr[typings.awsSdk.esMod.DomainPackageDetails] = js.native
}
object DissociatePackageResponse {
  
  @scala.inline
  def apply(): DissociatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DissociatePackageResponse]
  }
  
  @scala.inline
  implicit class DissociatePackageResponseMutableBuilder[Self <: DissociatePackageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainPackageDetails(value: DomainPackageDetails): Self = StObject.set(x, "DomainPackageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainPackageDetailsUndefined: Self = StObject.set(x, "DomainPackageDetails", js.undefined)
  }
}
