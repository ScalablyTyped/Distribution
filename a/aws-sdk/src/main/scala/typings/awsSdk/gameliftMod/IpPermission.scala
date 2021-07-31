package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpPermission extends StObject {
  
  /**
    * A starting value for a range of allowed port numbers.
    */
  var FromPort: PortNumber
  
  /**
    * A range of allowed IP addresses. This value must be expressed in CIDR notation. Example: "000.000.000.000/[subnet mask]" or optionally the shortened version "0.0.0.0/[subnet mask]".
    */
  var IpRange: NonBlankString
  
  /**
    * The network communication protocol used by the fleet.
    */
  var Protocol: IpProtocol
  
  /**
    * An ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
    */
  var ToPort: PortNumber
}
object IpPermission {
  
  @scala.inline
  def apply(FromPort: PortNumber, IpRange: NonBlankString, Protocol: IpProtocol, ToPort: PortNumber): IpPermission = {
    val __obj = js.Dynamic.literal(FromPort = FromPort.asInstanceOf[js.Any], IpRange = IpRange.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], ToPort = ToPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpPermission]
  }
  
  @scala.inline
  implicit class IpPermissionMutableBuilder[Self <: IpPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromPort(value: PortNumber): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRange(value: NonBlankString): Self = StObject.set(x, "IpRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: IpProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPort(value: PortNumber): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
  }
}
