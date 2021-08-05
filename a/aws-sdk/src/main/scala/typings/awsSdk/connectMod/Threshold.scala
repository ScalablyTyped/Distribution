package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Threshold extends StObject {
  
  /**
    * The type of comparison. Only "less than" (LT) comparisons are supported.
    */
  var Comparison: js.UndefOr[typings.awsSdk.connectMod.Comparison] = js.undefined
  
  /**
    * The threshold value to compare.
    */
  var ThresholdValue: js.UndefOr[typings.awsSdk.connectMod.ThresholdValue] = js.undefined
}
object Threshold {
  
  inline def apply(): Threshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Threshold]
  }
  
  extension [Self <: Threshold](x: Self) {
    
    inline def setComparison(value: Comparison): Self = StObject.set(x, "Comparison", value.asInstanceOf[js.Any])
    
    inline def setComparisonUndefined: Self = StObject.set(x, "Comparison", js.undefined)
    
    inline def setThresholdValue(value: ThresholdValue): Self = StObject.set(x, "ThresholdValue", value.asInstanceOf[js.Any])
    
    inline def setThresholdValueUndefined: Self = StObject.set(x, "ThresholdValue", js.undefined)
  }
}
