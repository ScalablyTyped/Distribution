package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3EncryptionConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for a symmetric customer master key (CMK) in AWS Key Management Service (AWS KMS). Amazon QLDB does not support asymmetric CMKs. You must provide a KmsKeyArn if you specify SSE_KMS as the ObjectEncryptionType.  KmsKeyArn is not required if you specify SSE_S3 as the ObjectEncryptionType.
    */
  var KmsKeyArn: js.UndefOr[Arn] = js.native
  
  /**
    * The Amazon S3 object encryption type. To learn more about server-side encryption options in Amazon S3, see Protecting Data Using Server-Side Encryption in the Amazon S3 Developer Guide.
    */
  var ObjectEncryptionType: S3ObjectEncryptionType = js.native
}
object S3EncryptionConfiguration {
  
  @scala.inline
  def apply(ObjectEncryptionType: S3ObjectEncryptionType): S3EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(ObjectEncryptionType = ObjectEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EncryptionConfiguration]
  }
  
  @scala.inline
  implicit class S3EncryptionConfigurationMutableBuilder[Self <: S3EncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyArn(value: Arn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    @scala.inline
    def setObjectEncryptionType(value: S3ObjectEncryptionType): Self = StObject.set(x, "ObjectEncryptionType", value.asInstanceOf[js.Any])
  }
}
