package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerConnectionSettings extends js.Object {
  
  /**
    * The time, in seconds, that the connection can be idle (no data is sent over the connection) before it is closed by the load balancer.
    */
  var IdleTimeout: js.UndefOr[Integer] = js.native
}
object AwsElbLoadBalancerConnectionSettings {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerConnectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerConnectionSettings]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerConnectionSettingsOps[Self <: AwsElbLoadBalancerConnectionSettings] (val x: Self) extends AnyVal {
    
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
    def setIdleTimeout(value: Integer): Self = this.set("IdleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeout: Self = this.set("IdleTimeout", js.undefined)
  }
}
