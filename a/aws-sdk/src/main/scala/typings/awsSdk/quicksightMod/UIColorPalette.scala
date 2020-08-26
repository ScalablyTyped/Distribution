package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIColorPalette extends js.Object {
  /**
    * This color is that applies to selected states and buttons.
    */
  var Accent: js.UndefOr[HexColor] = js.native
  /**
    * The foreground color that applies to any text or other elements that appear over the accent color.
    */
  var AccentForeground: js.UndefOr[HexColor] = js.native
  /**
    * The color that applies to error messages.
    */
  var Danger: js.UndefOr[HexColor] = js.native
  /**
    * The foreground color that applies to any text or other elements that appear over the error color.
    */
  var DangerForeground: js.UndefOr[HexColor] = js.native
  /**
    * The color that applies to the names of fields that are identified as dimensions.
    */
  var Dimension: js.UndefOr[HexColor] = js.native
  /**
    * The foreground color that applies to any text or other elements that appear over the dimension color.
    */
  var DimensionForeground: js.UndefOr[HexColor] = js.native
  /**
    * The color that applies to the names of fields that are identified as measures.
    */
  var Measure: js.UndefOr[HexColor] = js.native
  /**
    * The foreground color that applies to any text or other elements that appear over the measure color.
    */
  var MeasureForeground: js.UndefOr[HexColor] = js.native
  /**
    * The background color that applies to visuals and other high emphasis UI.
    */
  var PrimaryBackground: js.UndefOr[HexColor] = js.native
  /**
    * The color of text and other foreground elements that appear over the primary background regions, such as grid lines, borders, table banding, icons, and so on.
    */
  var PrimaryForeground: js.UndefOr[HexColor] = js.native
  /**
    * The background color that applies to the sheet background and sheet controls.
    */
  var SecondaryBackground: js.UndefOr[HexColor] = js.native
  /**
    * The foreground color that applies to any sheet title, sheet control text, or UI that appears over the secondary background.
    */
  var SecondaryForeground: js.UndefOr[HexColor] = js.native
  /**
    * The color that applies to success messages, for example the check mark for a successful download.
    */
  var Success: js.UndefOr[HexColor] = js.native
  /**
    * The foreground color that applies to any text or other elements that appear over the success color.
    */
  var SuccessForeground: js.UndefOr[HexColor] = js.native
  /**
    * This color that applies to warning and informational messages.
    */
  var Warning: js.UndefOr[HexColor] = js.native
  /**
    * The foreground color that applies to any text or other elements that appear over the warning color.
    */
  var WarningForeground: js.UndefOr[HexColor] = js.native
}

object UIColorPalette {
  @scala.inline
  def apply(): UIColorPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIColorPalette]
  }
  @scala.inline
  implicit class UIColorPaletteOps[Self <: UIColorPalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccent(value: HexColor): Self = this.set("Accent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccent: Self = this.set("Accent", js.undefined)
    @scala.inline
    def setAccentForeground(value: HexColor): Self = this.set("AccentForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccentForeground: Self = this.set("AccentForeground", js.undefined)
    @scala.inline
    def setDanger(value: HexColor): Self = this.set("Danger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDanger: Self = this.set("Danger", js.undefined)
    @scala.inline
    def setDangerForeground(value: HexColor): Self = this.set("DangerForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerForeground: Self = this.set("DangerForeground", js.undefined)
    @scala.inline
    def setDimension(value: HexColor): Self = this.set("Dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimension: Self = this.set("Dimension", js.undefined)
    @scala.inline
    def setDimensionForeground(value: HexColor): Self = this.set("DimensionForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionForeground: Self = this.set("DimensionForeground", js.undefined)
    @scala.inline
    def setMeasure(value: HexColor): Self = this.set("Measure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasure: Self = this.set("Measure", js.undefined)
    @scala.inline
    def setMeasureForeground(value: HexColor): Self = this.set("MeasureForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureForeground: Self = this.set("MeasureForeground", js.undefined)
    @scala.inline
    def setPrimaryBackground(value: HexColor): Self = this.set("PrimaryBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryBackground: Self = this.set("PrimaryBackground", js.undefined)
    @scala.inline
    def setPrimaryForeground(value: HexColor): Self = this.set("PrimaryForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryForeground: Self = this.set("PrimaryForeground", js.undefined)
    @scala.inline
    def setSecondaryBackground(value: HexColor): Self = this.set("SecondaryBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryBackground: Self = this.set("SecondaryBackground", js.undefined)
    @scala.inline
    def setSecondaryForeground(value: HexColor): Self = this.set("SecondaryForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryForeground: Self = this.set("SecondaryForeground", js.undefined)
    @scala.inline
    def setSuccess(value: HexColor): Self = this.set("Success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("Success", js.undefined)
    @scala.inline
    def setSuccessForeground(value: HexColor): Self = this.set("SuccessForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessForeground: Self = this.set("SuccessForeground", js.undefined)
    @scala.inline
    def setWarning(value: HexColor): Self = this.set("Warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("Warning", js.undefined)
    @scala.inline
    def setWarningForeground(value: HexColor): Self = this.set("WarningForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarningForeground: Self = this.set("WarningForeground", js.undefined)
  }
  
}

