package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstancesPrivateIpAddressConfig extends StObject {
  
  /**
    * Indicates whether this is a primary IPv4 address. Otherwise, this is a secondary IPv4 address.
    */
  var Primary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IPv4 address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}
object ScheduledInstancesPrivateIpAddressConfig {
  
  inline def apply(): ScheduledInstancesPrivateIpAddressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesPrivateIpAddressConfig]
  }
  
  extension [Self <: ScheduledInstancesPrivateIpAddressConfig](x: Self) {
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "Primary", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}
