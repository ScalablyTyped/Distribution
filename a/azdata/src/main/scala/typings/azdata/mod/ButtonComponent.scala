package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.ButtonProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined label, isFile, fileContent, title */ @js.native
trait ButtonComponent
  extends StObject
     with Component
     with ComponentWithIcon {
  
  /**
    * The content of the currently selected file
    */
  var fileContent: js.UndefOr[String] = js.native
  
  /**
    * Whether the button opens the file browser dialog
    */
  var isFile: js.UndefOr[Boolean] = js.native
  
  /**
    * The label for the button
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * An event called when the button is clicked
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
    * An event called when the button is clicked
    */
  @JSName("onDidClick")
  var onDidClick_Original: Event[js.Any] = js.native
  
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    *
    * The title for the button. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
}
