package typings.chainsafeNetmask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilMod {
  
  @JSImport("@chainsafe/netmask/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allFF(a: js.Array[Double], from: Double, to: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allFF")(a.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def allFF(a: js.typedarray.Uint8Array, from: Double, to: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allFF")(a.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deepEqual(a: js.Array[Double], b: js.typedarray.Uint8Array, from: Double, to: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def deepEqual(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array, from: Double, to: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ipToString(ip: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ipToString")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ipToString(ip: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ipToString")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def maskToHex(mask: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("maskToHex")(mask.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def simpleMaskLength(mask: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleMaskLength")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
}
