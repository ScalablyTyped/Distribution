package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.SliderComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined value, min, max, step, showTicks */ @js.native
trait SliderComponent
  extends StObject
     with Component {
  
  /**
    * The maximum value of the slider. Default value is 100.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum value of the slider. Default value is 1.
    */
  var min: js.UndefOr[Double] = js.native
  
  def onChanged(listener: js.Function1[/* e */ Double, Any]): Disposable = js.native
  def onChanged(listener: js.Function1[/* e */ Double, Any], thisArgs: Any): Disposable = js.native
  def onChanged(listener: js.Function1[/* e */ Double, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onChanged(listener: js.Function1[/* e */ Double, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onChanged")
  var onChanged_Original: Event[Double] = js.native
  
  def onInput(listener: js.Function1[/* e */ Double, Any]): Disposable = js.native
  def onInput(listener: js.Function1[/* e */ Double, Any], thisArgs: Any): Disposable = js.native
  def onInput(listener: js.Function1[/* e */ Double, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onInput(listener: js.Function1[/* e */ Double, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onInput")
  var onInput_Original: Event[Double] = js.native
  
  /**
    * Whether to show the tick marks on the slider. Default is false.
    */
  var showTicks: js.UndefOr[Boolean] = js.native
  
  /**
    * The value between each "tick" of the slider. Default is 1.
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * The value selected on the slider. Default initial value is the minimum value.
    */
  var value: js.UndefOr[Double] = js.native
}
