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
  def apply(DelegationEnabledDate: Timestamp = null, ServicePrincipal: ServicePrincipal = null): DelegatedService = {
    val __obj = js.Dynamic.literal()
    if (DelegationEnabledDate != null) __obj.updateDynamic("DelegationEnabledDate")(DelegationEnabledDate.asInstanceOf[js.Any])
    if (ServicePrincipal != null) __obj.updateDynamic("ServicePrincipal")(ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegatedService]
  }
}

