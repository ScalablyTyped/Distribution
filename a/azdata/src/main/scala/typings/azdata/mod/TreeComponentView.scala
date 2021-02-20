package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import typings.vscode.mod.TreeViewSelectionChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeComponentView[T] extends Disposable {
  
  def onDidChangeSelection(listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], _]): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeSelection(listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  @JSName("onDidChangeSelection")
  var onDidChangeSelection_Original: Event[TreeViewSelectionChangeEvent[T]] = js.native
  
  def onNodeCheckedChanged(listener: js.Function1[/* e */ NodeCheckedEventParameters[T], _]): Disposable = js.native
  def onNodeCheckedChanged(
    listener: js.Function1[/* e */ NodeCheckedEventParameters[T], _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onNodeCheckedChanged(listener: js.Function1[/* e */ NodeCheckedEventParameters[T], _], thisArgs: js.Any): Disposable = js.native
  def onNodeCheckedChanged(
    listener: js.Function1[/* e */ NodeCheckedEventParameters[T], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  @JSName("onNodeCheckedChanged")
  var onNodeCheckedChanged_Original: Event[NodeCheckedEventParameters[T]] = js.native
}
