package typings.cbor

import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibUtilsMod {
  
  @JSImport("cbor/types/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayEqual(a: Any, b: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def base64(buf: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64(buf: js.typedarray.DataView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64(buf: js.typedarray.Uint8ClampedArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64url(buf: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64url")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64url(buf: js.typedarray.DataView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64url")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64url(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64url")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64url(buf: js.typedarray.Uint8ClampedArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64url")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64url(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64url")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bin(s: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bin")(s.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def bufferToBigInt(buf: Any): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToBigInt")(buf.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def bufferishToBuffer(b: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferishToBuffer")(b.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def cborValueToString(`val`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cborValueToString")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def cborValueToString(`val`: Any, float_bytes: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cborValueToString")(`val`.asInstanceOf[js.Any], float_bytes.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def guessEncoding(input: Any, encoding: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("guessEncoding")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hex(s: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(s.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def isBigEndian(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigEndian")().asInstanceOf[Boolean]
  
  inline def isBufferish(b: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBufferish")(b.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseCBORfloat(buf: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCBORfloat")(buf.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def parseCBORint(ai: Any, buf: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCBORint")(ai.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseHalf(buf: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHalf")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object utf8 {
    
    inline def apply(buf: Any): String = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("cbor/types/lib/utils", "utf8")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cbor/types/lib/utils", "utf8.checksUTF8")
    @js.native
    val checksUTF8: Boolean = js.native
  }
  
  inline def writeHalf(buf: Any, half: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeHalf")(buf.asInstanceOf[js.Any], half.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
