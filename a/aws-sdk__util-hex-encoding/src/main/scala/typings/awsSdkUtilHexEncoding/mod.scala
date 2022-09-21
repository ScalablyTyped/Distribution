package typings.awsSdkUtilHexEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-hex-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromHex(encoded: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(encoded.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toHex(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
}
