package typings.browserfsH4gEcI12.zipFSDTsMod

import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".browserfs-H4gEcI12/dist/node/backend/ZipFS.d.ts", JSImport.Default)
@js.native
open class default protected () extends ZipFS {
  def this(input: ZipTOC) = this()
  /**
    * **Deprecated. Please use ZipFS.Create() method to construct ZipFS objects.**
    */
  def this(input: Buffer) = this()
  def this(input: ZipTOC, name: String) = this()
  def this(input: Buffer, name: String) = this()
  def this(input: ZipTOC, name: String, deprecateMsg: Boolean) = this()
  def this(input: ZipTOC, name: Unit, deprecateMsg: Boolean) = this()
  def this(input: Buffer, name: String, deprecateMsg: Boolean) = this()
  def this(input: Buffer, name: Unit, deprecateMsg: Boolean) = this()
}
/* static members */
object default {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/ZipFS.d.ts", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/ZipFS.d.ts", "default.CompressionMethod")
  @js.native
  val CompressionMethod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CompressionMethod */ Any = js.native
  
  /**
    * Constructs a ZipFS instance with the given options.
    */
  inline def Create(opts: ZipFSOptions, cb: BFSCallback[ZipFS]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/ZipFS.d.ts", "default.Name")
  @js.native
  val Name: String = js.native
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/ZipFS.d.ts", "default.Options")
  @js.native
  val Options: FileSystemOptions = js.native
  
  inline def RegisterDecompressionMethod(
    m: typings.browserfsH4gEcI12.zipFSDTsMod.CompressionMethod,
    fcn: js.Function4[
      /* data */ Buffer, 
      /* compressedSize */ Double, 
      /* uncompressedSize */ Double, 
      /* flags */ Double, 
      Buffer
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterDecompressionMethod")(m.asInstanceOf[js.Any], fcn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addToIndex(cd: Any, index: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addToIndex")(cd.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * **Deprecated. Please use ZipFS.Create() method instead.**
    */
  inline def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeIndex")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit], deprecateMsg: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeIndex")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], deprecateMsg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def computeIndexResponsive(data: Any, index: Any, cdPtr: Any, cdEnd: Any, cb: Any, cdEntries: Any, eocd: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeIndexResponsive")(data.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cdPtr.asInstanceOf[js.Any], cdEnd.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], cdEntries.asInstanceOf[js.Any], eocd.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Locates the end of central directory record at the end of the file.
    * Throws an exception if it cannot be found.
    */
  inline def getEOCD(data: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEOCD")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
}
