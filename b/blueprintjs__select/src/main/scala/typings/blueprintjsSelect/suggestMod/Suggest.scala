package typings.blueprintjsSelect.suggestMod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsSelect.PartialISuggestPropsany
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components/select/suggest", "Suggest")
@js.native
class Suggest[T] ()
  extends Component[ISuggestProps[T], ISuggestState[T], js.Any] {
  var TypedQueryList: js.Any = js.native
  var getInitialSelectedItem: js.Any = js.native
  var getTargetKeyDownHandler: js.Any = js.native
  var getTargetKeyUpHandler: js.Any = js.native
  var handleInputFocus: js.Any = js.native
  var handleItemSelect: js.Any = js.native
  var handlePopoverInteraction: js.Any = js.native
  var handlePopoverOpened: js.Any = js.native
  var handlePopoverOpening: js.Any = js.native
  var input: js.Any = js.native
  var maybeResetActiveItemToSelectedItem: js.Any = js.native
  var queryList: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderQueryList: js.Any = js.native
  var selectText: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSuggest(_prevProps: ISuggestProps[T], prevState: ISuggestState[T]): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/select/lib/esm/components/select/suggest", "Suggest")
@js.native
object Suggest extends js.Object {
  var defaultProps: PartialISuggestPropsany = js.native
  var displayName: String = js.native
  def ofType[T](): Instantiable1[/* props */ ISuggestProps[T], Suggest[T]] = js.native
}

