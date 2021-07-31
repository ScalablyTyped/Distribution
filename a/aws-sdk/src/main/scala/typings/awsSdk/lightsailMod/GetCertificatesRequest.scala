package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCertificatesRequest extends StObject {
  
  /**
    * The name for the certificate for which to return information. When omitted, the response includes all of your certificates in the AWS Region where the request is made.
    */
  var certificateName: js.UndefOr[CertificateName] = js.undefined
  
  /**
    * The status of the certificates for which to return information. For example, specify ISSUED to return only certificates with an ISSUED status. When omitted, the response includes all of your certificates in the AWS Region where the request is made, regardless of their current status.
    */
  var certificateStatuses: js.UndefOr[CertificateStatusList] = js.undefined
  
  /**
    * Indicates whether to include detailed information about the certificates in the response. When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain names, and tags.
    */
  var includeCertificateDetails: js.UndefOr[IncludeCertificateDetails] = js.undefined
}
object GetCertificatesRequest {
  
  @scala.inline
  def apply(): GetCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificatesRequest]
  }
  
  @scala.inline
  implicit class GetCertificatesRequestMutableBuilder[Self <: GetCertificatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateName(value: CertificateName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    @scala.inline
    def setCertificateStatuses(value: CertificateStatusList): Self = StObject.set(x, "certificateStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateStatusesUndefined: Self = StObject.set(x, "certificateStatuses", js.undefined)
    
    @scala.inline
    def setCertificateStatusesVarargs(value: CertificateStatus*): Self = StObject.set(x, "certificateStatuses", js.Array(value :_*))
    
    @scala.inline
    def setIncludeCertificateDetails(value: IncludeCertificateDetails): Self = StObject.set(x, "includeCertificateDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCertificateDetailsUndefined: Self = StObject.set(x, "includeCertificateDetails", js.undefined)
  }
}
