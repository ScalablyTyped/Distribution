package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRemoteAccessSessionConfiguration extends js.Object {
  /**
    * The billing method for the remote access session.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  /**
    * An array of ARNs included in the VPC endpoint configuration.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.native
}

object CreateRemoteAccessSessionConfiguration {
  @scala.inline
  def apply(billingMethod: BillingMethod = null, vpceConfigurationArns: AmazonResourceNames = null): CreateRemoteAccessSessionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod.asInstanceOf[js.Any])
    if (vpceConfigurationArns != null) __obj.updateDynamic("vpceConfigurationArns")(vpceConfigurationArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRemoteAccessSessionConfiguration]
  }
}

