package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRoutingDestinationDescription extends StObject {
  
  /**
    * The first port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing accelerator.
    */
  var FromPort: js.UndefOr[PortNumber] = js.undefined
  
  /**
    * The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can be either TCP or UDP.
    */
  var Protocols: js.UndefOr[typings.awsSdk.globalacceleratorMod.Protocols] = js.undefined
  
  /**
    * The last port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing accelerator.
    */
  var ToPort: js.UndefOr[PortNumber] = js.undefined
}
object CustomRoutingDestinationDescription {
  
  inline def apply(): CustomRoutingDestinationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRoutingDestinationDescription]
  }
  
  extension [Self <: CustomRoutingDestinationDescription](x: Self) {
    
    inline def setFromPort(value: PortNumber): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setProtocols(value: Protocols): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "Protocols", js.Array(value*))
    
    inline def setToPort(value: PortNumber): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}
