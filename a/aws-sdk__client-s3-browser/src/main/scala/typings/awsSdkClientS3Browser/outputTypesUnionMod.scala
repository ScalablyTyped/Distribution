package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput
import typings.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
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
    
    @scala.inline
    def AbortMultipartUploadOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput]
    }
    
    @scala.inline
    def CompleteMultipartUploadOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput]
    }
    
    @scala.inline
    def CopyObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput]
    }
    
    @scala.inline
    def CreateBucketOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput]
    }
    
    @scala.inline
    def CreateMultipartUploadOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput]
    }
    
    @scala.inline
    def DeleteBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    def DeleteBucketCorsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput]
    }
    
    @scala.inline
    def DeleteBucketEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput]
    }
    
    @scala.inline
    def DeleteBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    def DeleteBucketLifecycleOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput]
    }
    
    @scala.inline
    def DeleteBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    def DeleteBucketOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput]
    }
    
    @scala.inline
    def DeleteBucketPolicyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput]
    }
    
    @scala.inline
    def DeleteBucketReplicationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput]
    }
    
    @scala.inline
    def DeleteBucketTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput]
    }
    
    @scala.inline
    def DeleteBucketWebsiteOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput]
    }
    
    @scala.inline
    def DeleteObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput]
    }
    
    @scala.inline
    def DeleteObjectTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput]
    }
    
    @scala.inline
    def DeleteObjectsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput]
    }
    
    @scala.inline
    def GetBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput]
    }
    
    @scala.inline
    def GetBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketCorsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput]
    }
    
    @scala.inline
    def GetBucketEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput]
    }
    
    @scala.inline
    def GetBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketLifecycleOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput]
    }
    
    @scala.inline
    def GetBucketLocationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput]
    }
    
    @scala.inline
    def GetBucketLoggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput]
    }
    
    @scala.inline
    def GetBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketNotificationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput]
    }
    
    @scala.inline
    def GetBucketPolicyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput]
    }
    
    @scala.inline
    def GetBucketReplicationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput]
    }
    
    @scala.inline
    def GetBucketRequestPaymentOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput]
    }
    
    @scala.inline
    def GetBucketTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typings.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput]
    }
    
    @scala.inline
    def GetBucketVersioningOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput]
    }
    
    @scala.inline
    def GetBucketWebsiteOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput]
    }
    
    @scala.inline
    def GetObjectAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput]
    }
    
    @scala.inline
    def GetObjectTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typings.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput]
    }
    
    @scala.inline
    def HeadBucketOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput]
    }
    
    @scala.inline
    def HeadObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput]
    }
    
    @scala.inline
    def ListBucketAnalyticsConfigurationsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput]
    }
    
    @scala.inline
    def ListBucketInventoryConfigurationsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput]
    }
    
    @scala.inline
    def ListBucketMetricsConfigurationsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput]
    }
    
    @scala.inline
    def ListBucketsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput]
    }
    
    @scala.inline
    def ListMultipartUploadsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput]
    }
    
    @scala.inline
    def ListObjectVersionsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput]
    }
    
    @scala.inline
    def ListObjectsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput]
    }
    
    @scala.inline
    def ListObjectsV2Output($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output]
    }
    
    @scala.inline
    def ListPartsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput]
    }
    
    @scala.inline
    def PutBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput]
    }
    
    @scala.inline
    def PutBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketCorsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput]
    }
    
    @scala.inline
    def PutBucketEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput]
    }
    
    @scala.inline
    def PutBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketLifecycleOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput]
    }
    
    @scala.inline
    def PutBucketLoggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput]
    }
    
    @scala.inline
    def PutBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketNotificationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput]
    }
    
    @scala.inline
    def PutBucketPolicyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput]
    }
    
    @scala.inline
    def PutBucketReplicationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput]
    }
    
    @scala.inline
    def PutBucketRequestPaymentOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput]
    }
    
    @scala.inline
    def PutBucketTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput]
    }
    
    @scala.inline
    def PutBucketVersioningOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput]
    }
    
    @scala.inline
    def PutBucketWebsiteOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput]
    }
    
    @scala.inline
    def PutObjectAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput]
    }
    
    @scala.inline
    def PutObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput]
    }
    
    @scala.inline
    def PutObjectTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput]
    }
    
    @scala.inline
    def RestoreObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput]
    }
    
    @scala.inline
    def SelectObjectContentOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput]
    }
    
    @scala.inline
    def UploadPartCopyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput]
    }
    
    @scala.inline
    def UploadPartOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput]
    }
  }
}
