package typings.browserfs.distNodeBackendWorkerFSMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/WorkerFS", JSImport.Default)
@js.native
class default protected () extends WorkerFS {
  /**
    * **Deprecated. Please use WorkerFS.Create() method instead.**
    *
    * Constructs a new WorkerFS instance that connects with BrowserFS running on
    * the specified worker.
    */
  def this(worker: Worker) = this()
  def this(worker: Worker, deprecateMsg: Boolean) = this()
}

/* static members */
@JSImport("browserfs/dist/node/backend/WorkerFS", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  def Create(opts: WorkerFSOptions, cb: BFSCallback[WorkerFS]): Unit = js.native
  /**
    * Attaches a listener to the remote worker for file system requests.
    */
  def attachRemoteListener(worker: Worker): Unit = js.native
  def isAvailable(): Boolean = js.native
}

