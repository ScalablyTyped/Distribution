package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassicLoadBalancersConfig extends js.Object {
  /**
    * One or more Classic Load Balancers.
    */
  var ClassicLoadBalancers: js.UndefOr[typings.awsSdk.ec2Mod.ClassicLoadBalancers] = js.native
}

object ClassicLoadBalancersConfig {
  @scala.inline
  def apply(): ClassicLoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLoadBalancersConfig]
  }
  @scala.inline
  implicit class ClassicLoadBalancersConfigOps[Self <: ClassicLoadBalancersConfig] (val x: Self) extends AnyVal {
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
    def setClassicLoadBalancersVarargs(value: ClassicLoadBalancer*): Self = this.set("ClassicLoadBalancers", js.Array(value :_*))
    @scala.inline
    def setClassicLoadBalancers(value: ClassicLoadBalancers): Self = this.set("ClassicLoadBalancers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassicLoadBalancers: Self = this.set("ClassicLoadBalancers", js.undefined)
  }
  
}

