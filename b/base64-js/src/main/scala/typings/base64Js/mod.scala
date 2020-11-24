package typings.base64Js

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("base64-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def byteLength(b64: String): Double = js.native
  
  def fromByteArray(uint8: Uint8Array): String = js.native
  
  def toByteArray(b64: String): Uint8Array = js.native
}
