package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEvent extends js.Object {
  /**
    * The Progress event details.
    */
  var Details: js.UndefOr[Progress] = js.native
}

object ProgressEvent {
  @scala.inline
  def apply(Details: Progress = null): ProgressEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
}

