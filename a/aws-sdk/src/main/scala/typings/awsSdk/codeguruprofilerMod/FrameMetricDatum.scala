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
  @scala.inline
  implicit class FrameMetricDatumOps[Self <: FrameMetricDatum] (val x: Self) extends AnyVal {
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
    def setFrameMetric(value: FrameMetric): Self = this.set("frameMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: FrameMetricValues): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

