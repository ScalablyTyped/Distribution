package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SQL
import typings.awsSdkClientS3Browser.typesAccelerateConfigurationMod.AccelerateConfiguration
import typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.AnalyticsConfiguration
import typings.awsSdkClientS3Browser.typesBucketLoggingStatusMod.BucketLoggingStatus
import typings.awsSdkClientS3Browser.typesCorsconfigurationMod.CORSConfiguration
import typings.awsSdkClientS3Browser.typesDeleteMod.Delete
import typings.awsSdkClientS3Browser.typesInputSerializationMod.InputSerialization
import typings.awsSdkClientS3Browser.typesInventoryConfigurationMod.InventoryConfiguration
import typings.awsSdkClientS3Browser.typesMetricsConfigurationMod.MetricsConfiguration
import typings.awsSdkClientS3Browser.typesNotificationConfigurationDeprecatedMod.NotificationConfigurationDeprecated
import typings.awsSdkClientS3Browser.typesNotificationConfigurationMod.NotificationConfiguration
import typings.awsSdkClientS3Browser.typesOutputSerializationMod.OutputSerialization
import typings.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput
import typings.awsSdkClientS3Browser.typesReplicationConfigurationMod.ReplicationConfiguration
import typings.awsSdkClientS3Browser.typesRequestPaymentConfigurationMod.RequestPaymentConfiguration
import typings.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod.ServerSideEncryptionConfiguration
import typings.awsSdkClientS3Browser.typesTaggingMod.Tagging
import typings.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput
import typings.awsSdkClientS3Browser.typesVersioningConfigurationMod.VersioningConfiguration
import typings.awsSdkClientS3Browser.typesWebsiteConfigurationMod.WebsiteConfiguration
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
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
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    @scala.inline
    def AbortMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typings.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput]
    }
    
    @scala.inline
    def CompleteMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typings.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput]
    }
    
    @scala.inline
    def CopyObjectInput(Bucket: String, CopySource: String, Key: String): typings.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput]
    }
    
    @scala.inline
    def CreateBucketInput(Bucket: String): typings.awsSdkClientS3Browser.typesCreateBucketInputMod.CreateBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCreateBucketInputMod.CreateBucketInput]
    }
    
    @scala.inline
    def CreateMultipartUploadInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput]
    }
    
    @scala.inline
    def DeleteBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput]
    }
    
    @scala.inline
    def DeleteBucketCorsInput(Bucket: String): typings.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput]
    }
    
    @scala.inline
    def DeleteBucketEncryptionInput(Bucket: String): typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput]
    }
    
    @scala.inline
    def DeleteBucketInput(Bucket: String): typings.awsSdkClientS3Browser.typesDeleteBucketInputMod.DeleteBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketInputMod.DeleteBucketInput]
    }
    
    @scala.inline
    def DeleteBucketInventoryConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput]
    }
    
    @scala.inline
    def DeleteBucketLifecycleInput(Bucket: String): typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput]
    }
    
    @scala.inline
    def DeleteBucketMetricsConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput]
    }
    
    @scala.inline
    def DeleteBucketPolicyInput(Bucket: String): typings.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput]
    }
    
    @scala.inline
    def DeleteBucketReplicationInput(Bucket: String): typings.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput]
    }
    
    @scala.inline
    def DeleteBucketTaggingInput(Bucket: String): typings.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput]
    }
    
    @scala.inline
    def DeleteBucketWebsiteInput(Bucket: String): typings.awsSdkClientS3Browser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput]
    }
    
    @scala.inline
    def DeleteObjectInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput]
    }
    
    @scala.inline
    def DeleteObjectTaggingInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput]
    }
    
    @scala.inline
    def DeleteObjectsInput(Bucket: String, Delete: Delete): typings.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput]
    }
    
    @scala.inline
    def GetBucketAccelerateConfigurationInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput]
    }
    
    @scala.inline
    def GetBucketAclInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketAclInputMod.GetBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketAclInputMod.GetBucketAclInput]
    }
    
    @scala.inline
    def GetBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput]
    }
    
    @scala.inline
    def GetBucketCorsInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput]
    }
    
    @scala.inline
    def GetBucketEncryptionInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput]
    }
    
    @scala.inline
    def GetBucketInventoryConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput]
    }
    
    @scala.inline
    def GetBucketLifecycleConfigurationInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput]
    }
    
    @scala.inline
    def GetBucketLifecycleInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput]
    }
    
    @scala.inline
    def GetBucketLocationInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput]
    }
    
    @scala.inline
    def GetBucketLoggingInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput]
    }
    
    @scala.inline
    def GetBucketMetricsConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput]
    }
    
    @scala.inline
    def GetBucketNotificationConfigurationInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput]
    }
    
    @scala.inline
    def GetBucketNotificationInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput]
    }
    
    @scala.inline
    def GetBucketPolicyInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput]
    }
    
    @scala.inline
    def GetBucketReplicationInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput]
    }
    
    @scala.inline
    def GetBucketRequestPaymentInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput]
    }
    
    @scala.inline
    def GetBucketTaggingInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketTaggingInputMod.GetBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketTaggingInputMod.GetBucketTaggingInput]
    }
    
    @scala.inline
    def GetBucketVersioningInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput]
    }
    
    @scala.inline
    def GetBucketWebsiteInput(Bucket: String): typings.awsSdkClientS3Browser.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput]
    }
    
    @scala.inline
    def GetObjectAclInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput]
    }
    
    @scala.inline
    def GetObjectInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput]
    }
    
    @scala.inline
    def GetObjectTaggingInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesGetObjectTaggingInputMod.GetObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetObjectTaggingInputMod.GetObjectTaggingInput]
    }
    
    @scala.inline
    def GetObjectTorrentInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput]
    }
    
    @scala.inline
    def HeadBucketInput(Bucket: String): typings.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput]
    }
    
    @scala.inline
    def HeadObjectInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput]
    }
    
    @scala.inline
    def ListBucketAnalyticsConfigurationsInput(Bucket: String): typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput]
    }
    
    @scala.inline
    def ListBucketInventoryConfigurationsInput(Bucket: String): typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput]
    }
    
    @scala.inline
    def ListBucketMetricsConfigurationsInput(Bucket: String): typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput]
    }
    
    @scala.inline
    def ListBucketsInput(): typings.awsSdkClientS3Browser.typesListBucketsInputMod.ListBucketsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketsInputMod.ListBucketsInput]
    }
    
    @scala.inline
    def ListMultipartUploadsInput(Bucket: String): typings.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput]
    }
    
    @scala.inline
    def ListObjectVersionsInput(Bucket: String): typings.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput]
    }
    
    @scala.inline
    def ListObjectsInput(Bucket: String): typings.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput]
    }
    
    @scala.inline
    def ListObjectsV2Input(Bucket: String): typings.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input]
    }
    
    @scala.inline
    def ListPartsInput(Bucket: String, Key: String, UploadId: String): typings.awsSdkClientS3Browser.typesListPartsInputMod.ListPartsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListPartsInputMod.ListPartsInput]
    }
    
    @scala.inline
    def PutBucketAccelerateConfigurationInput(AccelerateConfiguration: AccelerateConfiguration, Bucket: String): typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput]
    }
    
    @scala.inline
    def PutBucketAclInput(Bucket: String): typings.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput]
    }
    
    @scala.inline
    def PutBucketAnalyticsConfigurationInput(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: String, Id: String): typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput]
    }
    
    @scala.inline
    def PutBucketCorsInput(Bucket: String, CORSConfiguration: CORSConfiguration): typings.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CORSConfiguration = CORSConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput]
    }
    
    @scala.inline
    def PutBucketEncryptionInput(Bucket: String, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): typings.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput]
    }
    
    @scala.inline
    def PutBucketInventoryConfigurationInput(Bucket: String, Id: String, InventoryConfiguration: InventoryConfiguration): typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InventoryConfiguration = InventoryConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput]
    }
    
    @scala.inline
    def PutBucketLifecycleConfigurationInput(Bucket: String): typings.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput]
    }
    
    @scala.inline
    def PutBucketLifecycleInput(Bucket: String): typings.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput]
    }
    
    @scala.inline
    def PutBucketLoggingInput(Bucket: String, BucketLoggingStatus: BucketLoggingStatus): typings.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput]
    }
    
    @scala.inline
    def PutBucketMetricsConfigurationInput(Bucket: String, Id: String, MetricsConfiguration: MetricsConfiguration): typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput]
    }
    
    @scala.inline
    def PutBucketNotificationConfigurationInput(Bucket: String, NotificationConfiguration: NotificationConfiguration): typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput]
    }
    
    @scala.inline
    def PutBucketNotificationInput(Bucket: String, NotificationConfiguration: NotificationConfigurationDeprecated): typings.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput]
    }
    
    @scala.inline
    def PutBucketPolicyInput(Bucket: String, Policy: String): typings.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput]
    }
    
    @scala.inline
    def PutBucketReplicationInput(Bucket: String, ReplicationConfiguration: ReplicationConfiguration): typings.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ReplicationConfiguration = ReplicationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput]
    }
    
    @scala.inline
    def PutBucketRequestPaymentInput(Bucket: String, RequestPaymentConfiguration: RequestPaymentConfiguration): typings.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput]
    }
    
    @scala.inline
    def PutBucketTaggingInput(Bucket: String, Tagging: Tagging): typings.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput]
    }
    
    @scala.inline
    def PutBucketVersioningInput(Bucket: String, VersioningConfiguration: VersioningConfiguration): typings.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput]
    }
    
    @scala.inline
    def PutBucketWebsiteInput(Bucket: String, WebsiteConfiguration: WebsiteConfiguration): typings.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput]
    }
    
    @scala.inline
    def PutObjectAclInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput]
    }
    
    @scala.inline
    def PutObjectTaggingInput(Bucket: String, Key: String, Tagging: Tagging): typings.awsSdkClientS3Browser.typesPutObjectTaggingInputMod.PutObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutObjectTaggingInputMod.PutObjectTaggingInput]
    }
    
    @scala.inline
    def RestoreObjectInput(Bucket: String, Key: String): typings.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput]
    }
    
    @scala.inline
    def SelectObjectContentInput(
      Bucket: String,
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: InputSerialization,
      Key: String,
      OutputSerialization: OutputSerialization
    ): typings.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput]
    }
    
    @scala.inline
    def UploadPartCopyInput(Bucket: String, CopySource: String, Key: String, PartNumber: Double, UploadId: String): typings.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput]
    }
  }
}
