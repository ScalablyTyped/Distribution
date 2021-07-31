package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleInstanceEndpoint extends StObject {
  
  var address: String
  
  var port: Double
  
  var protocol: String
}
object RoleInstanceEndpoint {
  
  @scala.inline
  def apply(address: String, port: Double, protocol: String): RoleInstanceEndpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleInstanceEndpoint]
  }
  
  @scala.inline
  implicit class RoleInstanceEndpointMutableBuilder[Self <: RoleInstanceEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
