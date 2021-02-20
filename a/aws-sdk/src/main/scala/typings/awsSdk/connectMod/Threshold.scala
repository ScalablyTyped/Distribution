package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Threshold extends StObject {
  
  /**
    * The type of comparison. Only "less than" (LT) comparisons are supported.
    */
  var Comparison: js.UndefOr[typings.awsSdk.connectMod.Comparison] = js.native
  
  /**
    * The threshold value to compare.
    */
  var ThresholdValue: js.UndefOr[typings.awsSdk.connectMod.ThresholdValue] = js.native
}
object Threshold {
  
  @scala.inline
  def apply(): Threshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Threshold]
  }
  
  @scala.inline
  implicit class ThresholdMutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparison(value: Comparison): Self = StObject.set(x, "Comparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonUndefined: Self = StObject.set(x, "Comparison", js.undefined)
    
    @scala.inline
    def setThresholdValue(value: ThresholdValue): Self = StObject.set(x, "ThresholdValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdValueUndefined: Self = StObject.set(x, "ThresholdValue", js.undefined)
  }
}
