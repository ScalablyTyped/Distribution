package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputConfiguration extends StObject {
  
  /**
    * The IP address that the flow listens on for incoming content for a media stream.
    */
  var InputIp: string
  
  /**
    * The port that the flow listens on for an incoming media stream.
    */
  var InputPort: integer
  
  /**
    * The VPC interface where the media stream comes in from.
    */
  var Interface: typings.awsSdk.mediaconnectMod.Interface
}
object InputConfiguration {
  
  inline def apply(InputIp: string, InputPort: integer, Interface: Interface): InputConfiguration = {
    val __obj = js.Dynamic.literal(InputIp = InputIp.asInstanceOf[js.Any], InputPort = InputPort.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfiguration]
  }
  
  extension [Self <: InputConfiguration](x: Self) {
    
    inline def setInputIp(value: string): Self = StObject.set(x, "InputIp", value.asInstanceOf[js.Any])
    
    inline def setInputPort(value: integer): Self = StObject.set(x, "InputPort", value.asInstanceOf[js.Any])
    
    inline def setInterface(value: Interface): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
  }
}
