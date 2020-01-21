package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLockRetention extends js.Object {
  /**
    * Indicates the Retention mode for the specified object.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  /**
    * The date on which this Object Lock Retention will expire.
    */
  var RetainUntilDate: js.UndefOr[Date] = js.native
}

object ObjectLockRetention {
  @scala.inline
  def apply(Mode: ObjectLockRetentionMode = null, RetainUntilDate: Date = null): ObjectLockRetention = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (RetainUntilDate != null) __obj.updateDynamic("RetainUntilDate")(RetainUntilDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLockRetention]
  }
}

