package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import typings.vscode.mod.WebviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewComponent extends Component {
  var html: String = js.native
  var message: js.Any = js.native
  @JSName("onMessage")
  var onMessage_Original: Event[_] = js.native
  val options: WebviewOptions = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}

