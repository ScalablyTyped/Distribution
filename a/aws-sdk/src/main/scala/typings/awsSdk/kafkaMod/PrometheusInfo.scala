package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): PrometheusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrometheusInfo]
  }
  
  @scala.inline
  implicit class PrometheusInfoOps[Self <: PrometheusInfo] (val x: Self) extends AnyVal {
    
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
    def setJmxExporter(value: JmxExporterInfo): Self = this.set("JmxExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJmxExporter: Self = this.set("JmxExporter", js.undefined)
    
    @scala.inline
    def setNodeExporter(value: NodeExporterInfo): Self = this.set("NodeExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeExporter: Self = this.set("NodeExporter", js.undefined)
  }
}
