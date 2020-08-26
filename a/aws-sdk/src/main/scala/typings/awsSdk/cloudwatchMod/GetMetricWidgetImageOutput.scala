package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricWidgetImageOutput extends js.Object {
  /**
    * The image of the graph, in the output format specified. The output is base64-encoded.
    */
  var MetricWidgetImage: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricWidgetImage] = js.native
}

object GetMetricWidgetImageOutput {
  @scala.inline
  def apply(): GetMetricWidgetImageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricWidgetImageOutput]
  }
  @scala.inline
  implicit class GetMetricWidgetImageOutputOps[Self <: GetMetricWidgetImageOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetricWidgetImage(value: MetricWidgetImage): Self = this.set("MetricWidgetImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricWidgetImage: Self = this.set("MetricWidgetImage", js.undefined)
  }
  
}

