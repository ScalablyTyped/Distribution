package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIColorPalette extends StObject {
  
  /**
    * This color is that applies to selected states and buttons.
    */
  var Accent: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the accent color.
    */
  var AccentForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color that applies to error messages.
    */
  var Danger: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the error color.
    */
  var DangerForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color that applies to the names of fields that are identified as dimensions.
    */
  var Dimension: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the dimension color.
    */
  var DimensionForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color that applies to the names of fields that are identified as measures.
    */
  var Measure: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the measure color.
    */
  var MeasureForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The background color that applies to visuals and other high emphasis UI.
    */
  var PrimaryBackground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color of text and other foreground elements that appear over the primary background regions, such as grid lines, borders, table banding, icons, and so on.
    */
  var PrimaryForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The background color that applies to the sheet background and sheet controls.
    */
  var SecondaryBackground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any sheet title, sheet control text, or UI that appears over the secondary background.
    */
  var SecondaryForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color that applies to success messages, for example the check mark for a successful download.
    */
  var Success: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the success color.
    */
  var SuccessForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * This color that applies to warning and informational messages.
    */
  var Warning: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the warning color.
    */
  var WarningForeground: js.UndefOr[HexColor] = js.undefined
}
object UIColorPalette {
  
  @scala.inline
  def apply(): UIColorPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIColorPalette]
  }
  
  @scala.inline
  implicit class UIColorPaletteMutableBuilder[Self <: UIColorPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccent(value: HexColor): Self = StObject.set(x, "Accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentForeground(value: HexColor): Self = StObject.set(x, "AccentForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentForegroundUndefined: Self = StObject.set(x, "AccentForeground", js.undefined)
    
    @scala.inline
    def setAccentUndefined: Self = StObject.set(x, "Accent", js.undefined)
    
    @scala.inline
    def setDanger(value: HexColor): Self = StObject.set(x, "Danger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerForeground(value: HexColor): Self = StObject.set(x, "DangerForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerForegroundUndefined: Self = StObject.set(x, "DangerForeground", js.undefined)
    
    @scala.inline
    def setDangerUndefined: Self = StObject.set(x, "Danger", js.undefined)
    
    @scala.inline
    def setDimension(value: HexColor): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionForeground(value: HexColor): Self = StObject.set(x, "DimensionForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionForegroundUndefined: Self = StObject.set(x, "DimensionForeground", js.undefined)
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "Dimension", js.undefined)
    
    @scala.inline
    def setMeasure(value: HexColor): Self = StObject.set(x, "Measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureForeground(value: HexColor): Self = StObject.set(x, "MeasureForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureForegroundUndefined: Self = StObject.set(x, "MeasureForeground", js.undefined)
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "Measure", js.undefined)
    
    @scala.inline
    def setPrimaryBackground(value: HexColor): Self = StObject.set(x, "PrimaryBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryBackgroundUndefined: Self = StObject.set(x, "PrimaryBackground", js.undefined)
    
    @scala.inline
    def setPrimaryForeground(value: HexColor): Self = StObject.set(x, "PrimaryForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryForegroundUndefined: Self = StObject.set(x, "PrimaryForeground", js.undefined)
    
    @scala.inline
    def setSecondaryBackground(value: HexColor): Self = StObject.set(x, "SecondaryBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryBackgroundUndefined: Self = StObject.set(x, "SecondaryBackground", js.undefined)
    
    @scala.inline
    def setSecondaryForeground(value: HexColor): Self = StObject.set(x, "SecondaryForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryForegroundUndefined: Self = StObject.set(x, "SecondaryForeground", js.undefined)
    
    @scala.inline
    def setSuccess(value: HexColor): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessForeground(value: HexColor): Self = StObject.set(x, "SuccessForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessForegroundUndefined: Self = StObject.set(x, "SuccessForeground", js.undefined)
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
    
    @scala.inline
    def setWarning(value: HexColor): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningForeground(value: HexColor): Self = StObject.set(x, "WarningForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningForegroundUndefined: Self = StObject.set(x, "WarningForeground", js.undefined)
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
