package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameMetric extends StObject {
  
  /**
    *  Name of the method common across the multiple occurrences of a frame in an application profile.
    */
  var frameName: String
  
  /**
    * List of application runtime thread states used to get the counts for a frame a derive a metric value.
    */
  var threadStates: ThreadStates
  
  /**
    *  A type of aggregation that specifies how a metric for a frame is analyzed. The supported value AggregatedRelativeTotalTime is an aggregation of the metric value for one frame that is calculated across the occurrences of all frames in a profile. 
    */
  var `type`: MetricType
}
object FrameMetric {
  
  @scala.inline
  def apply(frameName: String, threadStates: ThreadStates, `type`: MetricType): FrameMetric = {
    val __obj = js.Dynamic.literal(frameName = frameName.asInstanceOf[js.Any], threadStates = threadStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameMetric]
  }
  
  @scala.inline
  implicit class FrameMetricMutableBuilder[Self <: FrameMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameName(value: String): Self = StObject.set(x, "frameName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadStates(value: ThreadStates): Self = StObject.set(x, "threadStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadStatesVarargs(value: String*): Self = StObject.set(x, "threadStates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: MetricType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
