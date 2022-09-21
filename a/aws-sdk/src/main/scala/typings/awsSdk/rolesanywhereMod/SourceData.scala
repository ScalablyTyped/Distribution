package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceData extends StObject {
  
  /**
    * The root certificate of the Certificate Manager Private Certificate Authority specified by this ARN is used in trust validation for CreateSession operations. Included for trust anchors of type AWS_ACM_PCA. 
    */
  var acmPcaArn: js.UndefOr[String] = js.undefined
  
  /**
    * The PEM-encoded data for the certificate anchor. Included for trust anchors of type CERTIFICATE_BUNDLE. 
    */
  var x509CertificateData: js.UndefOr[String] = js.undefined
}
object SourceData {
  
  inline def apply(): SourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceData]
  }
  
  extension [Self <: SourceData](x: Self) {
    
    inline def setAcmPcaArn(value: String): Self = StObject.set(x, "acmPcaArn", value.asInstanceOf[js.Any])
    
    inline def setAcmPcaArnUndefined: Self = StObject.set(x, "acmPcaArn", js.undefined)
    
    inline def setX509CertificateData(value: String): Self = StObject.set(x, "x509CertificateData", value.asInstanceOf[js.Any])
    
    inline def setX509CertificateDataUndefined: Self = StObject.set(x, "x509CertificateData", js.undefined)
  }
}
