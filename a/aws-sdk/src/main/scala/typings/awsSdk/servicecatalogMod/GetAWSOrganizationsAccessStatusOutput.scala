package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAWSOrganizationsAccessStatusOutput extends js.Object {
  
  /**
    * The status of the portfolio share feature.
    */
  var AccessStatus: js.UndefOr[typings.awsSdk.servicecatalogMod.AccessStatus] = js.native
}
object GetAWSOrganizationsAccessStatusOutput {
  
  @scala.inline
  def apply(): GetAWSOrganizationsAccessStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAWSOrganizationsAccessStatusOutput]
  }
  
  @scala.inline
  implicit class GetAWSOrganizationsAccessStatusOutputOps[Self <: GetAWSOrganizationsAccessStatusOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessStatus(value: AccessStatus): Self = this.set("AccessStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessStatus: Self = this.set("AccessStatus", js.undefined)
  }
}
