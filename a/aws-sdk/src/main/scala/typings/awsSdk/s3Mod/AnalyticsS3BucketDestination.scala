package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsS3BucketDestination extends StObject {
  
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
  implicit class AnalyticsS3BucketDestinationMutableBuilder[Self <: AnalyticsS3BucketDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketAccountId(value: AccountId): Self = StObject.set(x, "BucketAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketAccountIdUndefined: Self = StObject.set(x, "BucketAccountId", js.undefined)
    
    @scala.inline
    def setFormat(value: AnalyticsS3ExportFileFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
