package typings.chainsafeNetmask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIpnetMod {
  
  @JSImport("@chainsafe/netmask/dist/src/ipnet", "IpNet")
  @js.native
  open class IpNet protected () extends StObject {
    /**
      *
      * @param ipOrCidr either network ip or full cidr address
      * @param mask in case ipOrCidr is network this can be either mask in decimal format or as ip address
      */
    def this(ipOrCidr: String) = this()
    def this(ipOrCidr: String, mask: String) = this()
    def this(ipOrCidr: String, mask: Double) = this()
    
    def contains(ip: String): Boolean = js.native
    def contains(ip: js.Array[Double]): Boolean = js.native
    /**
      * Checks if netmask contains ip address
      * @param ip
      * @returns
      */
    def contains(ip: js.typedarray.Uint8Array): Boolean = js.native
    
    val mask: js.typedarray.Uint8Array = js.native
    
    val network: js.typedarray.Uint8Array = js.native
  }
}
