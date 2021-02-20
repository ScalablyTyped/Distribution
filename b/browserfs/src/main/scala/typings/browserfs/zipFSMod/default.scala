package typings.browserfs.zipFSMod

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", JSImport.Default)
@js.native
class default protected () extends ZipFS {
  def this(input: ZipTOC) = this()
  /**
    * **Deprecated. Please use ZipFS.Create() method to construct ZipFS objects.**
    */
  def this(input: Buffer) = this()
  def this(input: ZipTOC, name: String) = this()
  def this(input: Buffer, name: String) = this()
  def this(input: ZipTOC, name: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
  def this(input: ZipTOC, name: String, deprecateMsg: Boolean) = this()
  def this(input: Buffer, name: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
  def this(input: Buffer, name: String, deprecateMsg: Boolean) = this()
}
/* static members */
object default {
  
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.CompressionMethod")
  @js.native
  val CompressionMethod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CompressionMethod */ js.Any = js.native
  
  /**
    * Constructs a ZipFS instance with the given options.
    */
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.Create")
  @js.native
  def Create(opts: ZipFSOptions, cb: BFSCallback[ZipFS]): Unit = js.native
  
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.Name")
  @js.native
  val Name: String = js.native
  
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.Options")
  @js.native
  val Options: FileSystemOptions = js.native
  
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.RegisterDecompressionMethod")
  @js.native
  def RegisterDecompressionMethod(
    m: typings.browserfs.zipFSMod.CompressionMethod,
    fcn: js.Function4[
      /* data */ Buffer, 
      /* compressedSize */ Double, 
      /* uncompressedSize */ Double, 
      /* flags */ Double, 
      Buffer
    ]
  ): Unit = js.native
  
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.addToIndex")
  @js.native
  def addToIndex(cd: js.Any, index: js.Any): js.Any = js.native
  
  /**
    * **Deprecated. Please use ZipFS.Create() method instead.**
    */
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.computeIndex")
  @js.native
  def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit]): Unit = js.native
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.computeIndex")
  @js.native
  def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit], deprecateMsg: Boolean): Unit = js.native
  
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.computeIndexResponsive")
  @js.native
  def computeIndexResponsive(
    data: js.Any,
    index: js.Any,
    cdPtr: js.Any,
    cdEnd: js.Any,
    cb: js.Any,
    cdEntries: js.Any,
    eocd: js.Any
  ): js.Any = js.native
  
  /**
    * Locates the end of central directory record at the end of the file.
    * Throws an exception if it cannot be found.
    */
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.getEOCD")
  @js.native
  def getEOCD(data: js.Any): js.Any = js.native
  
  @JSImport("browserfs/dist/node/backend/ZipFS", "default.isAvailable")
  @js.native
  def isAvailable(): Boolean = js.native
}
