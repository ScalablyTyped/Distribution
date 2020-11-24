package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedRole extends js.Object {
  
  /**
    * The ARN of the associated IAM role.
    */
  var AssociatedRoleArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The name of the Amazon S3 bucket in which the Amazon S3 object is stored.
    */
  var CertificateS3BucketName: js.UndefOr[String] = js.native
  
  /**
    * The key of the Amazon S3 object ey where the certificate, certificate chain, and encrypted private key bundle is stored. The object key is formated as follows: certificate_arn/role_arn. 
    */
  var CertificateS3ObjectKey: js.UndefOr[String] = js.native
  
  /**
    * The ID of the KMS customer master key (CMK) used to encrypt the private key.
    */
  var EncryptionKmsKeyId: js.UndefOr[String] = js.native
}
object AssociatedRole {
  
  @scala.inline
  def apply(): AssociatedRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedRole]
  }
  
  @scala.inline
  implicit class AssociatedRoleOps[Self <: AssociatedRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociatedRoleArn(value: ResourceArn): Self = this.set("AssociatedRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedRoleArn: Self = this.set("AssociatedRoleArn", js.undefined)
    
    @scala.inline
    def setCertificateS3BucketName(value: String): Self = this.set("CertificateS3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateS3BucketName: Self = this.set("CertificateS3BucketName", js.undefined)
    
    @scala.inline
    def setCertificateS3ObjectKey(value: String): Self = this.set("CertificateS3ObjectKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateS3ObjectKey: Self = this.set("CertificateS3ObjectKey", js.undefined)
    
    @scala.inline
    def setEncryptionKmsKeyId(value: String): Self = this.set("EncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKmsKeyId: Self = this.set("EncryptionKmsKeyId", js.undefined)
  }
}
