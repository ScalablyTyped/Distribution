package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.ListBoxProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined selectedRow, values */ @js.native
trait ListBoxComponent
  extends StObject
     with Component {
  
  def onRowSelected(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onRowSelected")
  var onRowSelected_Original: Event[Any] = js.native
  
  var selectedRow: js.UndefOr[Double] = js.native
  
  var values: js.UndefOr[js.Array[String]] = js.native
}
