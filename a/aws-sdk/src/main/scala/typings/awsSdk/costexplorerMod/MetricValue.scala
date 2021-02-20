package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricValue extends StObject {
  
  /**
    * The actual number that represents the metric.
    */
  var Amount: js.UndefOr[MetricAmount] = js.native
  
  /**
    * The unit that the metric is given in.
    */
  var Unit: js.UndefOr[MetricUnit] = js.native
}
object MetricValue {
  
  @scala.inline
  def apply(): MetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValue]
  }
  
  @scala.inline
  implicit class MetricValueMutableBuilder[Self <: MetricValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: MetricAmount): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    @scala.inline
    def setUnit(value: MetricUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
