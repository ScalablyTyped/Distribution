package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProvisioningClaimResponse extends StObject {
  
  /**
    * The ID of the certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  
  /**
    * The provisioning claim certificate.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  
  /**
    * The provisioning claim expiration time.
    */
  var expiration: js.UndefOr[DateType] = js.native
  
  /**
    * The provisioning claim key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
}
object CreateProvisioningClaimResponse {
  
  @scala.inline
  def apply(): CreateProvisioningClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisioningClaimResponse]
  }
  
  @scala.inline
  implicit class CreateProvisioningClaimResponseMutableBuilder[Self <: CreateProvisioningClaimResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
    
    @scala.inline
    def setExpiration(value: DateType): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setKeyPair(value: KeyPair): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
  }
}
