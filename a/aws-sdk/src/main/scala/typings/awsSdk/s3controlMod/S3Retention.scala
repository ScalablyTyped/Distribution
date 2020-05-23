package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Retention extends js.Object {
  /**
    * The Retention mode to be applied to all objects in the Batch Operations job.
    */
  var Mode: js.UndefOr[S3ObjectLockRetentionMode] = js.native
  /**
    * The date when the applied Object Retention will expire on all objects in the Batch Operations job.
    */
  var RetainUntilDate: js.UndefOr[TimeStamp] = js.native
}

object S3Retention {
  @scala.inline
  def apply(Mode: S3ObjectLockRetentionMode = null, RetainUntilDate: TimeStamp = null): S3Retention = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (RetainUntilDate != null) __obj.updateDynamic("RetainUntilDate")(RetainUntilDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Retention]
  }
}

