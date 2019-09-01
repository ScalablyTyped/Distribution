package typings.browserfs

import org.scalablytyped.runtime.Instantiable0
import typings.browserfs.distNodeBackendInMemoryMod.InMemoryFileSystem
import typings.browserfs.distNodeBackendInMemoryMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassInMemory extends Instantiable0[default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an InMemoryFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
}

