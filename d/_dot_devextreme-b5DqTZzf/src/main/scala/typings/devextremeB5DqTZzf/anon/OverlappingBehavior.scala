package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hide
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlappingBehavior extends StObject {
  
  /**
    * Specifies a callback function that returns the text to be displayed in scale labels.
    */
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueValueText, String]] = js.undefined
  
  /**
    * Specifies font properties for the text displayed in the range selector&apos;s scale labels.
    */
  var font: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Formats a value before it is displayed in a scale label.
    */
  var format: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format] = js.undefined
  
  /**
    * Decides how to arrange scale labels when there is not enough space to keep all of them.
    */
  var overlappingBehavior: js.UndefOr[hide | none] = js.undefined
  
  /**
    * Specifies a spacing between scale labels and the background bottom edge.
    */
  var topIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether or not the scale&apos;s labels are visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object OverlappingBehavior {
  
  inline def apply(): OverlappingBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlappingBehavior]
  }
  
  extension [Self <: OverlappingBehavior](x: Self) {
    
    inline def setCustomizeText(value: /* scaleValue */ ValueValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setOverlappingBehavior(value: hide | none): Self = StObject.set(x, "overlappingBehavior", value.asInstanceOf[js.Any])
    
    inline def setOverlappingBehaviorUndefined: Self = StObject.set(x, "overlappingBehavior", js.undefined)
    
    inline def setTopIndent(value: Double): Self = StObject.set(x, "topIndent", value.asInstanceOf[js.Any])
    
    inline def setTopIndentUndefined: Self = StObject.set(x, "topIndent", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
