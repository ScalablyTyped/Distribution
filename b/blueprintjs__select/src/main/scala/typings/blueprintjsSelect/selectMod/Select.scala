package typings.blueprintjsSelect.selectMod

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select")
@js.native
class Select[T] ()
  extends Component[ISelectProps[T], ISelectState, js.Any] {
  var TypedQueryList: js.Any = js.native
  var handleItemSelect: js.Any = js.native
  var handlePopoverClosing: js.Any = js.native
  var handlePopoverInteraction: js.Any = js.native
  var handlePopoverOpened: js.Any = js.native
  var handlePopoverOpening: js.Any = js.native
  var handleTargetKeyDown: js.Any = js.native
  var input: js.Any = js.native
  var maybeRenderClearButton: js.Any = js.native
  var previousFocusedElement: js.Any = js.native
  var queryList: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderQueryList: js.Any = js.native
  var resetQuery: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSelect(_prevProps: ISelectProps[T], prevState: ISelectState): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select")
@js.native
object Select extends js.Object {
  var displayName: String = js.native
  def ofType[T](): Instantiable1[/* props */ ISelectProps[T], Select[T]] = js.native
}

