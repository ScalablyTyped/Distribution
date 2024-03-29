package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.first
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.last
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxCircularGaugeScaleLabel
  extends StObject
     with BaseGaugeScaleLabel {
  
  /**
    * Specifies which label to hide in case of overlapping.
    */
  var hideFirstOrLast: js.UndefOr[first | last] = js.undefined
  
  /**
    * Specifies the spacing between scale labels and ticks.
    */
  var indentFromTick: js.UndefOr[Double] = js.undefined
}
object dxCircularGaugeScaleLabel {
  
  inline def apply(): dxCircularGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeScaleLabel]
  }
  
  extension [Self <: dxCircularGaugeScaleLabel](x: Self) {
    
    inline def setHideFirstOrLast(value: first | last): Self = StObject.set(x, "hideFirstOrLast", value.asInstanceOf[js.Any])
    
    inline def setHideFirstOrLastUndefined: Self = StObject.set(x, "hideFirstOrLast", js.undefined)
    
    inline def setIndentFromTick(value: Double): Self = StObject.set(x, "indentFromTick", value.asInstanceOf[js.Any])
    
    inline def setIndentFromTickUndefined: Self = StObject.set(x, "indentFromTick", js.undefined)
  }
}
