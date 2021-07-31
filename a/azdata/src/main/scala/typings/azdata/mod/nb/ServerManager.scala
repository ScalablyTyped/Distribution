package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerManager extends StObject {
  
  /**
    * Indicates if the server is started at the current time
    */
  val isStarted: Boolean = js.native
  
  /**
    * Event sent when the server has started. This can be used to query
    * the manager for server settings
    */
  def onServerStarted(listener: js.Function1[/* e */ Unit, js.Any]): Disposable = js.native
  def onServerStarted(listener: js.Function1[/* e */ Unit, js.Any], thisArgs: js.Any): Disposable = js.native
  def onServerStarted(listener: js.Function1[/* e */ Unit, js.Any], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onServerStarted(listener: js.Function1[/* e */ Unit, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Starts the server. Some server types may not support or require this.
    * Should no-op if server is already started
    */
  def startServer(kernelSpec: IKernelSpec): Thenable[Unit] = js.native
  
  /**
    * Stops the server. Some server types may not support or require this
    */
  def stopServer(): Thenable[Unit] = js.native
}
