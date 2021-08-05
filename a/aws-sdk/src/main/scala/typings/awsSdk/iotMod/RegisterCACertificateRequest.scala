package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCACertificateRequest extends StObject {
  
  /**
    * Allows this CA certificate to be used for auto registration of device certificates.
    */
  var allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.undefined
  
  /**
    * The CA certificate.
    */
  var caCertificate: CertificatePem
  
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
  
  /**
    * A boolean value that specifies if the CA certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.undefined
  
  /**
    * Metadata which can be used to manage the CA certificate.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The private key verification certificate.
    */
  var verificationCertificate: CertificatePem
}
object RegisterCACertificateRequest {
  
  inline def apply(caCertificate: CertificatePem, verificationCertificate: CertificatePem): RegisterCACertificateRequest = {
    val __obj = js.Dynamic.literal(caCertificate = caCertificate.asInstanceOf[js.Any], verificationCertificate = verificationCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCACertificateRequest]
  }
  
  extension [Self <: RegisterCACertificateRequest](x: Self) {
    
    inline def setAllowAutoRegistration(value: AllowAutoRegistration): Self = StObject.set(x, "allowAutoRegistration", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoRegistrationUndefined: Self = StObject.set(x, "allowAutoRegistration", js.undefined)
    
    inline def setCaCertificate(value: CertificatePem): Self = StObject.set(x, "caCertificate", value.asInstanceOf[js.Any])
    
    inline def setRegistrationConfig(value: RegistrationConfig): Self = StObject.set(x, "registrationConfig", value.asInstanceOf[js.Any])
    
    inline def setRegistrationConfigUndefined: Self = StObject.set(x, "registrationConfig", js.undefined)
    
    inline def setSetAsActive(value: SetAsActive): Self = StObject.set(x, "setAsActive", value.asInstanceOf[js.Any])
    
    inline def setSetAsActiveUndefined: Self = StObject.set(x, "setAsActive", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setVerificationCertificate(value: CertificatePem): Self = StObject.set(x, "verificationCertificate", value.asInstanceOf[js.Any])
  }
}
