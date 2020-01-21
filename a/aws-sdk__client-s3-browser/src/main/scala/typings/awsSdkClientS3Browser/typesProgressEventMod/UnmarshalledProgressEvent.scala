package typings.awsSdkClientS3Browser.typesProgressEventMod

import typings.awsSdkClientS3Browser.typesProgressMod.UnmarshalledProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledProgressEvent extends ProgressEvent {
  /**
    * <p>The Progress event details.</p>
    */
  @JSName("Details")
  var Details_UnmarshalledProgressEvent: js.UndefOr[UnmarshalledProgress] = js.undefined
}

object UnmarshalledProgressEvent {
  @scala.inline
  def apply(Details: UnmarshalledProgress = null): UnmarshalledProgressEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledProgressEvent]
  }
}

