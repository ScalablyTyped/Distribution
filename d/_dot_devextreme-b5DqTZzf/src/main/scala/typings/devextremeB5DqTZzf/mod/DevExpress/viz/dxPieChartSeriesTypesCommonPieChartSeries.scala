package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.ArgumentFormat
import typings.devextremeB5DqTZzf.anon.BorderColor
import typings.devextremeB5DqTZzf.anon.ColorDashStyle
import typings.devextremeB5DqTZzf.anon.GroupName
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.datetime
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.numeric
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.onlyPoint
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPieChartSeriesTypesCommonPieChartSeries extends StObject {
  
  /**
    * Specifies the data source field that provides arguments for series points.
    */
  var argumentField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the required type for series arguments.
    */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.undefined
  
  /**
    * An object defining the series border configuration properties.
    */
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  /**
    * Specifies a series color.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the chart elements to highlight when a series is hovered over.
    */
  var hoverMode: js.UndefOr[none | onlyPoint] = js.undefined
  
  /**
    * An object defining configuration properties for a hovered series.
    */
  var hoverStyle: js.UndefOr[BorderColor] = js.undefined
  
  /**
    * An object defining the label configuration properties.
    */
  var label: js.UndefOr[ArgumentFormat] = js.undefined
  
  /**
    * Specifies how many points are acceptable to be in a series to display all labels for these points. Otherwise, the labels will not be displayed.
    */
  var maxLabelCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a minimal size of a displayed pie segment.
    */
  var minSegmentSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the chart elements to highlight when the series is selected.
    */
  var selectionMode: js.UndefOr[none | onlyPoint] = js.undefined
  
  /**
    * An object defining configuration properties for the series when it is selected.
    */
  var selectionStyle: js.UndefOr[BorderColor] = js.undefined
  
  /**
    * Specifies chart segment grouping properties.
    */
  var smallValuesGrouping: js.UndefOr[GroupName] = js.undefined
  
  /**
    * Specifies the name of the data source field that provides data about a point.
    */
  var tagField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the data source field that provides values for series points.
    */
  var valueField: js.UndefOr[String] = js.undefined
}
object dxPieChartSeriesTypesCommonPieChartSeries {
  
  inline def apply(): dxPieChartSeriesTypesCommonPieChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartSeriesTypesCommonPieChartSeries]
  }
  
  extension [Self <: dxPieChartSeriesTypesCommonPieChartSeries](x: Self) {
    
    inline def setArgumentField(value: String): Self = StObject.set(x, "argumentField", value.asInstanceOf[js.Any])
    
    inline def setArgumentFieldUndefined: Self = StObject.set(x, "argumentField", js.undefined)
    
    inline def setArgumentType(value: datetime | numeric | string_): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setArgumentTypeUndefined: Self = StObject.set(x, "argumentType", js.undefined)
    
    inline def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHoverMode(value: none | onlyPoint): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setHoverStyle(value: BorderColor): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setLabel(value: ArgumentFormat): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxLabelCount(value: Double): Self = StObject.set(x, "maxLabelCount", value.asInstanceOf[js.Any])
    
    inline def setMaxLabelCountUndefined: Self = StObject.set(x, "maxLabelCount", js.undefined)
    
    inline def setMinSegmentSize(value: Double): Self = StObject.set(x, "minSegmentSize", value.asInstanceOf[js.Any])
    
    inline def setMinSegmentSizeUndefined: Self = StObject.set(x, "minSegmentSize", js.undefined)
    
    inline def setSelectionMode(value: none | onlyPoint): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionStyle(value: BorderColor): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
    
    inline def setSmallValuesGrouping(value: GroupName): Self = StObject.set(x, "smallValuesGrouping", value.asInstanceOf[js.Any])
    
    inline def setSmallValuesGroupingUndefined: Self = StObject.set(x, "smallValuesGrouping", js.undefined)
    
    inline def setTagField(value: String): Self = StObject.set(x, "tagField", value.asInstanceOf[js.Any])
    
    inline def setTagFieldUndefined: Self = StObject.set(x, "tagField", js.undefined)
    
    inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
  }
}
