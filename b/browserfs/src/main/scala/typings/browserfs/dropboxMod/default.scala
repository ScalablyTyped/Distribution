package typings.browserfs.dropboxMod

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.dropboxjs.Dropbox.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/Dropbox", JSImport.Default)
@js.native
class default protected () extends DropboxFileSystem {
  /**
    * **Deprecated. Please use Dropbox.Create() method instead.**
    *
    * Constructs a Dropbox-backed file system using the *authenticated* DropboxJS client.
    *
    * Note that you must use the old v0.10 version of the Dropbox JavaScript SDK.
    */
  def this(client: Client) = this()
  def this(client: Client, deprecateMsg: Boolean) = this()
}

/* static members */
@JSImport("browserfs/dist/node/backend/Dropbox", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a new DropboxFileSystem instance with the given options.
    * Must be given an *authenticated* DropboxJS client from the old v0.10 version of the Dropbox JS SDK.
    */
  def Create(opts: DropboxFileSystemOptions, cb: BFSCallback[DropboxFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

