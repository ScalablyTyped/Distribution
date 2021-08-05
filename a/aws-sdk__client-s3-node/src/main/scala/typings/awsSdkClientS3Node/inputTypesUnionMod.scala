package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typings.awsSdkClientS3Node.typesAccelerateConfigurationMod.AccelerateConfiguration
import typings.awsSdkClientS3Node.typesAnalyticsConfigurationMod.AnalyticsConfiguration
import typings.awsSdkClientS3Node.typesBucketLoggingStatusMod.BucketLoggingStatus
import typings.awsSdkClientS3Node.typesCorsconfigurationMod.CORSConfiguration
import typings.awsSdkClientS3Node.typesDeleteMod.Delete
import typings.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization
import typings.awsSdkClientS3Node.typesInventoryConfigurationMod.InventoryConfiguration
import typings.awsSdkClientS3Node.typesMetricsConfigurationMod.MetricsConfiguration
import typings.awsSdkClientS3Node.typesNotificationConfigurationDeprecatedMod.NotificationConfigurationDeprecated
import typings.awsSdkClientS3Node.typesNotificationConfigurationMod.NotificationConfiguration
import typings.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization
import typings.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typings.awsSdkClientS3Node.typesReplicationConfigurationMod.ReplicationConfiguration
import typings.awsSdkClientS3Node.typesRequestPaymentConfigurationMod.RequestPaymentConfiguration
import typings.awsSdkClientS3Node.typesServerSideEncryptionConfigurationMod.ServerSideEncryptionConfiguration
import typings.awsSdkClientS3Node.typesTaggingMod.Tagging
import typings.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typings.awsSdkClientS3Node.typesVersioningConfigurationMod.VersioningConfiguration
import typings.awsSdkClientS3Node.typesWebsiteConfigurationMod.WebsiteConfiguration
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
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
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    inline def AbortMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typings.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput]
    }
    
    inline def CompleteMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typings.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput]
    }
    
    inline def CopyObjectInput(Bucket: String, CopySource: String, Key: String): typings.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput]
    }
    
    inline def CreateBucketInput(Bucket: String): typings.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput]
    }
    
    inline def CreateMultipartUploadInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput]
    }
    
    inline def DeleteBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput]
    }
    
    inline def DeleteBucketCorsInput(Bucket: String): typings.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput]
    }
    
    inline def DeleteBucketEncryptionInput(Bucket: String): typings.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput]
    }
    
    inline def DeleteBucketInput(Bucket: String): typings.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput]
    }
    
    inline def DeleteBucketInventoryConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput]
    }
    
    inline def DeleteBucketLifecycleInput(Bucket: String): typings.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput]
    }
    
    inline def DeleteBucketMetricsConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput]
    }
    
    inline def DeleteBucketPolicyInput(Bucket: String): typings.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput]
    }
    
    inline def DeleteBucketReplicationInput(Bucket: String): typings.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput]
    }
    
    inline def DeleteBucketTaggingInput(Bucket: String): typings.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput]
    }
    
    inline def DeleteBucketWebsiteInput(Bucket: String): typings.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput]
    }
    
    inline def DeleteObjectInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput]
    }
    
    inline def DeleteObjectTaggingInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput]
    }
    
    inline def DeleteObjectsInput(Bucket: String, Delete: Delete): typings.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput]
    }
    
    inline def GetBucketAccelerateConfigurationInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput]
    }
    
    inline def GetBucketAclInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput]
    }
    
    inline def GetBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput]
    }
    
    inline def GetBucketCorsInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput]
    }
    
    inline def GetBucketEncryptionInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput]
    }
    
    inline def GetBucketInventoryConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput]
    }
    
    inline def GetBucketLifecycleConfigurationInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput]
    }
    
    inline def GetBucketLifecycleInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput]
    }
    
    inline def GetBucketLocationInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput]
    }
    
    inline def GetBucketLoggingInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput]
    }
    
    inline def GetBucketMetricsConfigurationInput(Bucket: String, Id: String): typings.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput]
    }
    
    inline def GetBucketNotificationConfigurationInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput]
    }
    
    inline def GetBucketNotificationInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput]
    }
    
    inline def GetBucketPolicyInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput]
    }
    
    inline def GetBucketReplicationInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput]
    }
    
    inline def GetBucketRequestPaymentInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput]
    }
    
    inline def GetBucketTaggingInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput]
    }
    
    inline def GetBucketVersioningInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput]
    }
    
    inline def GetBucketWebsiteInput(Bucket: String): typings.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput]
    }
    
    inline def GetObjectAclInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput]
    }
    
    inline def GetObjectInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput]
    }
    
    inline def GetObjectTaggingInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput]
    }
    
    inline def GetObjectTorrentInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput]
    }
    
    inline def HeadBucketInput(Bucket: String): typings.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput]
    }
    
    inline def HeadObjectInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput]
    }
    
    inline def ListBucketAnalyticsConfigurationsInput(Bucket: String): typings.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput]
    }
    
    inline def ListBucketInventoryConfigurationsInput(Bucket: String): typings.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput]
    }
    
    inline def ListBucketMetricsConfigurationsInput(Bucket: String): typings.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput]
    }
    
    inline def ListBucketsInput(): typings.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput]
    }
    
    inline def ListMultipartUploadsInput(Bucket: String): typings.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput]
    }
    
    inline def ListObjectVersionsInput(Bucket: String): typings.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput]
    }
    
    inline def ListObjectsInput(Bucket: String): typings.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput]
    }
    
    inline def ListObjectsV2Input(Bucket: String): typings.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input]
    }
    
    inline def ListPartsInput(Bucket: String, Key: String, UploadId: String): typings.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput]
    }
    
    inline def PutBucketAccelerateConfigurationInput(AccelerateConfiguration: AccelerateConfiguration, Bucket: String): typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput]
    }
    
    inline def PutBucketAclInput(Bucket: String): typings.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput]
    }
    
    inline def PutBucketAnalyticsConfigurationInput(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: String, Id: String): typings.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput]
    }
    
    inline def PutBucketCorsInput(Bucket: String, CORSConfiguration: CORSConfiguration): typings.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CORSConfiguration = CORSConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput]
    }
    
    inline def PutBucketEncryptionInput(Bucket: String, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): typings.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput]
    }
    
    inline def PutBucketInventoryConfigurationInput(Bucket: String, Id: String, InventoryConfiguration: InventoryConfiguration): typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InventoryConfiguration = InventoryConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput]
    }
    
    inline def PutBucketLifecycleConfigurationInput(Bucket: String): typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput]
    }
    
    inline def PutBucketLifecycleInput(Bucket: String): typings.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput]
    }
    
    inline def PutBucketLoggingInput(Bucket: String, BucketLoggingStatus: BucketLoggingStatus): typings.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput]
    }
    
    inline def PutBucketMetricsConfigurationInput(Bucket: String, Id: String, MetricsConfiguration: MetricsConfiguration): typings.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput]
    }
    
    inline def PutBucketNotificationConfigurationInput(Bucket: String, NotificationConfiguration: NotificationConfiguration): typings.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput]
    }
    
    inline def PutBucketNotificationInput(Bucket: String, NotificationConfiguration: NotificationConfigurationDeprecated): typings.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput]
    }
    
    inline def PutBucketPolicyInput(Bucket: String, Policy: String): typings.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput]
    }
    
    inline def PutBucketReplicationInput(Bucket: String, ReplicationConfiguration: ReplicationConfiguration): typings.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ReplicationConfiguration = ReplicationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput]
    }
    
    inline def PutBucketRequestPaymentInput(Bucket: String, RequestPaymentConfiguration: RequestPaymentConfiguration): typings.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput]
    }
    
    inline def PutBucketTaggingInput(Bucket: String, Tagging: Tagging): typings.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput]
    }
    
    inline def PutBucketVersioningInput(Bucket: String, VersioningConfiguration: VersioningConfiguration): typings.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput]
    }
    
    inline def PutBucketWebsiteInput(Bucket: String, WebsiteConfiguration: WebsiteConfiguration): typings.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput]
    }
    
    inline def PutObjectAclInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput]
    }
    
    inline def PutObjectTaggingInput(Bucket: String, Key: String, Tagging: Tagging): typings.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput]
    }
    
    inline def RestoreObjectInput(Bucket: String, Key: String): typings.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput]
    }
    
    inline def SelectObjectContentInput(
      Bucket: String,
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: InputSerialization,
      Key: String,
      OutputSerialization: OutputSerialization
    ): typings.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput]
    }
    
    inline def UploadPartCopyInput(Bucket: String, CopySource: String, Key: String, PartNumber: Double, UploadId: String): typings.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput]
    }
  }
}
