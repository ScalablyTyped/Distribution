package typings.awsSdkClientS3Browser.typesProgressEventMod

import typings.awsSdkClientS3Browser.typesProgressMod.Progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends js.Object {
  /**
    * <p>The Progress event details.</p>
    */
  var Details: js.UndefOr[Progress] = js.undefined
}

object ProgressEvent {
  @scala.inline
  def apply(Details: Progress = null): ProgressEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
}

