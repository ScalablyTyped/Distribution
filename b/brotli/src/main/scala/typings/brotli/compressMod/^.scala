package typings.brotli.compressMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("brotli/compress", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(buffer: Buffer): Uint8Array = js.native
  def apply(buffer: Buffer, options: CompressOptions): Uint8Array = js.native
}
