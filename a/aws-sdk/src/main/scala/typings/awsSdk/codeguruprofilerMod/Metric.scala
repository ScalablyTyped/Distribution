package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  /**
    *  The name of the method that appears as a frame in any stack in a profile. 
    */
  var frameName: String
  
  /**
    *  The list of application runtime thread states that is used to calculate the metric value for the frame. 
    */
  var threadStates: Strings
  
  /**
    *  A type that specifies how a metric for a frame is analyzed. The supported value AggregatedRelativeTotalTime is an aggregation of the metric value for one frame that is calculated across the occurences of all frames in a profile.
    */
  var `type`: MetricType
}
object Metric {
  
  @scala.inline
  def apply(frameName: String, threadStates: Strings, `type`: MetricType): Metric = {
    val __obj = js.Dynamic.literal(frameName = frameName.asInstanceOf[js.Any], threadStates = threadStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  
  @scala.inline
  implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameName(value: String): Self = StObject.set(x, "frameName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadStates(value: Strings): Self = StObject.set(x, "threadStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadStatesVarargs(value: String*): Self = StObject.set(x, "threadStates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: MetricType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
