package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportClientVpnClientCertificateRevocationListRequest extends StObject {
  
  /**
    * The client certificate revocation list file. For more information, see Generate a Client Certificate Revocation List in the AWS Client VPN Administrator Guide.
    */
  var CertificateRevocationList: String
  
  /**
    * The ID of the Client VPN endpoint to which the client certificate revocation list applies.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object ImportClientVpnClientCertificateRevocationListRequest {
  
  @scala.inline
  def apply(CertificateRevocationList: String, ClientVpnEndpointId: ClientVpnEndpointId): ImportClientVpnClientCertificateRevocationListRequest = {
    val __obj = js.Dynamic.literal(CertificateRevocationList = CertificateRevocationList.asInstanceOf[js.Any], ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportClientVpnClientCertificateRevocationListRequest]
  }
  
  @scala.inline
  implicit class ImportClientVpnClientCertificateRevocationListRequestMutableBuilder[Self <: ImportClientVpnClientCertificateRevocationListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateRevocationList(value: String): Self = StObject.set(x, "CertificateRevocationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
