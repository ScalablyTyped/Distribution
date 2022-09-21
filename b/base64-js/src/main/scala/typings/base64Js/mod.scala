package typings.base64Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def byteLength(b64: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(b64.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fromByteArray(uint8: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromByteArray")(uint8.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toByteArray(b64: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toByteArray")(b64.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
