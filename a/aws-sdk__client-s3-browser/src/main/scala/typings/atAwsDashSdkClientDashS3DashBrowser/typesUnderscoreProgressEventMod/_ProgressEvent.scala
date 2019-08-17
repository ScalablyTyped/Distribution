package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreProgressEventMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreProgressMod._Progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ProgressEvent extends js.Object {
  /**
    * <p>The Progress event details.</p>
    */
  var Details: js.UndefOr[_Progress] = js.undefined
}

object _ProgressEvent {
  @scala.inline
  def apply(Details: _Progress = null): _ProgressEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details)
    __obj.asInstanceOf[_ProgressEvent]
  }
}

