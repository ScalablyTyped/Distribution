package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricKeyDataPoints extends StObject {
  
  /**
    * An array of timestamp-value pairs, representing measurements over a period of time.
    */
  var DataPoints: js.UndefOr[DataPointsList] = js.undefined
  
  /**
    * The dimension(s) to which the data points apply.
    */
  var Key: js.UndefOr[ResponseResourceMetricKey] = js.undefined
}
object MetricKeyDataPoints {
  
  @scala.inline
  def apply(): MetricKeyDataPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricKeyDataPoints]
  }
  
  @scala.inline
  implicit class MetricKeyDataPointsMutableBuilder[Self <: MetricKeyDataPoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataPoints(value: DataPointsList): Self = StObject.set(x, "DataPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPointsUndefined: Self = StObject.set(x, "DataPoints", js.undefined)
    
    @scala.inline
    def setDataPointsVarargs(value: DataPoint*): Self = StObject.set(x, "DataPoints", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: ResponseResourceMetricKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
