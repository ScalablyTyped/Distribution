package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.FileBrowserTreeProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined ownerUri */ @js.native
trait FileBrowserTreeComponent
  extends StObject
     with Component {
  
  def onDidChange(listener: js.Function1[/* e */ js.Any, js.Any]): Disposable = js.native
  def onDidChange(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: js.Any): Disposable = js.native
  def onDidChange(
    listener: js.Function1[/* e */ js.Any, js.Any],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChange(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onDidChange")
  var onDidChange_Original: Event[js.Any] = js.native
  
  var ownerUri: String = js.native
}
