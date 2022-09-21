package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeExporterInfo extends StObject {
  
  /**
    * 
    Indicates whether you want to turn on or turn off the Node Exporter.
    
    */
  var EnabledInBroker: boolean
}
object NodeExporterInfo {
  
  inline def apply(EnabledInBroker: boolean): NodeExporterInfo = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeExporterInfo]
  }
  
  extension [Self <: NodeExporterInfo](x: Self) {
    
    inline def setEnabledInBroker(value: boolean): Self = StObject.set(x, "EnabledInBroker", value.asInstanceOf[js.Any])
  }
}
