package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.VizTextOverflowType
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.WordWrapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartCommonAxisSettingsTitle extends StObject {
  
  /**
    * Aligns the axis title to the left, center, or right of the axis.
    */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * Specifies font properties for the axis title.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Adds a pixel-measured empty space between the axis title and axis labels.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies what to do with the axis title when it overflows the allocated space after applying wordWrap: hide, truncate them and display an ellipsis, or do nothing.
    */
  var textOverflow: js.UndefOr[VizTextOverflowType] = js.undefined
  
  /**
    * Specifies how to wrap the axis title if it does not fit into a single line.
    */
  var wordWrap: js.UndefOr[WordWrapType] = js.undefined
}
object dxChartCommonAxisSettingsTitle {
  
  inline def apply(): dxChartCommonAxisSettingsTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsTitle]
  }
  
  extension [Self <: dxChartCommonAxisSettingsTitle](x: Self) {
    
    inline def setAlignment(value: center | left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setTextOverflow(value: VizTextOverflowType): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setWordWrap(value: WordWrapType): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
