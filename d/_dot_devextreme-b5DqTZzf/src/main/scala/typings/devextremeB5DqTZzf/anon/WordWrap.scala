package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.VizTextOverflowType
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.WordWrapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordWrap extends StObject {
  
  /**
    * Specifies the font settings of the tile labels.
    */
  var font: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Specifies what to do with labels that overflow their tiles after applying wordWrap: hide, truncate them and display an ellipsis, or do nothing.
    */
  var textOverflow: js.UndefOr[VizTextOverflowType] = js.undefined
  
  /**
    * Changes the visibility of the tile labels.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how to wrap texts that do not fit into a single line.
    */
  var wordWrap: js.UndefOr[WordWrapType] = js.undefined
}
object WordWrap {
  
  inline def apply(): WordWrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordWrap]
  }
  
  extension [Self <: WordWrap](x: Self) {
    
    inline def setFont(value: typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setTextOverflow(value: VizTextOverflowType): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWordWrap(value: WordWrapType): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
