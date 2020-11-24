package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDataSyncS3Destination extends js.Object {
  
  /**
    * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same Region as the destination S3 bucket.
    */
  var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN] = js.native
  
  /**
    * The name of the S3 bucket where the aggregated data is stored.
    */
  var BucketName: ResourceDataSyncS3BucketName = js.native
  
  /**
    * Enables destination data sharing. By default, this field is null.
    */
  var DestinationDataSharing: js.UndefOr[ResourceDataSyncDestinationDataSharing] = js.native
  
  /**
    * An Amazon S3 prefix for the bucket.
    */
  var Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.native
  
  /**
    * The AWS Region with the S3 bucket targeted by the Resource Data Sync.
    */
  var Region: ResourceDataSyncS3Region = js.native
  
  /**
    * A supported sync format. The following format is currently supported: JsonSerDe
    */
  var SyncFormat: ResourceDataSyncS3Format = js.native
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
  implicit class ResourceDataSyncS3DestinationOps[Self <: ResourceDataSyncS3Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketName(value: ResourceDataSyncS3BucketName): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: ResourceDataSyncS3Region): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncFormat(value: ResourceDataSyncS3Format): Self = this.set("SyncFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWSKMSKeyARN(value: ResourceDataSyncAWSKMSKeyARN): Self = this.set("AWSKMSKeyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAWSKMSKeyARN: Self = this.set("AWSKMSKeyARN", js.undefined)
    
    @scala.inline
    def setDestinationDataSharing(value: ResourceDataSyncDestinationDataSharing): Self = this.set("DestinationDataSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationDataSharing: Self = this.set("DestinationDataSharing", js.undefined)
    
    @scala.inline
    def setPrefix(value: ResourceDataSyncS3Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
}
