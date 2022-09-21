package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.ColorDashStyle
import typings.devextremeB5DqTZzf.anon.ColorVisible
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inside
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.outside
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCommonSeriesLabel extends StObject {
  
  /**
    * Aligns point labels in relation to their points.
    */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * Formats the point argument before it is displayed in the point label. To format the point value, use the format property.
    */
  var argumentFormat: js.UndefOr[Format] = js.undefined
  
  /**
    * Colors the point labels&apos; background. The default color is inherited from the points.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the borders of point labels.
    */
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  /**
    * Configures the label connectors.
    */
  var connector: js.UndefOr[ColorVisible] = js.undefined
  
  /**
    * Customizes the text displayed by point labels.
    */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ Any, String]] = js.undefined
  
  /**
    * Specifies font properties for point labels.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Formats the point value before it is displayed in the point label.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Along with verticalOffset, shifts point labels from their initial positions.
    */
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to display point labels inside or outside of series points. Applies only to bubble, range-like and bar-like series.
    */
  var position: js.UndefOr[inside | outside] = js.undefined
  
  /**
    * Rotates point labels.
    */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether or not to show labels for points with zero value. Applies only to bar-like series.
    */
  var showForZeroValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Along with horizontalOffset, shifts point labels from their initial positions.
    */
  var verticalOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Makes the point labels visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object dxChartSeriesTypesCommonSeriesLabel {
  
  inline def apply(): dxChartSeriesTypesCommonSeriesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesLabel]
  }
  
  extension [Self <: dxChartSeriesTypesCommonSeriesLabel](x: Self) {
    
    inline def setAlignment(value: center | left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setArgumentFormat(value: Format): Self = StObject.set(x, "argumentFormat", value.asInstanceOf[js.Any])
    
    inline def setArgumentFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "argumentFormat", js.Any.fromFunction1(value))
    
    inline def setArgumentFormatUndefined: Self = StObject.set(x, "argumentFormat", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setConnector(value: ColorVisible): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setCustomizeText(value: /* pointInfo */ Any => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
    
    inline def setPosition(value: inside | outside): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    inline def setShowForZeroValues(value: Boolean): Self = StObject.set(x, "showForZeroValues", value.asInstanceOf[js.Any])
    
    inline def setShowForZeroValuesUndefined: Self = StObject.set(x, "showForZeroValues", js.undefined)
    
    inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
