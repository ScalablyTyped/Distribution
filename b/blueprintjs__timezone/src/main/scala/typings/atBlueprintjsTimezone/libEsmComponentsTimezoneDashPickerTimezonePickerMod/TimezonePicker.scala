package typings.atBlueprintjsTimezone.libEsmComponentsTimezoneDashPickerTimezonePickerMod

import typings.atBlueprintjsCore.atBlueprintjsCoreMod.AbstractPureComponent2
import typings.atBlueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typings.atBlueprintjsTimezone.Anon_Children
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker")
@js.native
class TimezonePicker protected ()
  extends AbstractPureComponent2[ITimezonePickerProps, ITimezonePickerState, js.Object] {
  def this(props: ITimezonePickerProps) = this()
  def this(props: ITimezonePickerProps, context: js.Any) = this()
  var filterItems: js.Any = js.native
  var handleItemSelect: js.Any = js.native
  var handleQueryChange: js.Any = js.native
  var initialTimezoneItems: js.Any = js.native
  var renderButton: js.Any = js.native
  var renderItem: js.Any = js.native
  var timezoneItems: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTimezonePicker(prevProps: ITimezonePickerProps, prevState: ITimezonePickerState): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTimezonePicker(prevProps: ITimezonePickerProps, prevState: ITimezonePickerState, snapshot: js.Object): Unit = js.native
  /* protected */ def validateProps(props: IPopoverProps with Anon_Children): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker")
@js.native
object TimezonePicker extends js.Object {
  var defaultProps: Partial[ITimezonePickerProps] = js.native
  var displayName: String = js.native
}

