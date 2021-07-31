package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.CardProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined label, value, actions, descriptions, status, selected, cardType */ @js.native
trait CardComponent
  extends StObject
     with Component
     with ComponentWithIcon {
  
  var actions: js.UndefOr[js.Array[ActionDescriptor]] = js.native
  
  /**
    * Card Type, default: Details
    */
  var cardType: js.UndefOr[CardType] = js.native
  
  var descriptions: js.UndefOr[js.Array[CardDescriptionItem]] = js.native
  
  var label: String = js.native
  
  def onCardSelectedChanged(listener: js.Function1[/* e */ js.Any, js.Any]): Disposable = js.native
  def onCardSelectedChanged(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: js.Any): Disposable = js.native
  def onCardSelectedChanged(
    listener: js.Function1[/* e */ js.Any, js.Any],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onCardSelectedChanged(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onCardSelectedChanged")
  var onCardSelectedChanged_Original: Event[js.Any] = js.native
  
  def onDidActionClick(listener: js.Function1[/* e */ ActionDescriptor, js.Any]): Disposable = js.native
  def onDidActionClick(listener: js.Function1[/* e */ ActionDescriptor, js.Any], thisArgs: js.Any): Disposable = js.native
  def onDidActionClick(
    listener: js.Function1[/* e */ ActionDescriptor, js.Any],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidActionClick(
    listener: js.Function1[/* e */ ActionDescriptor, js.Any],
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
  
  var value: js.UndefOr[String] = js.native
}
