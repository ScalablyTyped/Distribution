package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.InputBoxProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined value, ariaLive, placeHolder, inputType, required, multiline, rows, columns, min, max, stopEnterPropagation, validationErrorMessage, readOnly, title, maxLength */ @js.native
trait InputBoxComponent
  extends StObject
     with Component {
  
  var ariaLive: js.UndefOr[AriaLiveValue] = js.native
  
  var columns: js.UndefOr[Double] = js.native
  
  var inputType: js.UndefOr[InputBoxInputType] = js.native
  
  /**
    * The maximum value allowed for the input. Only valid for number inputs.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of characters allowed in the input box.
    */
  var maxLength: js.UndefOr[Double] = js.native
  
  /**
    * The minimum value allowed for the input. Only valid for number inputs.
    */
  var min: js.UndefOr[Double] = js.native
  
  var multiline: js.UndefOr[Boolean] = js.native
  
  /**
    * Event that's fired whenever enter is pressed within the input box
    */
  def onEnterKeyPressed(listener: js.Function1[/* e */ String, Any]): Disposable = js.native
  def onEnterKeyPressed(listener: js.Function1[/* e */ String, Any], thisArgs: Any): Disposable = js.native
  def onEnterKeyPressed(listener: js.Function1[/* e */ String, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onEnterKeyPressed(listener: js.Function1[/* e */ String, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * Event that's fired whenever enter is pressed within the input box
    */
  @JSName("onEnterKeyPressed")
  var onEnterKeyPressed_Original: Event[String] = js.native
  
  def onTextChanged(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onTextChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onTextChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onTextChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onTextChanged")
  var onTextChanged_Original: Event[Any] = js.native
  
  var placeHolder: js.UndefOr[String] = js.native
  
  /**
    * Whether the input box is marked with the 'readonly' attribute
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  /**
    * Whether to stop key event propagation when enter is pressed in the input box. Leaving this as false
    * means the event will propagate up to any parents that have handlers (such as validate on Dialogs)
    */
  var stopEnterPropagation: js.UndefOr[Boolean] = js.native
  
  /**
    * This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The error message to show when custom validation fails. Note that built-in validations
    * (such as min/max values) will use the default error messages for those validations
    * as appropriate.
    */
  var validationErrorMessage: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
