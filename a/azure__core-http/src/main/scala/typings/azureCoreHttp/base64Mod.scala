package typings.azureCoreHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base64Mod {
  
  @JSImport("@azure/core-http/types/latest/src/util/base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeString(value: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeString")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeByteArray(value: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeByteArray")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
