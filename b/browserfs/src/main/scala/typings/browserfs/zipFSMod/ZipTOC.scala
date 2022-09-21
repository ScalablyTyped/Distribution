package typings.browserfs.zipFSMod

import typings.browserfs.fileIndexMod.FileIndex
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "ZipTOC")
@js.native
open class ZipTOC protected () extends StObject {
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
