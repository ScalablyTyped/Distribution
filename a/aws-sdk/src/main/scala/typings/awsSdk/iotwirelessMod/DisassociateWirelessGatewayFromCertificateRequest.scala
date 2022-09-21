package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateWirelessGatewayFromCertificateRequest extends StObject {
  
  /**
    * The ID of the resource to update.
    */
  var Id: WirelessGatewayId
}
object DisassociateWirelessGatewayFromCertificateRequest {
  
  inline def apply(Id: WirelessGatewayId): DisassociateWirelessGatewayFromCertificateRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWirelessGatewayFromCertificateRequest]
  }
  
  extension [Self <: DisassociateWirelessGatewayFromCertificateRequest](x: Self) {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
