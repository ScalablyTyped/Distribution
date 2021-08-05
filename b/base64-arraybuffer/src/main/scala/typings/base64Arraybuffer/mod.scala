package typings.base64Arraybuffer

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64-arraybuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(base64: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base64.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  inline def encode(arraybuffer: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(arraybuffer.asInstanceOf[js.Any]).asInstanceOf[String]
}
