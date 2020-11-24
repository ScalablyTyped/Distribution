package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DissociatePackageResponse extends js.Object {
  
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
  implicit class DissociatePackageResponseOps[Self <: DissociatePackageResponse] (val x: Self) extends AnyVal {
    
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
    def setDomainPackageDetails(value: DomainPackageDetails): Self = this.set("DomainPackageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainPackageDetails: Self = this.set("DomainPackageDetails", js.undefined)
  }
}
