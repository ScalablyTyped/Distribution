package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketAnalyticsConfigurationRequest extends js.Object {
  /**
    * The name of the bucket from which an analytics configuration is deleted.
    */
  var Bucket: BucketName = js.native
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId = js.native
}

object DeleteBucketAnalyticsConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: AnalyticsId): DeleteBucketAnalyticsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketAnalyticsConfigurationRequest]
  }
}

