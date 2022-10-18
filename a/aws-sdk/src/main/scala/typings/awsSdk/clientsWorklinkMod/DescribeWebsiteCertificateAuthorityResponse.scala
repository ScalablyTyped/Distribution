package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWebsiteCertificateAuthorityResponse extends StObject {
  
  /**
    * The root certificate of the certificate authority.
    */
  var Certificate: js.UndefOr[typings.awsSdk.clientsWorklinkMod.Certificate] = js.undefined
  
  /**
    * The time that the certificate authority was added.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The certificate name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DisplayName] = js.undefined
}
object DescribeWebsiteCertificateAuthorityResponse {
  
  inline def apply(): DescribeWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityResponse]
  }
  
  extension [Self <: DescribeWebsiteCertificateAuthorityResponse](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
  }
}
