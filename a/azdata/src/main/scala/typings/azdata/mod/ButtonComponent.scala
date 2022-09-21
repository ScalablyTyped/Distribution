package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.ComponentWithIconProperties because Already inherited
- typings.azdata.mod.ButtonProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, iconHeight, iconPath, iconWidth, position, title, width. Inlined label, isFile, fileContent, buttonType, description, secondary, fileType */ @js.native
trait ButtonComponent
  extends StObject
     with ComponentWithIcon {
  
  /**
    * Specifies the type of button this is. Default is Normal.
    */
  var buttonType: js.UndefOr[ButtonType] = js.native
  
  /**
    * Description text to display inside button element.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The content of the currently selected file
    */
  var fileContent: js.UndefOr[String] = js.native
  
  /**
    * The file type filter used for the file input dialog box - only used when the button type is File
    */
  var fileType: js.UndefOr[String] = js.native
  
  /**
    * Whether the button opens the file browser dialog
    * @deprecated Use fileType instead
    */
  var isFile: js.UndefOr[Boolean] = js.native
  
  /**
    * The label for the button
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * An event called when the button is clicked
    */
  def onDidClick(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * An event called when the button is clicked
    */
  @JSName("onDidClick")
  var onDidClick_Original: Event[Any] = js.native
  
  /**
    * Specifies whether this is a secondary button. Default value is false.
    */
  var secondary: js.UndefOr[Boolean] = js.native
}
