package typings
package bufferDashCrc32Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer-crc32", JSImport.Namespace)
@js.native
object bufferDashCrc32Mod extends js.Object {
  def apply(input: java.lang.String | nodeLib.Buffer): nodeLib.Buffer = js.native
  def apply(input: java.lang.String | nodeLib.Buffer, partialCrc: nodeLib.Buffer): nodeLib.Buffer = js.native
  def signed(buffer: nodeLib.Buffer): scala.Double = js.native
  def unsigned(buffer: nodeLib.Buffer): scala.Double = js.native
}

