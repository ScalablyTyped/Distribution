package typings
package bootstrapDashColorpickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Initializes an colorpicker.
    */
  def colorpicker(): JQuery = js.native
  def colorpicker(options: ColorPickerOptions): JQuery = js.native
  /**
    * Destroys the colorpicker widget and unbind all .colorpicker events from the element and component
    */
  @JSName("colorpicker")
  def colorpicker_destroy(methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.destroy): scala.Unit = js.native
  /**
    * Disable the color picker.
    */
  @JSName("colorpicker")
  def colorpicker_disable(methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.disable): scala.Unit = js.native
  /**
    * Enable the color picker.
    */
  @JSName("colorpicker")
  def colorpicker_enable(methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.enable): scala.Unit = js.native
  /**
    * Gets the value from the input or the data attribute (if has no input), otherwise returns the default value, which defaults to #000000 if not specified.
    */
  @JSName("colorpicker")
  def colorpicker_getValue(
    methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.getValue,
    defaultValue: java.lang.String
  ): java.lang.String = js.native
  /**
    * Hide the color picker
    */
  @JSName("colorpicker")
  def colorpicker_hide(methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.hide): scala.Unit = js.native
  /**
    * Updates the color picker's position relative to the element
    */
  @JSName("colorpicker")
  def colorpicker_reposition(methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.reposition): scala.Unit = js.native
  /**
    * Set a new value for the color picker (also updates everything). Triggers 'changeColor' event.
    */
  @JSName("colorpicker")
  def colorpicker_setValue(methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.setValue, value: js.Any): js.Any = js.native
  /**
    * Show the color picker
    */
  @JSName("colorpicker")
  def colorpicker_show(methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.show): scala.Unit = js.native
  /**
    * Refreshes the widget colors (this is done automatically)
    */
  @JSName("colorpicker")
  def colorpicker_update(methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.update): scala.Unit = js.native
  /**
    * Access to the colorpicker API directly
    */
  @JSName("data")
  def data_colorpicker(methodName: bootstrapDashColorpickerLib.bootstrapDashColorpickerLibStrings.colorpicker): ColorPicker = js.native
  def off(events: ColorPickerEvents): JQuery = js.native
  def off(events: ColorPickerEvents, handler: js.Function1[/* event */ ColorPickerEventObject, _]): JQuery = js.native
  def off(events: ColorPickerEvents, selector: java.lang.String): JQuery = js.native
  def off(
    events: ColorPickerEvents,
    selector: java.lang.String,
    handler: js.Function1[/* event */ ColorPickerEventObject, _]
  ): JQuery = js.native
  def on(events: ColorPickerEvents, handler: js.Function1[/* event */ ColorPickerEventObject, _]): JQuery = js.native
  def on(events: ColorPickerEvents, selector: java.lang.String, data: js.Any): JQuery = js.native
  def on(
    events: ColorPickerEvents,
    selector: java.lang.String,
    data: js.Any,
    handler: js.Function1[/* event */ ColorPickerEventObject, _]
  ): JQuery = js.native
  def on(
    events: ColorPickerEvents,
    selector: java.lang.String,
    handler: js.Function1[/* event */ ColorPickerEventObject, _]
  ): JQuery = js.native
}

