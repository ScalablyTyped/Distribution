package typings.deflateJs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("deflate-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def deflate(data: Uint8Array): Uint8Array = js.native
  def deflate(data: Uint8Array, compression: Double): Uint8Array = js.native
  
  def inflate(data: Uint8Array): Uint8Array = js.native
}
