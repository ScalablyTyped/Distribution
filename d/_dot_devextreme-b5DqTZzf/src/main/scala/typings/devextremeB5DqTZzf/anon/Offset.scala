package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.VizTextOverflowType
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.WordWrapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  /**
    * Specifies font properties for the subtitle.
    */
  var font: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Specifies the distance between the title and subtitle in pixels.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies text for the subtitle.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies what to do with the subtitle when it overflows the allocated space after applying wordWrap: hide, truncate it and display an ellipsis, or do nothing.
    */
  var textOverflow: js.UndefOr[VizTextOverflowType] = js.undefined
  
  /**
    * Specifies how to wrap the subtitle if it does not fit into a single line.
    */
  var wordWrap: js.UndefOr[WordWrapType] = js.undefined
}
object Offset {
  
  inline def apply(): Offset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setFont(value: typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextOverflow(value: VizTextOverflowType): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setWordWrap(value: WordWrapType): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
