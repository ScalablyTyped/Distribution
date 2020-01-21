package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrometheusInfo extends js.Object {
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var JmxExporter: js.UndefOr[JmxExporterInfo] = js.native
  /**
    * 
    Indicates whether you want to enable or disable the Node Exporter.
    
    */
  var NodeExporter: js.UndefOr[NodeExporterInfo] = js.native
}

object PrometheusInfo {
  @scala.inline
  def apply(JmxExporter: JmxExporterInfo = null, NodeExporter: NodeExporterInfo = null): PrometheusInfo = {
    val __obj = js.Dynamic.literal()
    if (JmxExporter != null) __obj.updateDynamic("JmxExporter")(JmxExporter.asInstanceOf[js.Any])
    if (NodeExporter != null) __obj.updateDynamic("NodeExporter")(NodeExporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrometheusInfo]
  }
}

