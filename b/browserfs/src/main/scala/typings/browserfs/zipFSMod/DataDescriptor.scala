package typings.browserfs.zipFSMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "DataDescriptor")
@js.native
open class DataDescriptor protected () extends StObject {
  def this(data: Buffer) = this()
  
  def compressedSize(): Double = js.native
  
  def crc32(): Double = js.native
  
  /* private */ var data: Any = js.native
  
  def uncompressedSize(): Double = js.native
}
