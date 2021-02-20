package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
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
    * The date and time that the certificate was registered.
    */
  var RegisteredDateTime: js.UndefOr[CertificateRegisteredDateTime] = js.native
  
  /**
    * The state of the certificate.
    */
  var State: js.UndefOr[CertificateState] = js.native
  
  /**
    * Describes a state change for the certificate.
    */
  var StateReason: js.UndefOr[CertificateStateReason] = js.native
}
object Certificate {
  
  @scala.inline
  def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
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
    def setRegisteredDateTime(value: CertificateRegisteredDateTime): Self = StObject.set(x, "RegisteredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredDateTimeUndefined: Self = StObject.set(x, "RegisteredDateTime", js.undefined)
    
    @scala.inline
    def setState(value: CertificateState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: CertificateStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
