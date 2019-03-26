package typings
package atBlueprintjsDatetimeLib.libEsmDatePickerCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DISABLED_MODIFIER: /* disabled */ java.lang.String = js.native
  val DISALLOWED_MODIFIERS: js.Array[java.lang.String] = js.native
  val HOVERED_RANGE_MODIFIER: /* hovered-range */ java.lang.String = js.native
  val OUTSIDE_MODIFIER: /* outside */ java.lang.String = js.native
  val SELECTED_MODIFIER: /* selected */ java.lang.String = js.native
  val SELECTED_RANGE_MODIFIER: /* selected-range */ java.lang.String = js.native
  def combineModifiers(baseModifiers: IDatePickerModifiers, userModifiers: IDatePickerModifiers): IDatePickerModifiers = js.native
  def getDefaultMaxDate(): stdLib.Date = js.native
  def getDefaultMinDate(): stdLib.Date = js.native
}

