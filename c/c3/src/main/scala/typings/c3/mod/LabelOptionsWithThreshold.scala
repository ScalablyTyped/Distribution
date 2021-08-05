package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOptionsWithThreshold
  extends StObject
     with LabelOptions {
  
  var ratio: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Set threshold to show/hide labels.
    * Defaults to `0.05`.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}
object LabelOptionsWithThreshold {
  
  inline def apply(): LabelOptionsWithThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptionsWithThreshold]
  }
  
  extension [Self <: LabelOptionsWithThreshold](x: Self) {
    
    inline def setRatio(value: js.Any): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
