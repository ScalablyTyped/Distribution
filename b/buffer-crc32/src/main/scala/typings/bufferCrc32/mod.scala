package typings.bufferCrc32

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("buffer-crc32", JSImport.Namespace)
  @js.native
  def apply(input: String): Buffer = js.native
  @JSImport("buffer-crc32", JSImport.Namespace)
  @js.native
  def apply(input: String, partialCrc: Buffer): Buffer = js.native
  @JSImport("buffer-crc32", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): Buffer = js.native
  @JSImport("buffer-crc32", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, partialCrc: Buffer): Buffer = js.native
  
  @JSImport("buffer-crc32", "signed")
  @js.native
  def signed(buffer: Buffer): Double = js.native
  
  @JSImport("buffer-crc32", "unsigned")
  @js.native
  def unsigned(buffer: Buffer): Double = js.native
}
