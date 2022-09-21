package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartArgumentAxisConstantLineStyleLabel
  extends StObject
     with dxChartCommonAxisSettingsConstantLineStyleLabel {
  
  /**
    * Aligns constant line labels in the horizontal direction.
    */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * Aligns constant line labels in the vertical direction.
    */
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.undefined
}
object dxChartArgumentAxisConstantLineStyleLabel {
  
  inline def apply(): dxChartArgumentAxisConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxisConstantLineStyleLabel]
  }
  
  extension [Self <: dxChartArgumentAxisConstantLineStyleLabel](x: Self) {
    
    inline def setHorizontalAlignment(value: center | left | right): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setVerticalAlignment(value: bottom | center | top): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
