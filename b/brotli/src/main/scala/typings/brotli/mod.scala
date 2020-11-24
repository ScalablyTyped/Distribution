package typings.brotli

import typings.brotli.compressMod.CompressOptions
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("brotli", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object compress extends js.Object {
    
    def apply(buffer: Buffer): Uint8Array = js.native
    def apply(buffer: Buffer, options: CompressOptions): Uint8Array = js.native
  }
  
  @js.native
  object decompress extends js.Object {
    
    def apply(buffer: Buffer): Uint8Array = js.native
    def apply(buffer: Buffer, outputSize: Double): Uint8Array = js.native
  }
}
