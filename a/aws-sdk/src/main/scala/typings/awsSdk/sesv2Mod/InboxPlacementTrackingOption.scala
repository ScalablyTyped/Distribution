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
  def apply(Global: js.UndefOr[Enabled] = js.undefined, TrackedIsps: IspNameList = null): InboxPlacementTrackingOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Global)) __obj.updateDynamic("Global")(Global.get.asInstanceOf[js.Any])
    if (TrackedIsps != null) __obj.updateDynamic("TrackedIsps")(TrackedIsps.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboxPlacementTrackingOption]
  }
}

