package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDatapoint extends StObject {
  
  /**
    * The average.
    */
  var average: js.UndefOr[double] = js.native
  
  /**
    * The maximum.
    */
  var maximum: js.UndefOr[double] = js.native
  
  /**
    * The minimum.
    */
  var minimum: js.UndefOr[double] = js.native
  
  /**
    * The sample count.
    */
  var sampleCount: js.UndefOr[double] = js.native
  
  /**
    * The sum.
    */
  var sum: js.UndefOr[double] = js.native
  
  /**
    * The timestamp (e.g., 1479816991.349).
    */
  var timestamp: js.UndefOr[typings.awsSdk.lightsailMod.timestamp] = js.native
  
  /**
    * The unit. 
    */
  var unit: js.UndefOr[MetricUnit] = js.native
}
object MetricDatapoint {
  
  @scala.inline
  def apply(): MetricDatapoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDatapoint]
  }
  
  @scala.inline
  implicit class MetricDatapointMutableBuilder[Self <: MetricDatapoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverage(value: double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    @scala.inline
    def setMaximum(value: double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setSampleCount(value: double): Self = StObject.set(x, "sampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleCountUndefined: Self = StObject.set(x, "sampleCount", js.undefined)
    
    @scala.inline
    def setSum(value: double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    @scala.inline
    def setTimestamp(value: timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setUnit(value: MetricUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
