package typings.browserfs.zipFSMod

import typings.browserfs.fileIndexMod.FileIndex
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/ZipFS", "ZipTOC")
@js.native
class ZipTOC protected () extends js.Object {
  def this(
    index: FileIndex[CentralDirectory],
    directoryEntries: js.Array[CentralDirectory],
    eocd: EndOfCentralDirectory,
    data: Buffer
  ) = this()
  var data: Buffer = js.native
  var directoryEntries: js.Array[CentralDirectory] = js.native
  var eocd: EndOfCentralDirectory = js.native
  var index: FileIndex[CentralDirectory] = js.native
}

