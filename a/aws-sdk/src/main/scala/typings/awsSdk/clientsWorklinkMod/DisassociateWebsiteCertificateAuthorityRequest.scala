package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateWebsiteCertificateAuthorityRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
  
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: Id
}
object DisassociateWebsiteCertificateAuthorityRequest {
  
  inline def apply(FleetArn: FleetArn, WebsiteCaId: Id): DisassociateWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], WebsiteCaId = WebsiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWebsiteCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateWebsiteCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setWebsiteCaId(value: Id): Self = StObject.set(x, "WebsiteCaId", value.asInstanceOf[js.Any])
  }
}
