package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWebsiteCertificateAuthorityRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
  
  /**
    * A unique identifier for the certificate authority.
    */
  var WebsiteCaId: Id
}
object DescribeWebsiteCertificateAuthorityRequest {
  
  inline def apply(FleetArn: FleetArn, WebsiteCaId: Id): DescribeWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], WebsiteCaId = WebsiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityRequest]
  }
  
  extension [Self <: DescribeWebsiteCertificateAuthorityRequest](x: Self) {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setWebsiteCaId(value: Id): Self = StObject.set(x, "WebsiteCaId", value.asInstanceOf[js.Any])
  }
}
