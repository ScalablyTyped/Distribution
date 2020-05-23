package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTlsCertificateSummary extends js.Object {
  /**
    * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  /**
    * The name of the SSL/TLS certificate.
    */
  var name: js.UndefOr[ResourceName] = js.native
}

object LoadBalancerTlsCertificateSummary {
  @scala.inline
  def apply(isAttached: js.UndefOr[Boolean] = js.undefined, name: ResourceName = null): LoadBalancerTlsCertificateSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isAttached)) __obj.updateDynamic("isAttached")(isAttached.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerTlsCertificateSummary]
  }
}

