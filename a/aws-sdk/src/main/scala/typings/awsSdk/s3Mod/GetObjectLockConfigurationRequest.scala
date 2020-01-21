package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectLockConfigurationRequest extends js.Object {
  /**
    * The bucket whose Object Lock configuration you want to retrieve.
    */
  var Bucket: BucketName = js.native
}

object GetObjectLockConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetObjectLockConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetObjectLockConfigurationRequest]
  }
}

