package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDownloadAuthorizationOpts extends CommonArgs {
  var b2ContentDisposition: String
  var bucketId: String
  var fileNamePrefix: String
  /**
    * Authorization validity : 0 to 604800
    */
  var validDurationInSeconds: Double
}

object GetDownloadAuthorizationOpts {
  @scala.inline
  def apply(
    b2ContentDisposition: String,
    bucketId: String,
    fileNamePrefix: String,
    validDurationInSeconds: Double,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null
  ): GetDownloadAuthorizationOpts = {
    val __obj = js.Dynamic.literal(b2ContentDisposition = b2ContentDisposition.asInstanceOf[js.Any], bucketId = bucketId.asInstanceOf[js.Any], fileNamePrefix = fileNamePrefix.asInstanceOf[js.Any], validDurationInSeconds = validDurationInSeconds.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDownloadAuthorizationOpts]
  }
}

