package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JmxExporter extends StObject {
  
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var EnabledInBroker: boolean
}
object JmxExporter {
  
  @scala.inline
  def apply(EnabledInBroker: boolean): JmxExporter = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JmxExporter]
  }
  
  @scala.inline
  implicit class JmxExporterMutableBuilder[Self <: JmxExporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledInBroker(value: boolean): Self = StObject.set(x, "EnabledInBroker", value.asInstanceOf[js.Any])
  }
}
