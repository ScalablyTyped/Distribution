package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameMetric extends js.Object {
  /**
    *  Name of the method common across the multiple occurrences of a frame in an application profile.
    */
  var frameName: String = js.native
  /**
    * List of application runtime thread states used to get the counts for a frame a derive a metric value.
    */
  var threadStates: ThreadStates = js.native
  /**
    *  A type of aggregation that specifies how a metric for a frame is analyzed. The supported value AggregatedRelativeTotalTime is an aggregation of the metric value for one frame that is calculated across the occurrences of all frames in a profile. 
    */
  var `type`: MetricType = js.native
}

object FrameMetric {
  @scala.inline
  def apply(frameName: String, threadStates: ThreadStates, `type`: MetricType): FrameMetric = {
    val __obj = js.Dynamic.literal(frameName = frameName.asInstanceOf[js.Any], threadStates = threadStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameMetric]
  }
}

