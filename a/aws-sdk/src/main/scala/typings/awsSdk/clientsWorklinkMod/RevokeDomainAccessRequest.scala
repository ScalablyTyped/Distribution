package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeDomainAccessRequest extends StObject {
  
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsSdk.clientsWorklinkMod.DomainName
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
}
object RevokeDomainAccessRequest {
  
  inline def apply(DomainName: DomainName, FleetArn: FleetArn): RevokeDomainAccessRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeDomainAccessRequest]
  }
  
  extension [Self <: RevokeDomainAccessRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
