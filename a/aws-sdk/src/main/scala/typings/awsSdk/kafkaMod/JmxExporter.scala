package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JmxExporter extends StObject {
  
  /**
    * 
    Indicates whether you want to turn on or turn off the JMX Exporter.
    
    */
  var EnabledInBroker: boolean
}
object JmxExporter {
  
  inline def apply(EnabledInBroker: boolean): JmxExporter = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JmxExporter]
  }
  
  extension [Self <: JmxExporter](x: Self) {
    
    inline def setEnabledInBroker(value: boolean): Self = StObject.set(x, "EnabledInBroker", value.asInstanceOf[js.Any])
  }
}
