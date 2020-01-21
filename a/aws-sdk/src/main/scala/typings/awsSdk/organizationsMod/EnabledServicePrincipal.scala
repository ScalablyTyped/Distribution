package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnabledServicePrincipal extends js.Object {
  /**
    * The date that the service principal was enabled for integration with AWS Organizations.
    */
  var DateEnabled: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the service principal. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typings.awsSdk.organizationsMod.ServicePrincipal] = js.native
}

object EnabledServicePrincipal {
  @scala.inline
  def apply(DateEnabled: Timestamp = null, ServicePrincipal: ServicePrincipal = null): EnabledServicePrincipal = {
    val __obj = js.Dynamic.literal()
    if (DateEnabled != null) __obj.updateDynamic("DateEnabled")(DateEnabled.asInstanceOf[js.Any])
    if (ServicePrincipal != null) __obj.updateDynamic("ServicePrincipal")(ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledServicePrincipal]
  }
}

