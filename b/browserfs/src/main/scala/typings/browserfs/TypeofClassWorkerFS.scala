package typings.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.browserfs.distNodeBackendWorkerFSMod.WorkerFS
import typings.browserfs.distNodeBackendWorkerFSMod.WorkerFSOptions
import typings.browserfs.distNodeBackendWorkerFSMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassWorkerFS
  extends Instantiable1[/* worker */ Worker, default]
     with Instantiable2[/* worker */ Worker, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  def Create(opts: WorkerFSOptions, cb: BFSCallback[WorkerFS]): Unit = js.native
  /**
    * Attaches a listener to the remote worker for file system requests.
    */
  def attachRemoteListener(worker: Worker): Unit = js.native
  def isAvailable(): Boolean = js.native
}

