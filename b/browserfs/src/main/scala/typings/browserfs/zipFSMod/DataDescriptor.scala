package typings.browserfs.zipFSMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "DataDescriptor")
@js.native
class DataDescriptor protected () extends js.Object {
  def this(data: Buffer) = this()
  
  def compressedSize(): Double = js.native
  
  def crc32(): Double = js.native
  
  var data: js.Any = js.native
  
  def uncompressedSize(): Double = js.native
}
