package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioButtonComponent
  extends StObject
     with Component
     with RadioButtonProperties {
  
  /**
    * An event called when the radio button is clicked
    */
  def onDidClick(listener: js.Function1[/* e */ js.Any, js.Any]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: js.Any): Disposable = js.native
  def onDidClick(
    listener: js.Function1[/* e */ js.Any, js.Any],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * An event called when the radio button is clicked
    */
  @JSName("onDidClick")
  var onDidClick_Original: Event[js.Any] = js.native
}
