package typings.bs58check

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bs58check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(string: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def decodeUnsafe(string: String): js.UndefOr[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsafe")(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Buffer]]
  
  inline def encode(buffer: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
}
