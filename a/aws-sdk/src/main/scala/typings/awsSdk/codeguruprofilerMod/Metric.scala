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
}

