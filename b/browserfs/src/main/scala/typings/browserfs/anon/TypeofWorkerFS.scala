package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.browserfs.distNodeBackendWorkerFSMod.WorkerFS
import typings.browserfs.distNodeBackendWorkerFSMod.WorkerFSOptions
import typings.browserfs.distNodeBackendWorkerFSMod.default
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWorkerFS
  extends StObject
     with Instantiable1[/* worker */ Worker, default]
     with Instantiable2[/* worker */ Worker, /* deprecateMsg */ Boolean, default] {
  
  def Create(opts: WorkerFSOptions, cb: BFSCallback[WorkerFS]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  /**
    * Attaches a listener to the remote worker for file system requests.
    */
  def attachRemoteListener(worker: Worker): Unit = js.native
  
  def isAvailable(): Boolean = js.native
}
