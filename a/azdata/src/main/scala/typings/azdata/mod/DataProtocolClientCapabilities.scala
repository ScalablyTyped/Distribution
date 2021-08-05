package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProtocolClientCapabilities extends StObject {
  
  var hostName: String
  
  var hostVersion: String
}
object DataProtocolClientCapabilities {
  
  inline def apply(hostName: String, hostVersion: String): DataProtocolClientCapabilities = {
    val __obj = js.Dynamic.literal(hostName = hostName.asInstanceOf[js.Any], hostVersion = hostVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProtocolClientCapabilities]
  }
  
  extension [Self <: DataProtocolClientCapabilities](x: Self) {
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setHostVersion(value: String): Self = StObject.set(x, "hostVersion", value.asInstanceOf[js.Any])
  }
}
