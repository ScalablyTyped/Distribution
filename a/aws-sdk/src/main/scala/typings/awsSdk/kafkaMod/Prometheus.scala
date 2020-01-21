package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prometheus extends js.Object {
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var JmxExporter: js.UndefOr[typings.awsSdk.kafkaMod.JmxExporter] = js.native
  /**
    * 
    Indicates whether you want to enable or disable the Node Exporter.
    
    */
  var NodeExporter: js.UndefOr[typings.awsSdk.kafkaMod.NodeExporter] = js.native
}

object Prometheus {
  @scala.inline
  def apply(JmxExporter: JmxExporter = null, NodeExporter: NodeExporter = null): Prometheus = {
    val __obj = js.Dynamic.literal()
    if (JmxExporter != null) __obj.updateDynamic("JmxExporter")(JmxExporter.asInstanceOf[js.Any])
    if (NodeExporter != null) __obj.updateDynamic("NodeExporter")(NodeExporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prometheus]
  }
}

