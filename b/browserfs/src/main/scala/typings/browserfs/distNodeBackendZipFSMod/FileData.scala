package typings.browserfs.distNodeBackendZipFSMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "FileData")
@js.native
open class FileData protected () extends StObject {
  def this(header: FileHeader, record: CentralDirectory, data: Buffer) = this()
  
  /* private */ var data: Any = js.native
  
  def decompress(): Buffer = js.native
  
  def getHeader(): FileHeader = js.native
  
  def getRawData(): Buffer = js.native
  
  def getRecord(): CentralDirectory = js.native
  
  /* private */ var header: Any = js.native
  
  /* private */ var record: Any = js.native
}
