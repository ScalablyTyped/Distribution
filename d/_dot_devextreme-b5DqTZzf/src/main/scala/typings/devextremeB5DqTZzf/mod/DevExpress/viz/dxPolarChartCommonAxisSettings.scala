package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.ColorOpacity
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.betweenLabels
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.crossLabels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonAxisSettings extends StObject {
  
  /**
    * Specifies whether to allow decimal values on the axis. When false, the axis contains integer values only.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the color of the line that represents an axis.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the appearance of all the UI component&apos;s constant lines.
    */
  var constantLineStyle: js.UndefOr[dxPolarChartCommonAxisSettingsConstantLineStyle] = js.undefined
  
  /**
    * Specifies whether ticks/grid lines of a discrete axis are located between labels or cross the labels.
    */
  var discreteAxisDivisionMode: js.UndefOr[betweenLabels | crossLabels] = js.undefined
  
  /**
    * Specifies whether to force the axis to start and end on ticks.
    */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object defining the configuration properties for the grid lines of an axis in the PolarChart UI component.
    */
  var grid: js.UndefOr[ColorOpacity] = js.undefined
  
  /**
    * Indicates whether or not an axis is inverted.
    */
  var inverted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object defining the label configuration properties that are common for all axes in the PolarChart UI component.
    */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsLabel] = js.undefined
  
  /**
    * Specifies the properties of the minor grid.
    */
  var minorGrid: js.UndefOr[ColorOpacity] = js.undefined
  
  /**
    * Specifies the properties of the minor ticks.
    */
  var minorTick: js.UndefOr[dxPolarChartCommonAxisSettingsMinorTick] = js.undefined
  
  /**
    * Specifies the opacity of the line that represents an axis.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * An object defining configuration properties for strip style.
    */
  var stripStyle: js.UndefOr[dxPolarChartCommonAxisSettingsStripStyle] = js.undefined
  
  /**
    * An object defining the configuration properties for axis ticks.
    */
  var tick: js.UndefOr[dxPolarChartCommonAxisSettingsTick] = js.undefined
  
  /**
    * Indicates whether or not the line that represents an axis in a chart is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of the line that represents an axis in the chart.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxPolarChartCommonAxisSettings {
  
  inline def apply(): dxPolarChartCommonAxisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettings]
  }
  
  extension [Self <: dxPolarChartCommonAxisSettings](x: Self) {
    
    inline def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    inline def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setConstantLineStyle(value: dxPolarChartCommonAxisSettingsConstantLineStyle): Self = StObject.set(x, "constantLineStyle", value.asInstanceOf[js.Any])
    
    inline def setConstantLineStyleUndefined: Self = StObject.set(x, "constantLineStyle", js.undefined)
    
    inline def setDiscreteAxisDivisionMode(value: betweenLabels | crossLabels): Self = StObject.set(x, "discreteAxisDivisionMode", value.asInstanceOf[js.Any])
    
    inline def setDiscreteAxisDivisionModeUndefined: Self = StObject.set(x, "discreteAxisDivisionMode", js.undefined)
    
    inline def setEndOnTick(value: Boolean): Self = StObject.set(x, "endOnTick", value.asInstanceOf[js.Any])
    
    inline def setEndOnTickUndefined: Self = StObject.set(x, "endOnTick", js.undefined)
    
    inline def setGrid(value: ColorOpacity): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setLabel(value: dxPolarChartCommonAxisSettingsLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMinorGrid(value: ColorOpacity): Self = StObject.set(x, "minorGrid", value.asInstanceOf[js.Any])
    
    inline def setMinorGridUndefined: Self = StObject.set(x, "minorGrid", js.undefined)
    
    inline def setMinorTick(value: dxPolarChartCommonAxisSettingsMinorTick): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    inline def setMinorTickUndefined: Self = StObject.set(x, "minorTick", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStripStyle(value: dxPolarChartCommonAxisSettingsStripStyle): Self = StObject.set(x, "stripStyle", value.asInstanceOf[js.Any])
    
    inline def setStripStyleUndefined: Self = StObject.set(x, "stripStyle", js.undefined)
    
    inline def setTick(value: dxPolarChartCommonAxisSettingsTick): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
