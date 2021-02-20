package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptionsWithThreshold extends LabelOptions {
  
  var ratio: js.UndefOr[js.Any] = js.native
  
  /**
    * Set threshold to show/hide labels.
    * Defaults to `0.05`.
    */
  var threshold: js.UndefOr[Double] = js.native
}
object LabelOptionsWithThreshold {
  
  @scala.inline
  def apply(): LabelOptionsWithThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptionsWithThreshold]
  }
  
  @scala.inline
  implicit class LabelOptionsWithThresholdMutableBuilder[Self <: LabelOptionsWithThreshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRatio(value: js.Any): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
