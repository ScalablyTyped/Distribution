package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A radio button which can be used in a form element.
  */
@JSImport("blessed", "Widgets.RadioButtonElement")
@js.native
abstract class RadioButtonElement protected () extends CheckboxElement {
  def this(opts: RadioButtonOptions) = this()
}

