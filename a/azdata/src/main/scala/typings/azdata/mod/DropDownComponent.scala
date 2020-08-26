package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.DropDownProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined value, values, editable, fireOnTextChange, required */ @js.native
trait DropDownComponent extends Component {
  var editable: js.UndefOr[Boolean] = js.native
  var fireOnTextChange: js.UndefOr[Boolean] = js.native
  @JSName("onValueChanged")
  var onValueChanged_Original: Event[_] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String | CategoryValue] = js.native
  var values: js.UndefOr[js.Array[CategoryValue | String]] = js.native
  def onValueChanged(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onValueChanged(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onValueChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onValueChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}

