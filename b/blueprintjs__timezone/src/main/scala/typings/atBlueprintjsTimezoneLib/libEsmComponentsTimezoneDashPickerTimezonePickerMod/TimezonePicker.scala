package typings
package atBlueprintjsTimezoneLib.libEsmComponentsTimezoneDashPickerTimezonePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker")
@js.native
class TimezonePicker protected ()
  extends atBlueprintjsCoreLib.coreMod.AbstractPureComponent[ITimezonePickerProps, ITimezonePickerState] {
  def this(props: ITimezonePickerProps) = this()
  def this(props: ITimezonePickerProps, context: js.Any) = this()
  var filterItems: js.Any = js.native
  var handleItemSelect: js.Any = js.native
  var handleQueryChange: js.Any = js.native
  var initialTimezoneItems: js.Any = js.native
  var renderItem: js.Any = js.native
  var timezoneItems: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTimezonePicker(nextProps: ITimezonePickerProps): scala.Unit = js.native
  /* private */ def renderButton(): js.Any = js.native
}

@JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker")
@js.native
object TimezonePicker extends js.Object {
  var defaultProps: stdLib.Partial[
    atBlueprintjsTimezoneLib.libEsmComponentsTimezoneDashPickerTimezonePickerMod.ITimezonePickerProps
  ] = js.native
  var displayName: java.lang.String = js.native
}

