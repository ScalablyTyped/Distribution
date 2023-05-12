package typings.chainsafeNetmask

import typings.chainsafeNetmask.anon.Mask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMod {
  
  @JSImport("@chainsafe/netmask/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/netmask/dist/src", "IpNet")
  @js.native
  open class IpNet protected ()
    extends typings.chainsafeNetmask.distSrcIpnetMod.IpNet {
    /**
      *
      * @param ipOrCidr either network ip or full cidr address
      * @param mask in case ipOrCidr is network this can be either mask in decimal format or as ip address
      */
    def this(ipOrCidr: String) = this()
    def this(ipOrCidr: String, mask: String) = this()
    def this(ipOrCidr: String, mask: Double) = this()
  }
  
  inline def cidrContains(cidr: String, ip: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cidrContains")(cidr.asInstanceOf[js.Any], ip.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def iPv4FromIPv6(ip: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("iPv4FromIPv6")(ip.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def ipToString(ip: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ipToString")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ipToString(ip: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ipToString")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isIPv4mappedIPv6(ip: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4mappedIPv6")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isIPv4mappedIPv6(ip: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4mappedIPv6")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def maskIp(ip: js.typedarray.Uint8Array, mask: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("maskIp")(ip.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def parseCidr(s: String): Mask = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCidr")(s.asInstanceOf[js.Any]).asInstanceOf[Mask]
}
