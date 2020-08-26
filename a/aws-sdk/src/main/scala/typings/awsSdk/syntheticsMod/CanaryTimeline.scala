package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryTimeline extends js.Object {
  /**
    * The date and time the canary was created.
    */
  var Created: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time the canary was most recently modified.
    */
  var LastModified: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time that the canary's most recent run started.
    */
  var LastStarted: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time that the canary's most recent run ended.
    */
  var LastStopped: js.UndefOr[Timestamp] = js.native
}

object CanaryTimeline {
  @scala.inline
  def apply(): CanaryTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryTimeline]
  }
  @scala.inline
  implicit class CanaryTimelineOps[Self <: CanaryTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated(value: Timestamp): Self = this.set("Created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    @scala.inline
    def setLastModified(value: Timestamp): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setLastStarted(value: Timestamp): Self = this.set("LastStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStarted: Self = this.set("LastStarted", js.undefined)
    @scala.inline
    def setLastStopped(value: Timestamp): Self = this.set("LastStopped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStopped: Self = this.set("LastStopped", js.undefined)
  }
  
}

