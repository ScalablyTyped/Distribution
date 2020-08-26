package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentResourcesDescription extends js.Object {
  /**
    * Describes the LoadBalancer.
    */
  var LoadBalancer: js.UndefOr[LoadBalancerDescription] = js.native
}

object EnvironmentResourcesDescription {
  @scala.inline
  def apply(): EnvironmentResourcesDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourcesDescription]
  }
  @scala.inline
  implicit class EnvironmentResourcesDescriptionOps[Self <: EnvironmentResourcesDescription] (val x: Self) extends AnyVal {
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
    def setLoadBalancer(value: LoadBalancerDescription): Self = this.set("LoadBalancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancer: Self = this.set("LoadBalancer", js.undefined)
  }
  
}

