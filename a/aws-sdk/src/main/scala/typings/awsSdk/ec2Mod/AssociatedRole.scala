package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedRole extends StObject {
  
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
  implicit class AssociatedRoleMutableBuilder[Self <: AssociatedRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedRoleArn(value: ResourceArn): Self = StObject.set(x, "AssociatedRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedRoleArnUndefined: Self = StObject.set(x, "AssociatedRoleArn", js.undefined)
    
    @scala.inline
    def setCertificateS3BucketName(value: String): Self = StObject.set(x, "CertificateS3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateS3BucketNameUndefined: Self = StObject.set(x, "CertificateS3BucketName", js.undefined)
    
    @scala.inline
    def setCertificateS3ObjectKey(value: String): Self = StObject.set(x, "CertificateS3ObjectKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateS3ObjectKeyUndefined: Self = StObject.set(x, "CertificateS3ObjectKey", js.undefined)
    
    @scala.inline
    def setEncryptionKmsKeyId(value: String): Self = StObject.set(x, "EncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKmsKeyIdUndefined: Self = StObject.set(x, "EncryptionKmsKeyId", js.undefined)
  }
}
