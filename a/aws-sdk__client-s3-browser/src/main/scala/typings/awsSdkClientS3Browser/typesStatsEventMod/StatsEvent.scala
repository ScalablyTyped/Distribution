package typings.awsSdkClientS3Browser.typesStatsEventMod

import typings.awsSdkClientS3Browser.typesStatsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsEvent extends js.Object {
  /**
    * <p>The Stats event details.</p>
    */
  var Details: js.UndefOr[Stats] = js.native
}

object StatsEvent {
  @scala.inline
  def apply(): StatsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsEvent]
  }
  @scala.inline
  implicit class StatsEventOps[Self <: StatsEvent] (val x: Self) extends AnyVal {
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
    def setDetails(value: Stats): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
  }
  
}

