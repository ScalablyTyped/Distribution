package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreProgressEventMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreProgressMod._UnmarshalledProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledProgressEvent extends _ProgressEvent {
  /**
    * <p>The Progress event details.</p>
    */
  @JSName("Details")
  var Details__UnmarshalledProgressEvent: js.UndefOr[_UnmarshalledProgress] = js.undefined
}

object _UnmarshalledProgressEvent {
  @scala.inline
  def apply(Details: _UnmarshalledProgress = null): _UnmarshalledProgressEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details)
    __obj.asInstanceOf[_UnmarshalledProgressEvent]
  }
}

