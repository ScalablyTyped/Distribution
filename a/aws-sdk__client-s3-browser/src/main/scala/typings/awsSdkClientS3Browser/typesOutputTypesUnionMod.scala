package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput
import typings.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
    - typings.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
    - typings.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput
    - typings.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput
    - typings.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput
    - typings.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput
    - typings.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput
    - typings.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput
    - typings.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput
    - typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
    - typings.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput
    - typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
    - typings.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput
    - typings.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
    - typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
    - typings.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
    - typings.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
    - typings.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput
    - typings.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput
    - typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
    - typings.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
    - typings.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
    - typings.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
    - typings.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
    - typings.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
    - typings.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
    - typings.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
    - typings.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput
    - typings.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput[typings.std.Blob]
    - typings.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput
    - typings.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
    - typings.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput[typings.std.Blob]
    - typings.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput
    - typings.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput
    - typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
    - typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
    - typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
    - typings.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput
    - typings.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
    - typings.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
    - typings.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput
    - typings.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output
    - typings.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput
    - typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
    - typings.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput
    - typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
    - typings.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput
    - typings.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
    - typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
    - typings.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
    - typings.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
    - typings.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
    - typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput
    - typings.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
    - typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
    - typings.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
    - typings.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
    - typings.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
    - typings.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
    - typings.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
    - typings.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
    - typings.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput
    - typings.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput
    - typings.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
    - typings.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput
    - typings.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput
    - typings.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput
    - typings.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput
  */
  type OutputTypesUnion = _OutputTypesUnion | GetObjectOutput[Blob] | GetObjectTorrentOutput[Blob]
  
  trait _OutputTypesUnion extends StObject
  object _OutputTypesUnion {
    
    inline def AbortMultipartUploadOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput]
    }
    
    inline def CompleteMultipartUploadOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput]
    }
    
    inline def CopyObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput]
    }
    
    inline def CreateBucketOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput]
    }
    
    inline def CreateMultipartUploadOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput]
    }
    
    inline def DeleteBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput]
    }
    
    inline def DeleteBucketCorsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput]
    }
    
    inline def DeleteBucketEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput]
    }
    
    inline def DeleteBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput]
    }
    
    inline def DeleteBucketLifecycleOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput]
    }
    
    inline def DeleteBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput]
    }
    
    inline def DeleteBucketOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput]
    }
    
    inline def DeleteBucketPolicyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput]
    }
    
    inline def DeleteBucketReplicationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput]
    }
    
    inline def DeleteBucketTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput]
    }
    
    inline def DeleteBucketWebsiteOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput]
    }
    
    inline def DeleteObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput]
    }
    
    inline def DeleteObjectTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput]
    }
    
    inline def DeleteObjectsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput]
    }
    
    inline def GetBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput]
    }
    
    inline def GetBucketAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput]
    }
    
    inline def GetBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput]
    }
    
    inline def GetBucketCorsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput]
    }
    
    inline def GetBucketEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput]
    }
    
    inline def GetBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput]
    }
    
    inline def GetBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput]
    }
    
    inline def GetBucketLifecycleOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput]
    }
    
    inline def GetBucketLocationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput]
    }
    
    inline def GetBucketLoggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput]
    }
    
    inline def GetBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput]
    }
    
    inline def GetBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput]
    }
    
    inline def GetBucketNotificationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput]
    }
    
    inline def GetBucketPolicyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput]
    }
    
    inline def GetBucketReplicationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput]
    }
    
    inline def GetBucketRequestPaymentOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput]
    }
    
    inline def GetBucketTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typings.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput]
    }
    
    inline def GetBucketVersioningOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput]
    }
    
    inline def GetBucketWebsiteOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput]
    }
    
    inline def GetObjectAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput]
    }
    
    inline def GetObjectTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typings.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput]
    }
    
    inline def HeadBucketOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput]
    }
    
    inline def HeadObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput]
    }
    
    inline def ListBucketAnalyticsConfigurationsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput]
    }
    
    inline def ListBucketInventoryConfigurationsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput]
    }
    
    inline def ListBucketMetricsConfigurationsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput]
    }
    
    inline def ListBucketsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput]
    }
    
    inline def ListMultipartUploadsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput]
    }
    
    inline def ListObjectVersionsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput]
    }
    
    inline def ListObjectsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput]
    }
    
    inline def ListObjectsV2Output($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output]
    }
    
    inline def ListPartsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput]
    }
    
    inline def PutBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput]
    }
    
    inline def PutBucketAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput]
    }
    
    inline def PutBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput]
    }
    
    inline def PutBucketCorsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput]
    }
    
    inline def PutBucketEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput]
    }
    
    inline def PutBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput]
    }
    
    inline def PutBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput]
    }
    
    inline def PutBucketLifecycleOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput]
    }
    
    inline def PutBucketLoggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput]
    }
    
    inline def PutBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput]
    }
    
    inline def PutBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput]
    }
    
    inline def PutBucketNotificationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput]
    }
    
    inline def PutBucketPolicyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput]
    }
    
    inline def PutBucketReplicationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput]
    }
    
    inline def PutBucketRequestPaymentOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput]
    }
    
    inline def PutBucketTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput]
    }
    
    inline def PutBucketVersioningOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput]
    }
    
    inline def PutBucketWebsiteOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput]
    }
    
    inline def PutObjectAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput]
    }
    
    inline def PutObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput]
    }
    
    inline def PutObjectTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput]
    }
    
    inline def RestoreObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput]
    }
    
    inline def SelectObjectContentOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput]
    }
    
    inline def UploadPartCopyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput]
    }
    
    inline def UploadPartOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput]
    }
  }
}
