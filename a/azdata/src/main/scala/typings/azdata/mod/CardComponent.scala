package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.ComponentWithIconProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined iconPath, iconHeight, iconWidth, title
- typings.azdata.mod.CardProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined label, value, actions, descriptions, status, selected, cardType */ @js.native
trait CardComponent
  extends StObject
     with Component {
  
  var actions: js.UndefOr[js.Array[ActionDescriptor]] = js.native
  
  /**
    * Card Type, default: Details
    */
  var cardType: js.UndefOr[CardType] = js.native
  
  var descriptions: js.UndefOr[js.Array[CardDescriptionItem]] = js.native
  
  /**
    * The height of the icon
    */
  var iconHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * The path for the icon with optional dark-theme away alternative
    */
  var iconPath: js.UndefOr[IconPath] = js.native
  
  /**
    * The width of the icon
    */
  var iconWidth: js.UndefOr[Double | String] = js.native
  
  var label: String = js.native
  
  def onCardSelectedChanged(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onCardSelectedChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onCardSelectedChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onCardSelectedChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onCardSelectedChanged")
  var onCardSelectedChanged_Original: Event[Any] = js.native
  
  def onDidActionClick(listener: js.Function1[/* e */ ActionDescriptor, Any]): Disposable = js.native
  def onDidActionClick(listener: js.Function1[/* e */ ActionDescriptor, Any], thisArgs: Any): Disposable = js.native
  def onDidActionClick(
    listener: js.Function1[/* e */ ActionDescriptor, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidActionClick(
    listener: js.Function1[/* e */ ActionDescriptor, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  @JSName("onDidActionClick")
  var onDidActionClick_Original: Event[ActionDescriptor] = js.native
  
  /**
    * Returns true if the card is selected
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[StatusIndicator] = js.native
  
  /**
    * The title for the icon. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
