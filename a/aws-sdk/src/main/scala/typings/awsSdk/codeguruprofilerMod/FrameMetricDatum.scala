package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameMetricDatum extends StObject {
  
  var frameMetric: FrameMetric
  
  /**
    *  A list of values that are associated with a frame metric. 
    */
  var values: FrameMetricValues
}
object FrameMetricDatum {
  
  @scala.inline
  def apply(frameMetric: FrameMetric, values: FrameMetricValues): FrameMetricDatum = {
    val __obj = js.Dynamic.literal(frameMetric = frameMetric.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameMetricDatum]
  }
  
  @scala.inline
  implicit class FrameMetricDatumMutableBuilder[Self <: FrameMetricDatum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameMetric(value: FrameMetric): Self = StObject.set(x, "frameMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FrameMetricValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
