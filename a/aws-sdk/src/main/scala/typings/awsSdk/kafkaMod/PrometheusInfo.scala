package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrometheusInfo extends StObject {
  
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
  implicit class PrometheusInfoMutableBuilder[Self <: PrometheusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJmxExporter(value: JmxExporterInfo): Self = StObject.set(x, "JmxExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJmxExporterUndefined: Self = StObject.set(x, "JmxExporter", js.undefined)
    
    @scala.inline
    def setNodeExporter(value: NodeExporterInfo): Self = StObject.set(x, "NodeExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeExporterUndefined: Self = StObject.set(x, "NodeExporter", js.undefined)
  }
}
