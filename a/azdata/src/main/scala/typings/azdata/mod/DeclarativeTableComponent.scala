package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarativeTableComponent
  extends StObject
     with Component
     with DeclarativeTableProperties {
  
  def onDataChanged(listener: js.Function1[/* e */ js.Any, js.Any]): Disposable = js.native
  def onDataChanged(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: js.Any): Disposable = js.native
  def onDataChanged(
    listener: js.Function1[/* e */ js.Any, js.Any],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDataChanged(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onDataChanged")
  var onDataChanged_Original: Event[js.Any] = js.native
}
