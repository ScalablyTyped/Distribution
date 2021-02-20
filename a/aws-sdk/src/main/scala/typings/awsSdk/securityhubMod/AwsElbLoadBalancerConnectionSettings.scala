package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerConnectionSettings extends StObject {
  
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
  implicit class AwsElbLoadBalancerConnectionSettingsMutableBuilder[Self <: AwsElbLoadBalancerConnectionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdleTimeout(value: Integer): Self = StObject.set(x, "IdleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutUndefined: Self = StObject.set(x, "IdleTimeout", js.undefined)
  }
}
