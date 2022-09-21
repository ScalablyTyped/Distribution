package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.RadioButtonProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined name, label, value, checked */ @js.native
trait RadioButtonComponent
  extends StObject
     with Component {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * An event called when the value of radio button changes
    */
  def onDidChangeCheckedState(listener: js.Function1[/* e */ Boolean, Any]): Disposable = js.native
  def onDidChangeCheckedState(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeCheckedState(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidChangeCheckedState(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * An event called when the value of radio button changes
    */
  @JSName("onDidChangeCheckedState")
  var onDidChangeCheckedState_Original: Event[Boolean] = js.native
  
  /**
    * @deprecated use onDidChangeCheckedState event instead
    * An event called when the radio button is clicked
    */
  def onDidClick(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * @deprecated use onDidChangeCheckedState event instead
    * An event called when the radio button is clicked
    */
  @JSName("onDidClick")
  var onDidClick_Original: Event[Any] = js.native
  
  var value: js.UndefOr[String] = js.native
}
