package typings.bufferCrc32

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): Buffer = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def apply(input: String, partialCrc: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def apply(input: Buffer, partialCrc: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("buffer-crc32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signed(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("signed")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def unsigned(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unsigned")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
}
