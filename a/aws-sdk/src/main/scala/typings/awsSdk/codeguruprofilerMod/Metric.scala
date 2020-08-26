package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metric extends js.Object {
  /**
    *  The name of the method that appears as a frame in any stack in a profile. 
    */
  var frameName: String = js.native
  /**
    *  The list of application runtime thread states that is used to calculate the metric value for the frame. 
    */
  var threadStates: Strings = js.native
  /**
    *  A type that specifies how a metric for a frame is analyzed. The supported value AggregatedRelativeTotalTime is an aggregation of the metric value for one frame that is calculated across the occurences of all frames in a profile.
    */
  var `type`: MetricType = js.native
}

object Metric {
  @scala.inline
  def apply(frameName: String, threadStates: Strings, `type`: MetricType): Metric = {
    val __obj = js.Dynamic.literal(frameName = frameName.asInstanceOf[js.Any], threadStates = threadStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
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
    def setThreadStates(value: Strings): Self = this.set("threadStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MetricType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

