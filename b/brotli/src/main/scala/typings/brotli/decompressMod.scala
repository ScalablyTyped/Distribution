package typings.brotli

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decompressMod {
  
  inline def apply(buffer: Buffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def apply(buffer: Buffer, outputSize: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], outputSize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("brotli/decompress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
