package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipeline extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the pipeline.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline. If you use either s3 or s3-aws-kms as your Encryption:Mode, you don't need to provide a key with your job because a default key, known as an AWS-KMS key, is created for you automatically. You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key, or if you are using an Encryption:Mode of aes-cbc-pkcs7, aes-ctr, or aes-gcm.
    */
  var AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined
  
  /**
    * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. Either you specify both ContentConfig and ThumbnailConfig, or you specify OutputBucket.    Bucket: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.    Permissions: A list of the users and/or predefined Amazon S3 groups you want to have access to transcoded files and playlists, and the type of access that you want them to have.    GranteeType: The type of value that appears in the Grantee object:     Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.    Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.      Grantee: The AWS user or group that you want to have access to transcoded files and playlists.    Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:    READ: The grantee can read the objects and metadata for objects that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for objects that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the objects that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.        StorageClass: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.   
    */
  var ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined
  
  /**
    * The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform a variety of operations, such as creating a job or a preset.
    */
  var Id: js.UndefOr[typings.awsSdk.elastictranscoderMod.Id] = js.undefined
  
  /**
    * The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics files, if any, that you want to use for watermarks.
    */
  var InputBucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is not enforced. Constraints: Maximum 40 characters
    */
  var Name: js.UndefOr[typings.awsSdk.elastictranscoderMod.Name] = js.undefined
  
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.  To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.     Progressing (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process the job.    Complete (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.    Warning (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.    Error (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.  
    */
  var Notifications: js.UndefOr[typings.awsSdk.elastictranscoderMod.Notifications] = js.undefined
  
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and playlists. Either you specify this value, or you specify both ContentConfig and ThumbnailConfig.
    */
  var OutputBucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this pipeline.
    */
  var Role: js.UndefOr[typings.awsSdk.elastictranscoderMod.Role] = js.undefined
  
  /**
    * The current status of the pipeline:    Active: The pipeline is processing jobs.    Paused: The pipeline is not currently processing jobs.  
    */
  var Status: js.UndefOr[PipelineStatus] = js.undefined
  
  /**
    * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. Either you specify both ContentConfig and ThumbnailConfig, or you specify OutputBucket.    Bucket: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.     Permissions: A list of the users and/or predefined Amazon S3 groups you want to have access to thumbnail files, and the type of access that you want them to have.    GranteeType: The type of value that appears in the Grantee object:    Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.  A canonical user ID is not the same as an AWS account number.     Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.      Grantee: The AWS user or group that you want to have access to thumbnail files.   Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:     READ: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.        StorageClass: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.  
    */
  var ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined
}
object Pipeline {
  
  @scala.inline
  def apply(): Pipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipeline]
  }
  
  @scala.inline
  implicit class PipelineMutableBuilder[Self <: Pipeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAwsKmsKeyArn(value: KeyArn): Self = StObject.set(x, "AwsKmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsKmsKeyArnUndefined: Self = StObject.set(x, "AwsKmsKeyArn", js.undefined)
    
    @scala.inline
    def setContentConfig(value: PipelineOutputConfig): Self = StObject.set(x, "ContentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentConfigUndefined: Self = StObject.set(x, "ContentConfig", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInputBucket(value: BucketName): Self = StObject.set(x, "InputBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBucketUndefined: Self = StObject.set(x, "InputBucket", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNotifications(value: Notifications): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "Notifications", js.undefined)
    
    @scala.inline
    def setOutputBucket(value: BucketName): Self = StObject.set(x, "OutputBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBucketUndefined: Self = StObject.set(x, "OutputBucket", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setStatus(value: PipelineStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setThumbnailConfig(value: PipelineOutputConfig): Self = StObject.set(x, "ThumbnailConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailConfigUndefined: Self = StObject.set(x, "ThumbnailConfig", js.undefined)
  }
}
