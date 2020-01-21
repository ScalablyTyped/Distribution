package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typings.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/InputTypesUnion", JSImport.Namespace)
@js.native
object inputTypesUnionMod extends js.Object {
  trait _InputTypesUnion extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
    - typings.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
    - typings.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput
    - typings.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput
    - typings.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
    - typings.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput
    - typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
    - typings.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
    - typings.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
    - typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
    - typings.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
    - typings.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
    - typings.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
    - typings.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput
    - typings.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
    - typings.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput
    - typings.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput
    - typings.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput
    - typings.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput
    - typings.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
    - typings.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput
    - typings.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
    - typings.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput
    - typings.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
    - typings.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
    - typings.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
    - typings.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
    - typings.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput
    - typings.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput
    - typings.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
    - typings.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput
    - typings.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
    - typings.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput
    - typings.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput
    - typings.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
    - typings.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput
    - typings.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput
    - typings.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput
    - typings.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput
    - typings.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput
    - typings.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput
    - typings.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput
    - typings.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput
    - typings.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput
    - typings.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
    - typings.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
    - typings.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
    - typings.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput
    - typings.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
    - typings.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput
    - typings.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput
    - typings.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input
    - typings.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput
    - typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
    - typings.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput
    - typings.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
    - typings.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput
    - typings.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
    - typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
    - typings.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
    - typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
    - typings.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput
    - typings.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
    - typings.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput
    - typings.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
    - typings.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput
    - typings.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput
    - typings.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
    - typings.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput
    - typings.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput
    - typings.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
    - typings.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput[typings.node.streamMod.Readable]
    - typings.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput
    - typings.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput
    - typings.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput
    - typings.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput
    - typings.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput[typings.node.streamMod.Readable]
    - typings.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput
  */
  type InputTypesUnion = _InputTypesUnion | PutObjectInput[Readable] | UploadPartInput[Readable]
}

