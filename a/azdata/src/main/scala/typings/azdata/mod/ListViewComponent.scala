package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.ListViewComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined title, options, selectedOptionId */ @js.native
trait ListViewComponent
  extends StObject
     with Component {
  
  /**
    * Fired when a list view item is selected.
    */
  def onDidClick(listener: js.Function1[/* e */ ListViewClickEvent, Any]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ ListViewClickEvent, Any], thisArgs: Any): Disposable = js.native
  def onDidClick(
    listener: js.Function1[/* e */ ListViewClickEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidClick(
    listener: js.Function1[/* e */ ListViewClickEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * Fired when a list view item is selected.
    */
  @JSName("onDidClick")
  var onDidClick_Original: Event[ListViewClickEvent] = js.native
  
  /**
    * Items in the list view.
    */
  var options: js.Array[ListViewOption] = js.native
  
  /**
    * Id of the currently selected option.
    */
  var selectedOptionId: js.UndefOr[String] = js.native
  
  /**
    * Title of the component.
    */
  var title: js.UndefOr[ListViewTitle] = js.native
}
