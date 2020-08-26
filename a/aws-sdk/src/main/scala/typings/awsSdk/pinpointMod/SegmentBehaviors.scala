package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentBehaviors extends js.Object {
  /**
    * The dimension settings that are based on how recently an endpoint was active.
    */
  var Recency: js.UndefOr[RecencyDimension] = js.native
}

object SegmentBehaviors {
  @scala.inline
  def apply(): SegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentBehaviors]
  }
  @scala.inline
  implicit class SegmentBehaviorsOps[Self <: SegmentBehaviors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecency(value: RecencyDimension): Self = this.set("Recency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecency: Self = this.set("Recency", js.undefined)
  }
  
}

