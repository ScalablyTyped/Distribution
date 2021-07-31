package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncS3Destination extends StObject {
  
  /**
    * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same Region as the destination S3 bucket.
    */
  var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN] = js.undefined
  
  /**
    * The name of the S3 bucket where the aggregated data is stored.
    */
  var BucketName: ResourceDataSyncS3BucketName
  
  /**
    * Enables destination data sharing. By default, this field is null.
    */
  var DestinationDataSharing: js.UndefOr[ResourceDataSyncDestinationDataSharing] = js.undefined
  
  /**
    * An Amazon S3 prefix for the bucket.
    */
  var Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.undefined
  
  /**
    * The AWS Region with the S3 bucket targeted by the Resource Data Sync.
    */
  var Region: ResourceDataSyncS3Region
  
  /**
    * A supported sync format. The following format is currently supported: JsonSerDe
    */
  var SyncFormat: ResourceDataSyncS3Format
}
object ResourceDataSyncS3Destination {
  
  @scala.inline
  def apply(
    BucketName: ResourceDataSyncS3BucketName,
    Region: ResourceDataSyncS3Region,
    SyncFormat: ResourceDataSyncS3Format
  ): ResourceDataSyncS3Destination = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], SyncFormat = SyncFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncS3Destination]
  }
  
  @scala.inline
  implicit class ResourceDataSyncS3DestinationMutableBuilder[Self <: ResourceDataSyncS3Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAWSKMSKeyARN(value: ResourceDataSyncAWSKMSKeyARN): Self = StObject.set(x, "AWSKMSKeyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWSKMSKeyARNUndefined: Self = StObject.set(x, "AWSKMSKeyARN", js.undefined)
    
    @scala.inline
    def setBucketName(value: ResourceDataSyncS3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDataSharing(value: ResourceDataSyncDestinationDataSharing): Self = StObject.set(x, "DestinationDataSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDataSharingUndefined: Self = StObject.set(x, "DestinationDataSharing", js.undefined)
    
    @scala.inline
    def setPrefix(value: ResourceDataSyncS3Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setRegion(value: ResourceDataSyncS3Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncFormat(value: ResourceDataSyncS3Format): Self = StObject.set(x, "SyncFormat", value.asInstanceOf[js.Any])
  }
}
