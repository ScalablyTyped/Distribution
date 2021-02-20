package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledInstancesPrivateIpAddressConfig extends StObject {
  
  /**
    * Indicates whether this is a primary IPv4 address. Otherwise, this is a secondary IPv4 address.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  
  /**
    * The IPv4 address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}
object ScheduledInstancesPrivateIpAddressConfig {
  
  @scala.inline
  def apply(): ScheduledInstancesPrivateIpAddressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesPrivateIpAddressConfig]
  }
  
  @scala.inline
  implicit class ScheduledInstancesPrivateIpAddressConfigMutableBuilder[Self <: ScheduledInstancesPrivateIpAddressConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "Primary", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}
