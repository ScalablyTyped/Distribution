package typings
package atBlueprintjsDatetimeLib.libEsmTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker")
@js.native
class TimePicker ()
  extends reactLib.reactMod.Component[ITimePickerProps, ITimePickerState, js.Any] {
  def this(props: ITimePickerProps) = this()
  def this(props: ITimePickerProps, context: js.Any) = this()
  var decrementTime: js.Any = js.native
  var getInputBlurHandler: js.Any = js.native
  var getInputChangeHandler: js.Any = js.native
  var getInputKeyDownHandler: js.Any = js.native
  var handleAmPmChange: js.Any = js.native
  var handleFocus: js.Any = js.native
  var incrementTime: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTimePicker(nextProps: ITimePickerProps): scala.Unit = js.native
  /**
    * Generates a full ITimePickerState object with all text fields set to formatted strings based on value
    */
  /* private */ def getFullStateFromValue(value: js.Any, useAmPm: js.Any): js.Any = js.native
  /* private */ def maybeRenderAmPm(): js.Any = js.native
  /* private */ def maybeRenderArrowButton(isDirectionUp: js.Any, timeUnit: js.Any): js.Any = js.native
  /* private */ def renderDivider(): js.Any = js.native
  /* private */ def renderDivider(text: js.Any): js.Any = js.native
  /* private */ def renderInput(className: js.Any, unit: js.Any, value: js.Any): js.Any = js.native
  /* private */ def shiftTime(unit: js.Any, amount: js.Any): js.Any = js.native
  /* private */ def updateState(state: js.Any): js.Any = js.native
  /* private */ def updateTime(time: js.Any, unit: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker")
@js.native
object TimePicker extends js.Object {
  var defaultProps: atBlueprintjsDatetimeLib.libEsmTimePickerMod.ITimePickerProps = js.native
  var displayName: java.lang.String = js.native
}

