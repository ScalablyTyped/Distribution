package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.distNodeBackendZipFSMod.CompressionMethod
import typings.browserfs.distNodeBackendZipFSMod.ZipFS
import typings.browserfs.distNodeBackendZipFSMod.ZipFSOptions
import typings.browserfs.distNodeBackendZipFSMod.ZipTOC
import typings.browserfs.distNodeBackendZipFSMod.default
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofZipFS
  extends StObject
     with Instantiable1[(/* input */ Buffer) | (/* input */ ZipTOC), default]
     with Instantiable2[(/* input */ Buffer) | (/* input */ ZipTOC), /* name */ String, default]
     with Instantiable3[
      (/* input */ Buffer) | (/* input */ ZipTOC), 
      (/* name */ String) | (/* name */ Unit), 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  
  /**
    * Constructs a ZipFS instance with the given options.
    */
  def Create(opts: ZipFSOptions, cb: BFSCallback[ZipFS]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def RegisterDecompressionMethod(
    m: CompressionMethod,
    fcn: js.Function4[
      /* data */ Buffer, 
      /* compressedSize */ Double, 
      /* uncompressedSize */ Double, 
      /* flags */ Double, 
      Buffer
    ]
  ): Unit = js.native
  
  /* private */ def addToIndex(cd: Any, index: Any): Any = js.native
  
  /**
    * **Deprecated. Please use ZipFS.Create() method instead.**
    */
  def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit]): Unit = js.native
  def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit], deprecateMsg: Boolean): Unit = js.native
  
  /* private */ def computeIndexResponsive(data: Any, index: Any, cdPtr: Any, cdEnd: Any, cb: Any, cdEntries: Any, eocd: Any): Any = js.native
  
  /**
    * Locates the end of central directory record at the end of the file.
    * Throws an exception if it cannot be found.
    */
  /* private */ def getEOCD(data: Any): Any = js.native
  
  def isAvailable(): Boolean = js.native
}
