package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedRole extends StObject {
  
  /**
    * The ARN of the associated IAM role.
    */
  var AssociatedRoleArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket in which the Amazon S3 object is stored.
    */
  var CertificateS3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The key of the Amazon S3 object ey where the certificate, certificate chain, and encrypted private key bundle is stored. The object key is formated as follows: certificate_arn/role_arn. 
    */
  var CertificateS3ObjectKey: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the KMS customer master key (CMK) used to encrypt the private key.
    */
  var EncryptionKmsKeyId: js.UndefOr[String] = js.undefined
}
object AssociatedRole {
  
  inline def apply(): AssociatedRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedRole]
  }
  
  extension [Self <: AssociatedRole](x: Self) {
    
    inline def setAssociatedRoleArn(value: ResourceArn): Self = StObject.set(x, "AssociatedRoleArn", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRoleArnUndefined: Self = StObject.set(x, "AssociatedRoleArn", js.undefined)
    
    inline def setCertificateS3BucketName(value: String): Self = StObject.set(x, "CertificateS3BucketName", value.asInstanceOf[js.Any])
    
    inline def setCertificateS3BucketNameUndefined: Self = StObject.set(x, "CertificateS3BucketName", js.undefined)
    
    inline def setCertificateS3ObjectKey(value: String): Self = StObject.set(x, "CertificateS3ObjectKey", value.asInstanceOf[js.Any])
    
    inline def setCertificateS3ObjectKeyUndefined: Self = StObject.set(x, "CertificateS3ObjectKey", js.undefined)
    
    inline def setEncryptionKmsKeyId(value: String): Self = StObject.set(x, "EncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKmsKeyIdUndefined: Self = StObject.set(x, "EncryptionKmsKeyId", js.undefined)
  }
}
