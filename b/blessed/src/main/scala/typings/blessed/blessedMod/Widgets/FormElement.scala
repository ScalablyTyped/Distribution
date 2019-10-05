package typings.blessed.blessedMod.Widgets

import typings.blessed.blessedStrings.cancel
import typings.blessed.blessedStrings.reset
import typings.blessed.blessedStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "Widgets.FormElement")
@js.native
class FormElement[TFormData] protected () extends BoxElement {
  def this(opts: FormOptions) = this()
  /**
    * Original options object.
    */
  @JSName("options")
  var options_FormElement: FormOptions = js.native
  /**
    * Last submitted data.
    */
  var submission: TFormData = js.native
  /**
    * Discard the form.
    */
  def cancel(): Unit = js.native
  /**
    * Focus next form element.
    */
  def focusNext(): Unit = js.native
  /**
    * Focus previous form element.
    */
  def focusPrevious(): Unit = js.native
  @JSName("on")
  def on_cancel(event: cancel, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_reset(event: reset, callback: js.Function0[Unit]): this.type = js.native
  /** Form is submitted. Receives a data object. */
  @JSName("on")
  def on_submit(event: submit, callback: js.Function1[/* out */ TFormData, Unit]): this.type = js.native
  /**
    * Clear the form.
    */
  def reset(): Unit = js.native
  /**
    * Submit the form.
    */
  def submit(): Unit = js.native
}

