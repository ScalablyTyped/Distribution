package typings.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod

import typings.awsSdkClientPinpointBrowser.typesRecencyDimensionMod.RecencyDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentBehaviors extends js.Object {
  /**
    * The recency of use.
    */
  var Recency: js.UndefOr[RecencyDimension] = js.undefined
}

object SegmentBehaviors {
  @scala.inline
  def apply(Recency: RecencyDimension = null): SegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    if (Recency != null) __obj.updateDynamic("Recency")(Recency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentBehaviors]
  }
}

