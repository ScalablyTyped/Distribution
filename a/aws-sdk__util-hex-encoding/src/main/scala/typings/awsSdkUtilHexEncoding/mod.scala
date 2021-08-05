package typings.awsSdkUtilHexEncoding

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-hex-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromHex(encoded: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(encoded.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def toHex(bytes: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
}
