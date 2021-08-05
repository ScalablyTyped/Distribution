package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostEntry extends StObject {
  
  /**
    * The hostname to use in the /etc/hosts entry.
    */
  var hostname: String
  
  /**
    * The IP address to use in the /etc/hosts entry.
    */
  var ipAddress: String
}
object HostEntry {
  
  inline def apply(hostname: String, ipAddress: String): HostEntry = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostEntry]
  }
  
  extension [Self <: HostEntry](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
  }
}
