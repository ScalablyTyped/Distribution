package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logging extends js.Object {
  /**
    * The S3 logging configuration.
    */
  var s3Logs: js.UndefOr[S3Logs] = js.native
}

object Logging {
  @scala.inline
  def apply(s3Logs: S3Logs = null): Logging = {
    val __obj = js.Dynamic.literal()
    if (s3Logs != null) __obj.updateDynamic("s3Logs")(s3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logging]
  }
}

