package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfiguration extends StObject {
  
  /**
    * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer master key (CMK) stored in AWS Key Management Service (KMS) for the destination bucket. Amazon S3 uses this key to encrypt replica objects. Amazon S3 only supports symmetric customer managed CMKs. For more information, see Using Symmetric and Asymmetric Keys in the AWS Key Management Service Developer Guide.
    */
  var ReplicaKmsKeyID: js.UndefOr[typings.awsSdk.s3Mod.ReplicaKmsKeyID] = js.undefined
}
object EncryptionConfiguration {
  
  inline def apply(): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  extension [Self <: EncryptionConfiguration](x: Self) {
    
    inline def setReplicaKmsKeyID(value: ReplicaKmsKeyID): Self = StObject.set(x, "ReplicaKmsKeyID", value.asInstanceOf[js.Any])
    
    inline def setReplicaKmsKeyIDUndefined: Self = StObject.set(x, "ReplicaKmsKeyID", js.undefined)
  }
}
