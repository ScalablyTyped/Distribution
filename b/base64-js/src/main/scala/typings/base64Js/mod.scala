package typings.base64Js

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64-js", "byteLength")
  @js.native
  def byteLength(b64: String): Double = js.native
  
  @JSImport("base64-js", "fromByteArray")
  @js.native
  def fromByteArray(uint8: Uint8Array): String = js.native
  
  @JSImport("base64-js", "toByteArray")
  @js.native
  def toByteArray(b64: String): Uint8Array = js.native
}
