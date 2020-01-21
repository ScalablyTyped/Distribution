package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerDescription extends js.Object {
  /**
    * The domain name of the LoadBalancer.
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * A list of Listeners used by the LoadBalancer.
    */
  var Listeners: js.UndefOr[LoadBalancerListenersDescription] = js.native
  /**
    * The name of the LoadBalancer.
    */
  var LoadBalancerName: js.UndefOr[String] = js.native
}

object LoadBalancerDescription {
  @scala.inline
  def apply(
    Domain: String = null,
    Listeners: LoadBalancerListenersDescription = null,
    LoadBalancerName: String = null
  ): LoadBalancerDescription = {
    val __obj = js.Dynamic.literal()
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners.asInstanceOf[js.Any])
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerDescription]
  }
}

