package typings
package atBlueprintjsSelectLib.libEsmComponentsSelectSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select")
@js.native
class Select[T] ()
  extends reactLib.reactMod.PureComponent[ISelectProps[T], ISelectState, js.Any] {
  var TypedQueryList: js.Any = js.native
  var handleItemSelect: js.Any = js.native
  var handlePopoverClosing: js.Any = js.native
  var handlePopoverInteraction: js.Any = js.native
  var handlePopoverOpened: js.Any = js.native
  var handlePopoverOpening: js.Any = js.native
  var handleTargetKeyDown: js.Any = js.native
  var input: js.Any = js.native
  var previousFocusedElement: js.Any = js.native
  var queryList: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderQueryList: js.Any = js.native
  var resetQuery: js.Any = js.native
  @JSName("state")
  var state_Select: ISelectState = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSelect(_prevProps: ISelectProps[T], prevState: ISelectState): scala.Unit = js.native
  /* private */ def maybeRenderClearButton(query: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select")
@js.native
object Select extends js.Object {
  var displayName: java.lang.String = js.native
  def ofType[T](): org.scalablytyped.runtime.Instantiable1[
    /* props */ atBlueprintjsSelectLib.libEsmComponentsSelectSelectMod.ISelectProps[T], 
    atBlueprintjsSelectLib.libEsmComponentsSelectSelectMod.Select[T]
  ] = js.native
}

