package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.Border
import typings.devextremeB5DqTZzf.anon.ColorVisible
import typings.devextremeB5DqTZzf.anon.HeightUrl
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.allArgumentPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.allSeriesPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.circle
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.cross
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.onlyPoint
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.polygon
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.square
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangleDown
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangleUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCommonSeriesPoint extends StObject {
  
  /**
    * Configures the appearance of the series point border in scatter, line- and area-like series.
    */
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  /**
    * Colors the series points.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user pauses on a series point.
    */
  var hoverMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.undefined
  
  /**
    * Configures the appearance adopted by a series point when a user pauses on it.
    */
  var hoverStyle: js.UndefOr[Border] = js.undefined
  
  /**
    * Substitutes the standard point symbols with an image.
    */
  var image: js.UndefOr[String | HeightUrl] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a series point.
    */
  var selectionMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.undefined
  
  /**
    * Configures the appearance of a selected series point.
    */
  var selectionStyle: js.UndefOr[Border] = js.undefined
  
  /**
    * Specifies the diameter of series points in pixels.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies which symbol should represent series points in scatter, line- and area-like series.
    */
  var symbol: js.UndefOr[circle | cross | polygon | square | triangleDown | triangleUp] = js.undefined
  
  /**
    * Makes the series points visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object dxChartSeriesTypesCommonSeriesPoint {
  
  inline def apply(): dxChartSeriesTypesCommonSeriesPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesPoint]
  }
  
  extension [Self <: dxChartSeriesTypesCommonSeriesPoint](x: Self) {
    
    inline def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHoverMode(value: allArgumentPoints | allSeriesPoints | none | onlyPoint): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setHoverStyle(value: Border): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setImage(value: String | HeightUrl): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSelectionMode(value: allArgumentPoints | allSeriesPoints | none | onlyPoint): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionStyle(value: Border): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSymbol(value: circle | cross | polygon | square | triangleDown | triangleUp): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
