package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketAnalyticsConfigurationRequest extends js.Object {
  /**
    * The configuration and any analyses for the analytics filter.
    */
  var AnalyticsConfiguration: typings.awsSdk.s3Mod.AnalyticsConfiguration = js.native
  /**
    * The name of the bucket to which an analytics configuration is stored.
    */
  var Bucket: BucketName = js.native
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId = js.native
}

object PutBucketAnalyticsConfigurationRequest {
  @scala.inline
  def apply(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: BucketName, Id: AnalyticsId): PutBucketAnalyticsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketAnalyticsConfigurationRequest]
  }
}

