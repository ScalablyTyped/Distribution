package typings.chainsafeNetmask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIpMod {
  
  @JSImport("@chainsafe/netmask/dist/src/ip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/netmask/dist/src/ip", "IPv4Len")
  @js.native
  val IPv4Len: /* 4 */ Double = js.native
  
  @JSImport("@chainsafe/netmask/dist/src/ip", "IPv6Len")
  @js.native
  val IPv6Len: /* 16 */ Double = js.native
  
  inline def containsIp(net: IpNetRaw, ip: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsIp")(net.asInstanceOf[js.Any], ip.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def containsIp(net: IpNetRaw, ip: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsIp")(net.asInstanceOf[js.Any], ip.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def containsIp(net: IpNetRaw, ip: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsIp")(net.asInstanceOf[js.Any], ip.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def iPv4FromIPv6(ip: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("iPv4FromIPv6")(ip.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("@chainsafe/netmask/dist/src/ip", "ipv4Prefix")
  @js.native
  val ipv4Prefix: js.typedarray.Uint8Array = js.native
  
  inline def isIPv4mappedIPv6(ip: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4mappedIPv6")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isIPv4mappedIPv6(ip: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4mappedIPv6")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def maskIp(ip: js.typedarray.Uint8Array, mask: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("maskIp")(ip.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("@chainsafe/netmask/dist/src/ip", "maxIPv6Octet")
  @js.native
  val maxIPv6Octet: Double = js.native
  
  trait IpNetRaw extends StObject {
    
    var mask: js.typedarray.Uint8Array
    
    var network: js.typedarray.Uint8Array
  }
  object IpNetRaw {
    
    inline def apply(mask: js.typedarray.Uint8Array, network: js.typedarray.Uint8Array): IpNetRaw = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpNetRaw]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IpNetRaw] (val x: Self) extends AnyVal {
      
      inline def setMask(value: js.typedarray.Uint8Array): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: js.typedarray.Uint8Array): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    }
  }
}
