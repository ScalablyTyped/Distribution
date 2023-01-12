package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As2ConnectorConfig extends StObject {
  
  /**
    * Specifies whether the AS2 file is compressed.
    */
  var Compression: js.UndefOr[CompressionEnum] = js.undefined
  
  /**
    * The algorithm that is used to encrypt the file.
    */
  var EncryptionAlgorithm: js.UndefOr[EncryptionAlg] = js.undefined
  
  /**
    * A unique identifier for the AS2 local profile.
    */
  var LocalProfileId: js.UndefOr[ProfileId] = js.undefined
  
  /**
    * Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether the partner response for transfers is synchronous or asynchronous. Specify either of the following values:    SYNC: The system expects a synchronous MDN response, confirming that the file was transferred successfully (or not).    NONE: Specifies that no MDN response is required.  
    */
  var MdnResponse: js.UndefOr[typings.awsSdk.clientsTransferMod.MdnResponse] = js.undefined
  
  /**
    * The signing algorithm for the MDN response.  If set to DEFAULT (or not set at all), the value for SigningAlogorithm is used. 
    */
  var MdnSigningAlgorithm: js.UndefOr[MdnSigningAlg] = js.undefined
  
  /**
    * Used as the Subject HTTP header attribute in AS2 messages that are being sent with the connector.
    */
  var MessageSubject: js.UndefOr[typings.awsSdk.clientsTransferMod.MessageSubject] = js.undefined
  
  /**
    * A unique identifier for the partner profile for the connector.
    */
  var PartnerProfileId: js.UndefOr[ProfileId] = js.undefined
  
  /**
    * The algorithm that is used to sign the AS2 messages sent with the connector.
    */
  var SigningAlgorithm: js.UndefOr[SigningAlg] = js.undefined
}
object As2ConnectorConfig {
  
  inline def apply(): As2ConnectorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As2ConnectorConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: As2ConnectorConfig] (val x: Self) extends AnyVal {
    
    inline def setCompression(value: CompressionEnum): Self = StObject.set(x, "Compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "Compression", js.undefined)
    
    inline def setEncryptionAlgorithm(value: EncryptionAlg): Self = StObject.set(x, "EncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "EncryptionAlgorithm", js.undefined)
    
    inline def setLocalProfileId(value: ProfileId): Self = StObject.set(x, "LocalProfileId", value.asInstanceOf[js.Any])
    
    inline def setLocalProfileIdUndefined: Self = StObject.set(x, "LocalProfileId", js.undefined)
    
    inline def setMdnResponse(value: MdnResponse): Self = StObject.set(x, "MdnResponse", value.asInstanceOf[js.Any])
    
    inline def setMdnResponseUndefined: Self = StObject.set(x, "MdnResponse", js.undefined)
    
    inline def setMdnSigningAlgorithm(value: MdnSigningAlg): Self = StObject.set(x, "MdnSigningAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMdnSigningAlgorithmUndefined: Self = StObject.set(x, "MdnSigningAlgorithm", js.undefined)
    
    inline def setMessageSubject(value: MessageSubject): Self = StObject.set(x, "MessageSubject", value.asInstanceOf[js.Any])
    
    inline def setMessageSubjectUndefined: Self = StObject.set(x, "MessageSubject", js.undefined)
    
    inline def setPartnerProfileId(value: ProfileId): Self = StObject.set(x, "PartnerProfileId", value.asInstanceOf[js.Any])
    
    inline def setPartnerProfileIdUndefined: Self = StObject.set(x, "PartnerProfileId", js.undefined)
    
    inline def setSigningAlgorithm(value: SigningAlg): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmUndefined: Self = StObject.set(x, "SigningAlgorithm", js.undefined)
  }
}
