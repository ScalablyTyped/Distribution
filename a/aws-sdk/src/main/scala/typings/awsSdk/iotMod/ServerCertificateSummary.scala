package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerCertificateSummary extends StObject {
  
  /**
    * The ARN of the server certificate.
    */
  var serverCertificateArn: js.UndefOr[AcmCertificateArn] = js.undefined
  
  /**
    * The status of the server certificate.
    */
  var serverCertificateStatus: js.UndefOr[ServerCertificateStatus] = js.undefined
  
  /**
    * Details that explain the status of the server certificate.
    */
  var serverCertificateStatusDetail: js.UndefOr[ServerCertificateStatusDetail] = js.undefined
}
object ServerCertificateSummary {
  
  @scala.inline
  def apply(): ServerCertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerCertificateSummary]
  }
  
  @scala.inline
  implicit class ServerCertificateSummaryMutableBuilder[Self <: ServerCertificateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerCertificateArn(value: AcmCertificateArn): Self = StObject.set(x, "serverCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateArnUndefined: Self = StObject.set(x, "serverCertificateArn", js.undefined)
    
    @scala.inline
    def setServerCertificateStatus(value: ServerCertificateStatus): Self = StObject.set(x, "serverCertificateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateStatusDetail(value: ServerCertificateStatusDetail): Self = StObject.set(x, "serverCertificateStatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateStatusDetailUndefined: Self = StObject.set(x, "serverCertificateStatusDetail", js.undefined)
    
    @scala.inline
    def setServerCertificateStatusUndefined: Self = StObject.set(x, "serverCertificateStatus", js.undefined)
  }
}
