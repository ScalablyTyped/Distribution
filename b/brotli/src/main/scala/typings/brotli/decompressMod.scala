package typings.brotli

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("brotli/decompress", JSImport.Namespace)
@js.native
object decompressMod extends js.Object {
  
  def apply(buffer: Buffer): Uint8Array = js.native
  def apply(buffer: Buffer, outputSize: Double): Uint8Array = js.native
}
