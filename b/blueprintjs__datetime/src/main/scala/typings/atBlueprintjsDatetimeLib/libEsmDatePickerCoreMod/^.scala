package typings
package atBlueprintjsDatetimeLib.libEsmDatePickerCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DISABLED_MODIFIER: atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibStrings.disabled = js.native
  val DISALLOWED_MODIFIERS: js.Array[java.lang.String] = js.native
  val HOVERED_RANGE_MODIFIER: atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibStrings.`hovered-range` = js.native
  val OUTSIDE_MODIFIER: atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibStrings.outside = js.native
  val SELECTED_MODIFIER: atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibStrings.selected = js.native
  val SELECTED_RANGE_MODIFIER: atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibStrings.`selected-range` = js.native
  def combineModifiers(baseModifiers: IDatePickerModifiers, userModifiers: IDatePickerModifiers): IDatePickerModifiers = js.native
  def getDefaultMaxDate(): stdLib.Date = js.native
  def getDefaultMinDate(): stdLib.Date = js.native
}

