package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboxPlacementTrackingOption extends js.Object {
  /**
    * Specifies whether inbox placement data is being tracked for the domain.
    */
  var Global: js.UndefOr[Enabled] = js.native
  /**
    * An array of strings, one for each major email provider that the inbox placement data applies to.
    */
  var TrackedIsps: js.UndefOr[IspNameList] = js.native
}

object InboxPlacementTrackingOption {
  @scala.inline
  def apply(): InboxPlacementTrackingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboxPlacementTrackingOption]
  }
  @scala.inline
  implicit class InboxPlacementTrackingOptionOps[Self <: InboxPlacementTrackingOption] (val x: Self) extends AnyVal {
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
    def setGlobal(value: Enabled): Self = this.set("Global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("Global", js.undefined)
    @scala.inline
    def setTrackedIspsVarargs(value: IspName*): Self = this.set("TrackedIsps", js.Array(value :_*))
    @scala.inline
    def setTrackedIsps(value: IspNameList): Self = this.set("TrackedIsps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackedIsps: Self = this.set("TrackedIsps", js.undefined)
  }
  
}

