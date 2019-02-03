package typings
package atBlueprintjsSelectLib.libEsmComponentsSelectMultiSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components/select/multiSelect", "MultiSelect")
@js.native
class MultiSelect[T] ()
  extends reactLib.reactMod.PureComponent[IMultiSelectProps[T], IMultiSelectState, js.Any] {
  var TypedQueryList: js.Any = js.native
  var getTargetKeyDownHandler: js.Any = js.native
  var handleItemSelect: js.Any = js.native
  var handlePopoverInteraction: js.Any = js.native
  var handlePopoverOpened: js.Any = js.native
  var handleQueryChange: js.Any = js.native
  var input: js.UndefOr[js.Any] = js.native
  var queryList: js.UndefOr[js.Any] = js.native
  var refHandlers: js.Any = js.native
  var renderQueryList: js.Any = js.native
  @JSName("state")
  var state_MultiSelect: IMultiSelectState = js.native
}

/* static members */
@JSImport("@blueprintjs/select/lib/esm/components/select/multiSelect", "MultiSelect")
@js.native
object MultiSelect extends js.Object {
  var defaultProps: atBlueprintjsSelectLib.Anon_Placeholder = js.native
  var displayName: java.lang.String = js.native
  def ofType[T](): org.scalablytyped.runtime.Instantiable1[
    /* props */ atBlueprintjsSelectLib.libEsmComponentsSelectMultiSelectMod.IMultiSelectProps[T], 
    atBlueprintjsSelectLib.libEsmComponentsSelectMultiSelectMod.MultiSelect[T]
  ] = js.native
}

