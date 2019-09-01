package typings.browserfs.distNodeBackendZipFSMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/ZipFS", "EndOfCentralDirectory")
@js.native
class EndOfCentralDirectory protected () extends js.Object {
  def this(data: Buffer) = this()
  var data: js.Any = js.native
  def cdDiskEntryCount(): Double = js.native
  def cdDiskNumber(): Double = js.native
  def cdOffset(): Double = js.native
  def cdSize(): Double = js.native
  def cdTotalEntryCount(): Double = js.native
  def cdZipComment(): String = js.native
  def cdZipCommentLength(): Double = js.native
  def diskNumber(): Double = js.native
  def rawCdZipComment(): Buffer = js.native
}

