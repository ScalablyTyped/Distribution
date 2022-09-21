package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLinearGaugeScaleLabel
  extends StObject
     with BaseGaugeScaleLabel {
  
  /**
    * Specifies the spacing between scale labels and ticks.
    */
  var indentFromTick: js.UndefOr[Double] = js.undefined
}
object dxLinearGaugeScaleLabel {
  
  inline def apply(): dxLinearGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeScaleLabel]
  }
  
  extension [Self <: dxLinearGaugeScaleLabel](x: Self) {
    
    inline def setIndentFromTick(value: Double): Self = StObject.set(x, "indentFromTick", value.asInstanceOf[js.Any])
    
    inline def setIndentFromTickUndefined: Self = StObject.set(x, "indentFromTick", js.undefined)
  }
}
