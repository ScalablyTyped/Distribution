package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppCookieStickinessPolicyInput extends js.Object {
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: typings.awsSdk.elbMod.CookieName = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsSdk.elbMod.PolicyName = js.native
}

object CreateAppCookieStickinessPolicyInput {
  @scala.inline
  def apply(CookieName: CookieName, LoadBalancerName: AccessPointName, PolicyName: PolicyName): CreateAppCookieStickinessPolicyInput = {
    val __obj = js.Dynamic.literal(CookieName = CookieName.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppCookieStickinessPolicyInput]
  }
  @scala.inline
  implicit class CreateAppCookieStickinessPolicyInputOps[Self <: CreateAppCookieStickinessPolicyInput] (val x: Self) extends AnyVal {
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
    def setCookieName(value: CookieName): Self = this.set("CookieName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
  }
  
}

