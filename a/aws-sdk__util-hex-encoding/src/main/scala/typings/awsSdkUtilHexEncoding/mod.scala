package typings.awsSdkUtilHexEncoding

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-hex-encoding", "fromHex")
  @js.native
  def fromHex(encoded: String): Uint8Array = js.native
  
  @JSImport("@aws-sdk/util-hex-encoding", "toHex")
  @js.native
  def toHex(bytes: Uint8Array): String = js.native
}
