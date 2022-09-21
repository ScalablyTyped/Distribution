package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExasolParameters extends StObject {
  
  /**
    * The hostname or IP address of the Exasol data source.
    */
  var Host: typings.awsSdk.quicksightMod.Host
  
  /**
    * The port for the Exasol data source.
    */
  var Port: typings.awsSdk.quicksightMod.Port
}
object ExasolParameters {
  
  inline def apply(Host: Host, Port: Port): ExasolParameters = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExasolParameters]
  }
  
  extension [Self <: ExasolParameters](x: Self) {
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
