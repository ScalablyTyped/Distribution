package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.columns
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inside
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.outside
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.VizTextOverflowType
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.WordWrapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connector extends StObject {
  
  /**
    * Colors the labels&apos; background. The default color is inherited from the funnel items.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the label borders.
    */
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  /**
    * Configures label connectors.
    */
  var connector: js.UndefOr[ColorOpacity] = js.undefined
  
  /**
    * Customizes labels&apos; text.
    */
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Percent, String]] = js.undefined
  
  /**
    * Specifies labels&apos; font properties.
    */
  var font: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Formats the item value before displaying it in the label.
    */
  var format: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format] = js.undefined
  
  /**
    * Specifies labels&apos; position in relation to the funnel items.
    */
  var horizontalAlignment: js.UndefOr[left | right] = js.undefined
  
  /**
    * Moves labels from their initial positions.
    */
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to display labels inside or outside funnel items or arrange them in columns.
    */
  var position: js.UndefOr[columns | inside | outside] = js.undefined
  
  /**
    * Specifies whether to show labels for items with zero value.
    */
  var showForZeroValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies what to do with label texts that overflow the allocated space after applying wordWrap: hide, truncate them and display an ellipsis, or do nothing.
    */
  var textOverflow: js.UndefOr[VizTextOverflowType] = js.undefined
  
  /**
    * Controls the labels&apos; visibility.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how to wrap label texts if they do not fit into a single line.
    */
  var wordWrap: js.UndefOr[WordWrapType] = js.undefined
}
object Connector {
  
  inline def apply(): Connector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connector]
  }
  
  extension [Self <: Connector](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setConnector(value: ColorOpacity): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setCustomizeText(value: /* itemInfo */ Percent => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHorizontalAlignment(value: left | right): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
    
    inline def setPosition(value: columns | inside | outside): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowForZeroValues(value: Boolean): Self = StObject.set(x, "showForZeroValues", value.asInstanceOf[js.Any])
    
    inline def setShowForZeroValuesUndefined: Self = StObject.set(x, "showForZeroValues", js.undefined)
    
    inline def setTextOverflow(value: VizTextOverflowType): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWordWrap(value: WordWrapType): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
