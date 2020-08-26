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
  @scala.inline
  implicit class FrameMetricOps[Self <: FrameMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrameName(value: String): Self = this.set("frameName", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreadStatesVarargs(value: String*): Self = this.set("threadStates", js.Array(value :_*))
    @scala.inline
    def setThreadStates(value: ThreadStates): Self = this.set("threadStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MetricType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

