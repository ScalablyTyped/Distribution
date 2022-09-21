package typings.azdata.mod

import typings.azdata.azdataStrings.left
import typings.azdata.azdataStrings.top
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.TitledComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined title
- typings.azdata.mod.RadioCardGroupComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined cards, cardWidth, cardHeight, iconWidth, iconHeight, selectedCardId, orientation, iconPosition */ @js.native
trait RadioCardGroupComponent
  extends StObject
     with Component {
  
  /**
    * Height of the card.
    */
  var cardHeight: String = js.native
  
  /**
    * Width of the card.
    */
  var cardWidth: String = js.native
  
  /**
    * Cards information.
    */
  var cards: js.Array[RadioCard] = js.native
  
  /**
    * Height of the icon.
    */
  var iconHeight: js.UndefOr[String] = js.native
  
  /**
    * Position of the icon. Default value is top.
    */
  var iconPosition: js.UndefOr[top | left] = js.native
  
  /**
    * Width of the icon.
    */
  var iconWidth: js.UndefOr[String] = js.native
  
  /**
    * Raised when a link a clicked in a card.
    */
  def onLinkClick(listener: js.Function1[/* e */ RadioCardLinkClickEvent, Any]): Disposable = js.native
  def onLinkClick(listener: js.Function1[/* e */ RadioCardLinkClickEvent, Any], thisArgs: Any): Disposable = js.native
  def onLinkClick(
    listener: js.Function1[/* e */ RadioCardLinkClickEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onLinkClick(
    listener: js.Function1[/* e */ RadioCardLinkClickEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * Raised when a link a clicked in a card.
    */
  @JSName("onLinkClick")
  var onLinkClick_Original: Event[RadioCardLinkClickEvent] = js.native
  
  /**
    * Raised when the selected card is changed.
    */
  def onSelectionChanged(listener: js.Function1[/* e */ RadioCardSelectionChangedEvent, Any]): Disposable = js.native
  def onSelectionChanged(listener: js.Function1[/* e */ RadioCardSelectionChangedEvent, Any], thisArgs: Any): Disposable = js.native
  def onSelectionChanged(
    listener: js.Function1[/* e */ RadioCardSelectionChangedEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onSelectionChanged(
    listener: js.Function1[/* e */ RadioCardSelectionChangedEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * Raised when the selected card is changed.
    */
  @JSName("onSelectionChanged")
  var onSelectionChanged_Original: Event[RadioCardSelectionChangedEvent] = js.native
  
  /**
    * Oritentation of the cards in the group. Default value is horizontal.
    */
  var orientation: js.UndefOr[Orientation] = js.native
  
  /**
    * Id of the currently selected card.
    */
  var selectedCardId: js.UndefOr[String] = js.native
  
  /**
    * The title for the component. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
}
