package typings.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod

import typings.awsSdkClientPinpointBrowser.typesRecencyDimensionMod.UnmarshalledRecencyDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSegmentBehaviors extends SegmentBehaviors {
  /**
    * The recency of use.
    */
  @JSName("Recency")
  var Recency_UnmarshalledSegmentBehaviors: js.UndefOr[UnmarshalledRecencyDimension] = js.undefined
}

object UnmarshalledSegmentBehaviors {
  @scala.inline
  def apply(Recency: UnmarshalledRecencyDimension = null): UnmarshalledSegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    if (Recency != null) __obj.updateDynamic("Recency")(Recency.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSegmentBehaviors]
  }
}

