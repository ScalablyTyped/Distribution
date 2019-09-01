package typings.browserfs.distNodeBackendInMemoryMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/InMemory", JSImport.Default)
@js.native
class default () extends InMemoryFileSystem

/* static members */
@JSImport("browserfs/dist/node/backend/InMemory", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an InMemoryFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
}

