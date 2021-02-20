package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateInfo extends StObject {
  
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typings.awsSdk.directoryserviceMod.CertificateId] = js.native
  
  /**
    * The common name for the certificate.
    */
  var CommonName: js.UndefOr[CertificateCN] = js.native
  
  /**
    * The date and time when the certificate will expire.
    */
  var ExpiryDateTime: js.UndefOr[CertificateExpiryDateTime] = js.native
  
  /**
    * The state of the certificate.
    */
  var State: js.UndefOr[CertificateState] = js.native
}
object CertificateInfo {
  
  @scala.inline
  def apply(): CertificateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateInfo]
  }
  
  @scala.inline
  implicit class CertificateInfoMutableBuilder[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "CertificateId", js.undefined)
    
    @scala.inline
    def setCommonName(value: CertificateCN): Self = StObject.set(x, "CommonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonNameUndefined: Self = StObject.set(x, "CommonName", js.undefined)
    
    @scala.inline
    def setExpiryDateTime(value: CertificateExpiryDateTime): Self = StObject.set(x, "ExpiryDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryDateTimeUndefined: Self = StObject.set(x, "ExpiryDateTime", js.undefined)
    
    @scala.inline
    def setState(value: CertificateState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
