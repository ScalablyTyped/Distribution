package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanInterface extends StObject {
  
  /**
    * The unique name of the interface.
    */
  var name: CanInterfaceName
  
  /**
    * The name of the communication protocol for the interface.
    */
  var protocolName: js.UndefOr[ProtocolName] = js.undefined
  
  /**
    * The version of the communication protocol for the interface.
    */
  var protocolVersion: js.UndefOr[ProtocolVersion] = js.undefined
}
object CanInterface {
  
  inline def apply(name: CanInterfaceName): CanInterface = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanInterface]
  }
  
  extension [Self <: CanInterface](x: Self) {
    
    inline def setName(value: CanInterfaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtocolName(value: ProtocolName): Self = StObject.set(x, "protocolName", value.asInstanceOf[js.Any])
    
    inline def setProtocolNameUndefined: Self = StObject.set(x, "protocolName", js.undefined)
    
    inline def setProtocolVersion(value: ProtocolVersion): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
  }
}
