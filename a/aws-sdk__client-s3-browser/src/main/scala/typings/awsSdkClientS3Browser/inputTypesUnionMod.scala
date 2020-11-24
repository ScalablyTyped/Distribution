package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput
import typings.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/types/InputTypesUnion", JSImport.Namespace)
@js.native
object inputTypesUnionMod extends js.Object {
  
  trait _InputTypesUnion extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
    - typings.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
    - typings.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput
    - typings.awsSdkClientS3Browser.typesCreateBucketInputMod.CreateBucketInput
    - typings.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketInputMod.DeleteBucketInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
    - typings.awsSdkClientS3Browser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput
    - typings.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput
    - typings.awsSdkClientS3Browser.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput
    - typings.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput
    - typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
    - typings.awsSdkClientS3Browser.typesGetBucketAclInputMod.GetBucketAclInput
    - typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
    - typings.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput
    - typings.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
    - typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
    - typings.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
    - typings.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
    - typings.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput
    - typings.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput
    - typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
    - typings.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput
    - typings.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
    - typings.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput
    - typings.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput
    - typings.awsSdkClientS3Browser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
    - typings.awsSdkClientS3Browser.typesGetBucketTaggingInputMod.GetBucketTaggingInput
    - typings.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput
    - typings.awsSdkClientS3Browser.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput
    - typings.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput
    - typings.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput
    - typings.awsSdkClientS3Browser.typesGetObjectTaggingInputMod.GetObjectTaggingInput
    - typings.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput
    - typings.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput
    - typings.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput
    - typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
    - typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
    - typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
    - typings.awsSdkClientS3Browser.typesListBucketsInputMod.ListBucketsInput
    - typings.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
    - typings.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput
    - typings.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput
    - typings.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input
    - typings.awsSdkClientS3Browser.typesListPartsInputMod.ListPartsInput
    - typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
    - typings.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput
    - typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
    - typings.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput
    - typings.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
    - typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
    - typings.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
    - typings.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
    - typings.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput
    - typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
    - typings.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput
    - typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
    - typings.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput
    - typings.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput
    - typings.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
    - typings.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput
    - typings.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput
    - typings.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
    - typings.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput[typings.std.Blob]
    - typings.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput
    - typings.awsSdkClientS3Browser.typesPutObjectTaggingInputMod.PutObjectTaggingInput
    - typings.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput
    - typings.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput
    - typings.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput[typings.std.Blob]
    - typings.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput
  */
  type InputTypesUnion = _InputTypesUnion | PutObjectInput[Blob] | UploadPartInput[Blob]
}
