package typings.atBlueprintjsDatetime.libEsmDatePickerCoreMod

import typings.atBlueprintjsDatetime.atBlueprintjsDatetimeStrings.`hovered-range`
import typings.atBlueprintjsDatetime.atBlueprintjsDatetimeStrings.`selected-range`
import typings.atBlueprintjsDatetime.atBlueprintjsDatetimeStrings.disabled
import typings.atBlueprintjsDatetime.atBlueprintjsDatetimeStrings.outside
import typings.atBlueprintjsDatetime.atBlueprintjsDatetimeStrings.selected
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DISABLED_MODIFIER: disabled = js.native
  val DISALLOWED_MODIFIERS: js.Array[String] = js.native
  val HOVERED_RANGE_MODIFIER: `hovered-range` = js.native
  val OUTSIDE_MODIFIER: outside = js.native
  val SELECTED_MODIFIER: selected = js.native
  val SELECTED_RANGE_MODIFIER: `selected-range` = js.native
  def combineModifiers(baseModifiers: IDatePickerModifiers, userModifiers: IDatePickerModifiers): IDatePickerModifiers = js.native
  def getDefaultMaxDate(): Date = js.native
  def getDefaultMinDate(): Date = js.native
}

