package typings.base64Arraybuffer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64-arraybuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(base64: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base64.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def encode(arraybuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(arraybuffer.asInstanceOf[js.Any]).asInstanceOf[String]
}
