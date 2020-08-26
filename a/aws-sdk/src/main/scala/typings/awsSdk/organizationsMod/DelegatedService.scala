package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegatedService extends js.Object {
  /**
    * The date that the account became a delegated administrator for this service. 
    */
  var DelegationEnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of a service that can request an operation for the specified service. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typings.awsSdk.organizationsMod.ServicePrincipal] = js.native
}

object DelegatedService {
  @scala.inline
  def apply(): DelegatedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedService]
  }
  @scala.inline
  implicit class DelegatedServiceOps[Self <: DelegatedService] (val x: Self) extends AnyVal {
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
    def setDelegationEnabledDate(value: Timestamp): Self = this.set("DelegationEnabledDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegationEnabledDate: Self = this.set("DelegationEnabledDate", js.undefined)
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = this.set("ServicePrincipal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicePrincipal: Self = this.set("ServicePrincipal", js.undefined)
  }
  
}

