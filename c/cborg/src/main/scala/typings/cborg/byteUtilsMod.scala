package typings.cborg

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteUtilsMod {
  
  @JSImport("cborg/types/lib/byte-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alloc(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def asU8A(buf: js.Array[Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("asU8A")(buf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def asU8A(buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("asU8A")(buf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def compare(b1: js.typedarray.Uint8Array, b2: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def concat(chunks: js.Array[js.typedarray.Uint8Array], length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(chunks.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decodeCodePointsArray(codePoints: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeCodePointsArray")(codePoints.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromArray(arr: js.Array[Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromHex(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def fromHex(hex: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("cborg/types/lib/byte-utils", "fromString")
  @js.native
  val fromString: js.Function1[/* string */ String, js.Array[Double] | Buffer | js.typedarray.Uint8Array] = js.native
  
  inline def slice(bytes: js.typedarray.Uint8Array, start: Double, end: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(bytes.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toHex(d: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toString_(bytes: js.typedarray.Uint8Array, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bytes.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("cborg/types/lib/byte-utils", "useBuffer")
  @js.native
  val useBuffer: Boolean = js.native
}
