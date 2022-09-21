package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizeText extends StObject {
  
  /**
    * Specifies a callback function that returns the text to be displayed in an indicator.
    */
  var customizeText: js.UndefOr[js.Function1[/* indicatedValue */ ValueText, String]] = js.undefined
  
  /**
    * Specifies font properties for the text displayed by the indicator.
    */
  var font: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Formats a value before it is displayed in an indicator. Accepts only numeric formats.
    */
  var format: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format] = js.undefined
  
  /**
    * Specifies the range bar&apos;s label indent in pixels.
    */
  var indent: js.UndefOr[Double] = js.undefined
}
object CustomizeText {
  
  inline def apply(): CustomizeText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeText]
  }
  
  extension [Self <: CustomizeText](x: Self) {
    
    inline def setCustomizeText(value: /* indicatedValue */ ValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
  }
}
