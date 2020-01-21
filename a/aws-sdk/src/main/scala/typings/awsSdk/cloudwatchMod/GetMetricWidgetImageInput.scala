package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricWidgetImageInput extends js.Object {
  /**
    * A JSON string that defines the bitmap graph to be retrieved. The string includes the metrics to include in the graph, statistics, annotations, title, axis limits, and so on. You can include only one MetricWidget parameter in each GetMetricWidgetImage call. For more information about the syntax of MetricWidget see CloudWatch-Metric-Widget-Structure. If any metric on the graph could not load all the requested data points, an orange triangle with an exclamation point appears next to the graph legend.
    */
  var MetricWidget: typings.awsSdk.cloudwatchMod.MetricWidget = js.native
  /**
    * The format of the resulting image. Only PNG images are supported. The default is png. If you specify png, the API returns an HTTP response with the content-type set to text/xml. The image data is in a MetricWidgetImage field. For example:   &lt;GetMetricWidgetImageResponse xmlns=&lt;URLstring&gt;&gt;    &lt;GetMetricWidgetImageResult&gt;    &lt;MetricWidgetImage&gt;    iVBORw0KGgoAAAANSUhEUgAAAlgAAAGQEAYAAAAip...    &lt;/MetricWidgetImage&gt;    &lt;/GetMetricWidgetImageResult&gt;    &lt;ResponseMetadata&gt;    &lt;RequestId&gt;6f0d4192-4d42-11e8-82c1-f539a07e0e3b&lt;/RequestId&gt;    &lt;/ResponseMetadata&gt;   &lt;/GetMetricWidgetImageResponse&gt;  The image/png setting is intended only for custom HTTP requests. For most use cases, and all actions using an AWS SDK, you should use png. If you specify image/png, the HTTP response has a content-type set to image/png, and the body of the response is a PNG image. 
    */
  var OutputFormat: js.UndefOr[typings.awsSdk.cloudwatchMod.OutputFormat] = js.native
}

object GetMetricWidgetImageInput {
  @scala.inline
  def apply(MetricWidget: MetricWidget, OutputFormat: OutputFormat = null): GetMetricWidgetImageInput = {
    val __obj = js.Dynamic.literal(MetricWidget = MetricWidget.asInstanceOf[js.Any])
    if (OutputFormat != null) __obj.updateDynamic("OutputFormat")(OutputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricWidgetImageInput]
  }
}

