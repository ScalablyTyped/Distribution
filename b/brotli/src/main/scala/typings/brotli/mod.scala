package typings.brotli

import typings.brotli.compressMod.CompressOptions
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object compress {
    
    @JSImport("brotli", "compress")
    @js.native
    def apply(buffer: Buffer): Uint8Array = js.native
    @JSImport("brotli", "compress")
    @js.native
    def apply(buffer: Buffer, options: CompressOptions): Uint8Array = js.native
  }
  
  @JSImport("brotli", "decompress")
  @js.native
  def decompress(buffer: Buffer): Uint8Array = js.native
  @JSImport("brotli", "decompress")
  @js.native
  def decompress(buffer: Buffer, outputSize: Double): Uint8Array = js.native
}
