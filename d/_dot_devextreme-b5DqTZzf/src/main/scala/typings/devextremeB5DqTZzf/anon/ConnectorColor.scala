package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorColor extends StObject {
  
  /**
    * Specifies a color for the label connector text.
    */
  var connectorColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the width of the label connector in pixels.
    */
  var connectorWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a callback function that returns a text for labels.
    */
  var customizeText: js.UndefOr[js.Function1[/* barValue */ ValueText, String]] = js.undefined
  
  /**
    * Specifies font properties for bar labels.
    */
  var font: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Formats a value before it is displayed in a label. Accepts only numeric formats.
    */
  var format: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format] = js.undefined
  
  /**
    * Specifies the distance between the upper bar and bar labels in pixels.
    */
  var indent: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether bar labels appear on a gauge or not.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ConnectorColor {
  
  inline def apply(): ConnectorColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorColor]
  }
  
  extension [Self <: ConnectorColor](x: Self) {
    
    inline def setConnectorColor(value: String): Self = StObject.set(x, "connectorColor", value.asInstanceOf[js.Any])
    
    inline def setConnectorColorUndefined: Self = StObject.set(x, "connectorColor", js.undefined)
    
    inline def setConnectorWidth(value: Double): Self = StObject.set(x, "connectorWidth", value.asInstanceOf[js.Any])
    
    inline def setConnectorWidthUndefined: Self = StObject.set(x, "connectorWidth", js.undefined)
    
    inline def setCustomizeText(value: /* barValue */ ValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
