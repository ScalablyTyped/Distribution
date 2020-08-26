package typings.browserfs.zipFSMod

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("browserfs/dist/node/backend/ZipFS", JSImport.Default)
@js.native
object default extends js.Object {
  val CompressionMethod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CompressionMethod */ js.Any = js.native
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Constructs a ZipFS instance with the given options.
    */
  def Create(opts: ZipFSOptions, cb: BFSCallback[ZipFS]): Unit = js.native
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
  /* private */ def addToIndex(cd: js.Any, index: js.Any): js.Any = js.native
  /**
    * **Deprecated. Please use ZipFS.Create() method instead.**
    */
  def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit]): Unit = js.native
  def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit], deprecateMsg: Boolean): Unit = js.native
  /* private */ def computeIndexResponsive(
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
  /* private */ def getEOCD(data: js.Any): js.Any = js.native
  def isAvailable(): Boolean = js.native
}

