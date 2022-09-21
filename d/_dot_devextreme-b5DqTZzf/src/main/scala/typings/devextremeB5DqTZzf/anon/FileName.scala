package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.GIF
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.JPEG
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.PDF
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.PNG
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.SVG
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileName extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[GIF | JPEG | PDF | PNG | SVG] = js.undefined
  
  var gridLayout: js.UndefOr[Boolean] = js.undefined
  
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var onExported: js.UndefOr[js.Function] = js.undefined
  
  var onExporting: js.UndefOr[js.Function] = js.undefined
  
  var onFileSaving: js.UndefOr[js.Function] = js.undefined
  
  var proxyUrl: js.UndefOr[String] = js.undefined
  
  var svgToCanvas: js.UndefOr[js.Function] = js.undefined
  
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.undefined
}
object FileName {
  
  inline def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  
  extension [Self <: FileName](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFormat(value: GIF | JPEG | PDF | PNG | SVG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGridLayout(value: Boolean): Self = StObject.set(x, "gridLayout", value.asInstanceOf[js.Any])
    
    inline def setGridLayoutUndefined: Self = StObject.set(x, "gridLayout", js.undefined)
    
    inline def setHorizontalAlignment(value: center | left | right): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOnExported(value: js.Function): Self = StObject.set(x, "onExported", value.asInstanceOf[js.Any])
    
    inline def setOnExportedUndefined: Self = StObject.set(x, "onExported", js.undefined)
    
    inline def setOnExporting(value: js.Function): Self = StObject.set(x, "onExporting", value.asInstanceOf[js.Any])
    
    inline def setOnExportingUndefined: Self = StObject.set(x, "onExporting", js.undefined)
    
    inline def setOnFileSaving(value: js.Function): Self = StObject.set(x, "onFileSaving", value.asInstanceOf[js.Any])
    
    inline def setOnFileSavingUndefined: Self = StObject.set(x, "onFileSaving", js.undefined)
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    inline def setSvgToCanvas(value: js.Function): Self = StObject.set(x, "svgToCanvas", value.asInstanceOf[js.Any])
    
    inline def setSvgToCanvasUndefined: Self = StObject.set(x, "svgToCanvas", js.undefined)
    
    inline def setVerticalAlignment(value: bottom | center | top): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
