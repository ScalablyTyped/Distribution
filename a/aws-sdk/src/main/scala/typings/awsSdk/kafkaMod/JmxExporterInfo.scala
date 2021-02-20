package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JmxExporterInfo extends StObject {
  
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var EnabledInBroker: boolean = js.native
}
object JmxExporterInfo {
  
  @scala.inline
  def apply(EnabledInBroker: boolean): JmxExporterInfo = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JmxExporterInfo]
  }
  
  @scala.inline
  implicit class JmxExporterInfoMutableBuilder[Self <: JmxExporterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledInBroker(value: boolean): Self = StObject.set(x, "EnabledInBroker", value.asInstanceOf[js.Any])
  }
}
