package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.DropDownProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined value, values, editable, fireOnTextChange, required */ @js.native
trait DropDownComponent
  extends StObject
     with Component {
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var fireOnTextChange: js.UndefOr[Boolean] = js.native
  
  def onValueChanged(listener: js.Function1[/* e */ js.Any, js.Any]): Disposable = js.native
  def onValueChanged(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: js.Any): Disposable = js.native
  def onValueChanged(
    listener: js.Function1[/* e */ js.Any, js.Any],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onValueChanged(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onValueChanged")
  var onValueChanged_Original: Event[js.Any] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String | CategoryValue] = js.native
  
  var values: js.UndefOr[js.Array[CategoryValue | String]] = js.native
}
