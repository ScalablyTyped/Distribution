package typings.deflateJs

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deflate-js", "deflate")
  @js.native
  def deflate(data: Uint8Array): Uint8Array = js.native
  @JSImport("deflate-js", "deflate")
  @js.native
  def deflate(data: Uint8Array, compression: Double): Uint8Array = js.native
  
  @JSImport("deflate-js", "inflate")
  @js.native
  def inflate(data: Uint8Array): Uint8Array = js.native
}
