package typings.browserfs.zipFSMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "FileData")
@js.native
class FileData protected () extends StObject {
  def this(header: FileHeader, record: CentralDirectory, data: Buffer) = this()
  
  var data: js.Any = js.native
  
  def decompress(): Buffer = js.native
  
  def getHeader(): FileHeader = js.native
  
  def getRawData(): Buffer = js.native
  
  def getRecord(): CentralDirectory = js.native
  
  var header: js.Any = js.native
  
  var record: js.Any = js.native
}
