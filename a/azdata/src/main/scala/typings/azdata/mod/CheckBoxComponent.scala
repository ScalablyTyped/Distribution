package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.CheckBoxProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined checked, label, required */ @js.native
trait CheckBoxComponent
  extends StObject
     with Component {
  
  /**
    * Whether the checkbox is checked.
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * The label to display next to the checkbox.
    */
  var label: js.UndefOr[String] = js.native
  
  def onChanged(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onChanged")
  var onChanged_Original: Event[Any] = js.native
  
  /**
    * Whether the component is marked with the 'required' property - making
    * it required to be checked for component validation.
    */
  var required: js.UndefOr[Boolean] = js.native
}
