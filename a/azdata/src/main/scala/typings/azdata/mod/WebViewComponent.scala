package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import typings.vscode.mod.WebviewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebViewComponent
  extends StObject
     with Component {
  
  var html: String = js.native
  
  var message: Any = js.native
  
  def onMessage(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onMessage")
  var onMessage_Original: Event[Any] = js.native
  
  val options: WebviewOptions = js.native
}
