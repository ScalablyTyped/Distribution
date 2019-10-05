package typings.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.browserfs.distNodeBackendDropboxMod.DropboxFileSystem
import typings.browserfs.distNodeBackendDropboxMod.DropboxFileSystemOptions
import typings.browserfs.distNodeBackendDropboxMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import typings.dropboxjs.Dropbox.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassDropbox
  extends Instantiable1[/* client */ Client, default]
     with Instantiable2[/* client */ Client, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a new DropboxFileSystem instance with the given options.
    * Must be given an *authenticated* DropboxJS client from the old v0.10 version of the Dropbox JS SDK.
    */
  def Create(opts: DropboxFileSystemOptions, cb: BFSCallback[DropboxFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

