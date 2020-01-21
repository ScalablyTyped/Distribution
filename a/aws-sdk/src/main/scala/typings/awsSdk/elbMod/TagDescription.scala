package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagDescription extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object TagDescription {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName = null, Tags: TagList = null): TagDescription = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagDescription]
  }
}

