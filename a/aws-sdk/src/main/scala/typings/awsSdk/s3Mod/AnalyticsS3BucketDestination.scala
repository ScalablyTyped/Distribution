package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsS3BucketDestination extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the bucket to which data is exported.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated before exporting data.   Although this value is optional, we strongly recommend that you set it to help prevent problems if the destination bucket ownership changes.  
    */
  var BucketAccountId: js.UndefOr[AccountId] = js.native
  
  /**
    * Specifies the file format used when exporting data to Amazon S3.
    */
  var Format: AnalyticsS3ExportFileFormat = js.native
  
  /**
    * The prefix to use when exporting data. The prefix is prepended to all results.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
}
object AnalyticsS3BucketDestination {
  
  @scala.inline
  def apply(Bucket: BucketName, Format: AnalyticsS3ExportFileFormat): AnalyticsS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsS3BucketDestination]
  }
  
  @scala.inline
  implicit class AnalyticsS3BucketDestinationOps[Self <: AnalyticsS3BucketDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: AnalyticsS3ExportFileFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketAccountId(value: AccountId): Self = this.set("BucketAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketAccountId: Self = this.set("BucketAccountId", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
}
