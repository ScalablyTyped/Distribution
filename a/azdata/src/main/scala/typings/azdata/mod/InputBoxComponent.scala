package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.InputBoxProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined value, ariaLive, placeHolder, inputType, required, multiline, rows, columns, min, max, stopEnterPropagation */ @js.native
trait InputBoxComponent
  extends StObject
     with Component {
  
  var ariaLive: js.UndefOr[String] = js.native
  
  var columns: js.UndefOr[Double] = js.native
  
  var inputType: js.UndefOr[InputBoxInputType] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var multiline: js.UndefOr[Boolean] = js.native
  
  /**
    * Event that's fired whenever enter is pressed within the input box
    */
  def onEnterKeyPressed(listener: js.Function1[/* e */ String, js.Any]): Disposable = js.native
  def onEnterKeyPressed(listener: js.Function1[/* e */ String, js.Any], thisArgs: js.Any): Disposable = js.native
  def onEnterKeyPressed(
    listener: js.Function1[/* e */ String, js.Any],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onEnterKeyPressed(listener: js.Function1[/* e */ String, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * Event that's fired whenever enter is pressed within the input box
    */
  @JSName("onEnterKeyPressed")
  var onEnterKeyPressed_Original: Event[String] = js.native
  
  def onTextChanged(listener: js.Function1[/* e */ js.Any, js.Any]): Disposable = js.native
  def onTextChanged(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: js.Any): Disposable = js.native
  def onTextChanged(
    listener: js.Function1[/* e */ js.Any, js.Any],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onTextChanged(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onTextChanged")
  var onTextChanged_Original: Event[js.Any] = js.native
  
  var placeHolder: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  /**
    * Whether to stop key event propagation when enter is pressed in the input box. Leaving this as false
    * means the event will propagate up to any parents that have handlers (such as validate on Dialogs)
    */
  var stopEnterPropagation: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
