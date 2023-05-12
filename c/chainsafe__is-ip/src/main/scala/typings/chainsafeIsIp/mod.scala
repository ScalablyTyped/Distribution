package typings.chainsafeIsIp

import typings.chainsafeIsIp.chainsafeIsIpInts.`4`
import typings.chainsafeIsIp.chainsafeIsIpInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chainsafe/is-ip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ipVersion(input: String): js.UndefOr[`4` | `6`] = ^.asInstanceOf[js.Dynamic].applyDynamic("ipVersion")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`4` | `6`]]
  
  inline def isIP(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIPv4(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIPv6(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
