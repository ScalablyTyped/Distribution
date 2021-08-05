package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateEnclaveCertificateIamRoleResult extends StObject {
  
  /**
    * The name of the Amazon S3 bucket to which the certificate was uploaded.
    */
  var CertificateS3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are stored. The object key is formatted as follows: certificate_arn/role_arn.
    */
  var CertificateS3ObjectKey: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AWS KMS CMK used to encrypt the private key of the certificate.
    */
  var EncryptionKmsKeyId: js.UndefOr[String] = js.undefined
}
object AssociateEnclaveCertificateIamRoleResult {
  
  inline def apply(): AssociateEnclaveCertificateIamRoleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateEnclaveCertificateIamRoleResult]
  }
  
  extension [Self <: AssociateEnclaveCertificateIamRoleResult](x: Self) {
    
    inline def setCertificateS3BucketName(value: String): Self = StObject.set(x, "CertificateS3BucketName", value.asInstanceOf[js.Any])
    
    inline def setCertificateS3BucketNameUndefined: Self = StObject.set(x, "CertificateS3BucketName", js.undefined)
    
    inline def setCertificateS3ObjectKey(value: String): Self = StObject.set(x, "CertificateS3ObjectKey", value.asInstanceOf[js.Any])
    
    inline def setCertificateS3ObjectKeyUndefined: Self = StObject.set(x, "CertificateS3ObjectKey", js.undefined)
    
    inline def setEncryptionKmsKeyId(value: String): Self = StObject.set(x, "EncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKmsKeyIdUndefined: Self = StObject.set(x, "EncryptionKmsKeyId", js.undefined)
  }
}
