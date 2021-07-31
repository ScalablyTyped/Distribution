package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWebsiteCertificateAuthorityResponse extends StObject {
  
  /**
    * The root certificate of the certificate authority.
    */
  var Certificate: js.UndefOr[typings.awsSdk.worklinkMod.Certificate] = js.undefined
  
  /**
    * The time that the certificate authority was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The certificate name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.undefined
}
object DescribeWebsiteCertificateAuthorityResponse {
  
  @scala.inline
  def apply(): DescribeWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityResponse]
  }
  
  @scala.inline
  implicit class DescribeWebsiteCertificateAuthorityResponseMutableBuilder[Self <: DescribeWebsiteCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: DateTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
  }
}
