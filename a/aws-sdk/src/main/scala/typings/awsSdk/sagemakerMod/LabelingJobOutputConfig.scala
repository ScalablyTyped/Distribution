package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobOutputConfig extends StObject {
  
  /**
    * The AWS Key Management Service ID of the key used to encrypt the output data, if any. If you use a KMS key ID or an alias of your master key, the Amazon SageMaker execution role must include permissions to call kms:Encrypt. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with KMS-managed keys for LabelingJobOutputConfig. If you use a bucket policy with an s3:PutObject permission that only allows objects with server-side encryption, set the condition key of s3:x-amz-server-side-encryption to "aws:kms". For more information, see KMS-Managed Encryption Keys in the Amazon Simple Storage Service Developer Guide.  The KMS key policy must grant permission to the IAM role that you specify in your CreateLabelingJob request. For more information, see Using Key Policies in AWS KMS in the AWS Key Management Service Developer Guide.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * The Amazon S3 location to write output data.
    */
  var S3OutputPath: S3Uri
  
  /**
    * An Amazon Simple Notification Service (Amazon SNS) output topic ARN. When workers complete labeling tasks, Ground Truth will send labeling task output data to the SNS output topic you specify here. You must provide a value for this parameter if you provide an Amazon SNS input topic in SnsDataSource in InputConfig.
    */
  var SnsTopicArn: js.UndefOr[typings.awsSdk.sagemakerMod.SnsTopicArn] = js.undefined
}
object LabelingJobOutputConfig {
  
  inline def apply(S3OutputPath: S3Uri): LabelingJobOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobOutputConfig]
  }
  
  extension [Self <: LabelingJobOutputConfig](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArn(value: SnsTopicArn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
  }
}
