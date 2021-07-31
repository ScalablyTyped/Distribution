package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePackageResponse extends StObject {
  
  /**
    * DomainPackageDetails
    */
  var DomainPackageDetails: js.UndefOr[typings.awsSdk.esMod.DomainPackageDetails] = js.undefined
}
object AssociatePackageResponse {
  
  @scala.inline
  def apply(): AssociatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatePackageResponse]
  }
  
  @scala.inline
  implicit class AssociatePackageResponseMutableBuilder[Self <: AssociatePackageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainPackageDetails(value: DomainPackageDetails): Self = StObject.set(x, "DomainPackageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainPackageDetailsUndefined: Self = StObject.set(x, "DomainPackageDetails", js.undefined)
  }
}
