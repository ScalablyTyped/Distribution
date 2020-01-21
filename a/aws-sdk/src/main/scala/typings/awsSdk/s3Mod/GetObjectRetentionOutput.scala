package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectRetentionOutput extends js.Object {
  /**
    * The container element for an object's retention settings.
    */
  var Retention: js.UndefOr[ObjectLockRetention] = js.native
}

object GetObjectRetentionOutput {
  @scala.inline
  def apply(Retention: ObjectLockRetention = null): GetObjectRetentionOutput = {
    val __obj = js.Dynamic.literal()
    if (Retention != null) __obj.updateDynamic("Retention")(Retention.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectRetentionOutput]
  }
}

