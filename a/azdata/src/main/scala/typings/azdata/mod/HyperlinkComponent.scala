package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.TitledComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined title
- typings.azdata.mod.HyperlinkComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined label, url, showLinkIcon */ @js.native
trait HyperlinkComponent
  extends StObject
     with Component {
  
  var label: String = js.native
  
  /**
    * An event called when the hyperlink is clicked
    */
  def onDidClick(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * An event called when the hyperlink is clicked
    */
  @JSName("onDidClick")
  var onDidClick_Original: Event[Unit] = js.native
  
  /**
    * Whether to show the 'external link' icon next to the hyperlink
    */
  var showLinkIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * The title for the component. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
