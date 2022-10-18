package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput
import typings.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
    - typings.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
    - typings.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput
    - typings.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput
    - typings.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput
    - typings.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput
    - typings.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput
    - typings.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput
    - typings.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput
    - typings.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
    - typings.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput
    - typings.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
    - typings.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput
    - typings.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
    - typings.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
    - typings.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
    - typings.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
    - typings.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput
    - typings.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput
    - typings.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
    - typings.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
    - typings.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
    - typings.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
    - typings.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
    - typings.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
    - typings.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
    - typings.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
    - typings.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput
    - typings.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput[typings.node.streamMod.Readable]
    - typings.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput
    - typings.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
    - typings.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput[typings.node.streamMod.Readable]
    - typings.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput
    - typings.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput
    - typings.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
    - typings.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
    - typings.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
    - typings.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput
    - typings.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
    - typings.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
    - typings.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput
    - typings.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output
    - typings.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput
    - typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
    - typings.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput
    - typings.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
    - typings.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput
    - typings.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
    - typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
    - typings.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
    - typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
    - typings.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
    - typings.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput
    - typings.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
    - typings.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
    - typings.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
    - typings.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
    - typings.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
    - typings.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
    - typings.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
    - typings.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
    - typings.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput
    - typings.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput
    - typings.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
    - typings.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput
    - typings.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput
    - typings.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput
    - typings.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput
  */
  type OutputTypesUnion = _OutputTypesUnion | GetObjectOutput[Readable] | GetObjectTorrentOutput[Readable]
  
  trait _OutputTypesUnion extends StObject
  object _OutputTypesUnion {
    
    inline def AbortMultipartUploadOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput]
    }
    
    inline def CompleteMultipartUploadOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput]
    }
    
    inline def CopyObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput]
    }
    
    inline def CreateBucketOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput]
    }
    
    inline def CreateMultipartUploadOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput]
    }
    
    inline def DeleteBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput]
    }
    
    inline def DeleteBucketCorsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput]
    }
    
    inline def DeleteBucketEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput]
    }
    
    inline def DeleteBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput]
    }
    
    inline def DeleteBucketLifecycleOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput]
    }
    
    inline def DeleteBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput]
    }
    
    inline def DeleteBucketOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput]
    }
    
    inline def DeleteBucketPolicyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput]
    }
    
    inline def DeleteBucketReplicationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput]
    }
    
    inline def DeleteBucketTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput]
    }
    
    inline def DeleteBucketWebsiteOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput]
    }
    
    inline def DeleteObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput]
    }
    
    inline def DeleteObjectTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput]
    }
    
    inline def DeleteObjectsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput]
    }
    
    inline def GetBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput]
    }
    
    inline def GetBucketAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput]
    }
    
    inline def GetBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput]
    }
    
    inline def GetBucketCorsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput]
    }
    
    inline def GetBucketEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput]
    }
    
    inline def GetBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput]
    }
    
    inline def GetBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput]
    }
    
    inline def GetBucketLifecycleOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput]
    }
    
    inline def GetBucketLocationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput]
    }
    
    inline def GetBucketLoggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput]
    }
    
    inline def GetBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput]
    }
    
    inline def GetBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput]
    }
    
    inline def GetBucketNotificationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput]
    }
    
    inline def GetBucketPolicyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput]
    }
    
    inline def GetBucketReplicationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput]
    }
    
    inline def GetBucketRequestPaymentOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput]
    }
    
    inline def GetBucketTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typings.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput]
    }
    
    inline def GetBucketVersioningOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput]
    }
    
    inline def GetBucketWebsiteOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput]
    }
    
    inline def GetObjectAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput]
    }
    
    inline def GetObjectTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typings.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput]
    }
    
    inline def HeadBucketOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput]
    }
    
    inline def HeadObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput]
    }
    
    inline def ListBucketAnalyticsConfigurationsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput]
    }
    
    inline def ListBucketInventoryConfigurationsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput]
    }
    
    inline def ListBucketMetricsConfigurationsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput]
    }
    
    inline def ListBucketsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput]
    }
    
    inline def ListMultipartUploadsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput]
    }
    
    inline def ListObjectVersionsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput]
    }
    
    inline def ListObjectsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput]
    }
    
    inline def ListObjectsV2Output($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output]
    }
    
    inline def ListPartsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput]
    }
    
    inline def PutBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput]
    }
    
    inline def PutBucketAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput]
    }
    
    inline def PutBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput]
    }
    
    inline def PutBucketCorsOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput]
    }
    
    inline def PutBucketEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput]
    }
    
    inline def PutBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput]
    }
    
    inline def PutBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput]
    }
    
    inline def PutBucketLifecycleOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput]
    }
    
    inline def PutBucketLoggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput]
    }
    
    inline def PutBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput]
    }
    
    inline def PutBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput]
    }
    
    inline def PutBucketNotificationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput]
    }
    
    inline def PutBucketPolicyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput]
    }
    
    inline def PutBucketReplicationOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput]
    }
    
    inline def PutBucketRequestPaymentOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput]
    }
    
    inline def PutBucketTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput]
    }
    
    inline def PutBucketVersioningOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput]
    }
    
    inline def PutBucketWebsiteOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput]
    }
    
    inline def PutObjectAclOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput]
    }
    
    inline def PutObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput]
    }
    
    inline def PutObjectTaggingOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput]
    }
    
    inline def RestoreObjectOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput]
    }
    
    inline def SelectObjectContentOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput]
    }
    
    inline def UploadPartCopyOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput]
    }
    
    inline def UploadPartOutput($metadata: ResponseMetadata): typings.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput]
    }
  }
}
