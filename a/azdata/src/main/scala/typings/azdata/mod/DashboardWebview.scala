package typings.azdata.mod

import typings.azdata.mod.connection.Connection
import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardWebview extends StObject {
  
  /**
    * The connection info for the dashboard the webview exists on
    */
  val connection: Connection = js.native
  
  /**
    * Contents of the dialog body.
    */
  var html: String = js.native
  
  /**
    * Raised when the webview closed.
    */
  def onClosed(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Raised when the webview posts a message.
    */
  def onMessage(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Post a message to the webview.
    *
    * @param message Body of the message.
    */
  def postMessage(message: Any): Thenable[Any] = js.native
  
  /**
    * The info on the server for the webview dashboard
    */
  val serverInfo: ServerInfo = js.native
}
