package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsJobPresignedUrlConfig extends js.Object {
  /**
    * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800 seconds. Pre-signed URLs are generated when a request for the job document is received.
    */
  var expiresInSec: js.UndefOr[ExpiresInSeconds] = js.native
}

object AwsJobPresignedUrlConfig {
  @scala.inline
  def apply(expiresInSec: Int | Double = null): AwsJobPresignedUrlConfig = {
    val __obj = js.Dynamic.literal()
    if (expiresInSec != null) __obj.updateDynamic("expiresInSec")(expiresInSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobPresignedUrlConfig]
  }
}

