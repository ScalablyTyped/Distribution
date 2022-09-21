package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeySigningKeyRequest extends StObject {
  
  /**
    * A unique string that identifies the request.
    */
  var CallerReference: Nonce
  
  /**
    * The unique string (ID) used to identify a hosted zone.
    */
  var HostedZoneId: ResourceId
  
  /**
    * The Amazon resource name (ARN) for a customer managed key in Key Management Service (KMS). The KeyManagementServiceArn must be unique for each key-signing key (KSK) in a single hosted zone. To see an example of KeyManagementServiceArn that grants the correct permissions for DNSSEC, scroll down to Example.  You must configure the customer managed customer managed key as follows:  Status  Enabled  Key spec  ECC_NIST_P256  Key usage  Sign and verify  Key policy  The key policy must give permission for the following actions:   DescribeKey   GetPublicKey   Sign   The key policy must also include the Amazon Route 53 service in the principal for your account. Specify the following:    "Service": "dnssec-route53.amazonaws.com"      For more information about working with a customer managed key in KMS, see Key Management Service concepts.
    */
  var KeyManagementServiceArn: SigningKeyString
  
  /**
    * A string used to identify a key-signing key (KSK). Name can include numbers, letters, and underscores (_). Name must be unique for each key-signing key in the same hosted zone.
    */
  var Name: SigningKeyName
  
  /**
    * A string specifying the initial status of the key-signing key (KSK). You can set the value to ACTIVE or INACTIVE.
    */
  var Status: SigningKeyStatus
}
object CreateKeySigningKeyRequest {
  
  inline def apply(
    CallerReference: Nonce,
    HostedZoneId: ResourceId,
    KeyManagementServiceArn: SigningKeyString,
    Name: SigningKeyName,
    Status: SigningKeyStatus
  ): CreateKeySigningKeyRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], HostedZoneId = HostedZoneId.asInstanceOf[js.Any], KeyManagementServiceArn = KeyManagementServiceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeySigningKeyRequest]
  }
  
  extension [Self <: CreateKeySigningKeyRequest](x: Self) {
    
    inline def setCallerReference(value: Nonce): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setKeyManagementServiceArn(value: SigningKeyString): Self = StObject.set(x, "KeyManagementServiceArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: SigningKeyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SigningKeyStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
