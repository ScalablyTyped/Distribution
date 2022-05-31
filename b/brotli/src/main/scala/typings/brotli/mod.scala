package typings.brotli

import typings.brotli.compressMod.CompressOptions
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("brotli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compress(buffer: Buffer): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def compress(buffer: Buffer, options: CompressOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def decompress(buffer: Buffer): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buffer.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def decompress(buffer: Buffer, outputSize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buffer.asInstanceOf[js.Any], outputSize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
}
