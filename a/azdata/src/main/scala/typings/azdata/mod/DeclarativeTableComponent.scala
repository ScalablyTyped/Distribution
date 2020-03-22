package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarativeTableComponent
  extends Component
     with DeclarativeTableProperties {
  @JSName("onDataChanged")
  var onDataChanged_Original: Event[_] = js.native
  def onDataChanged(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onDataChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onDataChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}

