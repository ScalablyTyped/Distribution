package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.LoadingComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined loading, showText, loadingText, loadingCompletedText
- typings.azdata.mod.DropDownProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined value, values, editable, fireOnTextChange, required, placeholder, validationErrorMessages */ @js.native
trait DropDownComponent
  extends StObject
     with Component {
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var fireOnTextChange: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to show the loading spinner instead of the contained component. True by default
    */
  var loading: js.UndefOr[Boolean] = js.native
  
  /**
    * The text to display while loading is set to false. Will also be announced through screen readers
    * once loading is completed.
    */
  var loadingCompletedText: js.UndefOr[String] = js.native
  
  /**
    * The text to display while loading is set to true
    */
  var loadingText: js.UndefOr[String] = js.native
  
  def onValueChanged(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onValueChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onValueChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onValueChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onValueChanged")
  var onValueChanged_Original: Event[Any] = js.native
  
  /**
    * Adds a short hint that describes the expected value for the editable dropdown
    */
  var placeholder: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to show the loading text next to the spinner
    */
  var showText: js.UndefOr[Boolean] = js.native
  
  /**
    * Define error messages to show when custom validation fails. For empty required dropdowns we use a default error message.
    */
  var validationErrorMessages: js.UndefOr[js.Array[String]] = js.native
  
  var value: js.UndefOr[String | CategoryValue] = js.native
  
  var values: js.UndefOr[js.Array[CategoryValue | String]] = js.native
}
