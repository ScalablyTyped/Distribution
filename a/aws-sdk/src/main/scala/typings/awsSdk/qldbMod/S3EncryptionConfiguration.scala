package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3EncryptionConfiguration extends js.Object {
  
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
  implicit class S3EncryptionConfigurationOps[Self <: S3EncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObjectEncryptionType(value: S3ObjectEncryptionType): Self = this.set("ObjectEncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: Arn): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("KmsKeyArn", js.undefined)
  }
}
