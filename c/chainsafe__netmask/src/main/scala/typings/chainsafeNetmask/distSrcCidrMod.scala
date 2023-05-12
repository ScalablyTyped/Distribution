package typings.chainsafeNetmask

import typings.chainsafeNetmask.anon.Mask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCidrMod {
  
  @JSImport("@chainsafe/netmask/dist/src/cidr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cidrMask(ones: Double, bits: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("cidrMask")(ones.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def parseCidr(s: String): Mask = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCidr")(s.asInstanceOf[js.Any]).asInstanceOf[Mask]
}
