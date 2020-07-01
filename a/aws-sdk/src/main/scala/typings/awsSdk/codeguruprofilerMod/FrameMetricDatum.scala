package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameMetricDatum extends js.Object {
  var frameMetric: FrameMetric = js.native
  /**
    *  A list of values that are associated with a frame metric. 
    */
  var values: FrameMetricValues = js.native
}

object FrameMetricDatum {
  @scala.inline
  def apply(frameMetric: FrameMetric, values: FrameMetricValues): FrameMetricDatum = {
    val __obj = js.Dynamic.literal(frameMetric = frameMetric.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameMetricDatum]
  }
}

