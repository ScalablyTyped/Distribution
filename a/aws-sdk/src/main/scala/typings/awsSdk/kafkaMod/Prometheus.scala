package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): Prometheus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prometheus]
  }
  
  @scala.inline
  implicit class PrometheusOps[Self <: Prometheus] (val x: Self) extends AnyVal {
    
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
    def setJmxExporter(value: JmxExporter): Self = this.set("JmxExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJmxExporter: Self = this.set("JmxExporter", js.undefined)
    
    @scala.inline
    def setNodeExporter(value: NodeExporter): Self = this.set("NodeExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeExporter: Self = this.set("NodeExporter", js.undefined)
  }
}
