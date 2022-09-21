package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prometheus extends StObject {
  
  /**
    * 
    Indicates whether you want to turn on or turn off the JMX Exporter.
    
    */
  var JmxExporter: js.UndefOr[typings.awsSdk.kafkaMod.JmxExporter] = js.undefined
  
  /**
    * 
    Indicates whether you want to turn on or turn off the Node Exporter.
    
    */
  var NodeExporter: js.UndefOr[typings.awsSdk.kafkaMod.NodeExporter] = js.undefined
}
object Prometheus {
  
  inline def apply(): Prometheus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prometheus]
  }
  
  extension [Self <: Prometheus](x: Self) {
    
    inline def setJmxExporter(value: JmxExporter): Self = StObject.set(x, "JmxExporter", value.asInstanceOf[js.Any])
    
    inline def setJmxExporterUndefined: Self = StObject.set(x, "JmxExporter", js.undefined)
    
    inline def setNodeExporter(value: NodeExporter): Self = StObject.set(x, "NodeExporter", value.asInstanceOf[js.Any])
    
    inline def setNodeExporterUndefined: Self = StObject.set(x, "NodeExporter", js.undefined)
  }
}
