package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortForwardingConfig extends StObject {
  
  /**
    * The port mappings for the configuration.
    */
  var portMappings: js.UndefOr[PortMappingList] = js.undefined
}
object PortForwardingConfig {
  
  inline def apply(): PortForwardingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortForwardingConfig]
  }
  
  extension [Self <: PortForwardingConfig](x: Self) {
    
    inline def setPortMappings(value: PortMappingList): Self = StObject.set(x, "portMappings", value.asInstanceOf[js.Any])
    
    inline def setPortMappingsUndefined: Self = StObject.set(x, "portMappings", js.undefined)
    
    inline def setPortMappingsVarargs(value: PortMapping*): Self = StObject.set(x, "portMappings", js.Array(value*))
  }
}
