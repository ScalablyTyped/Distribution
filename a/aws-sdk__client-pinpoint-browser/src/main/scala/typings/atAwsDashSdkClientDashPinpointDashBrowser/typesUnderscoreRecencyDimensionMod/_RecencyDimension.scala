package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreRecencyDimensionMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ACTIVE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DAY_14
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DAY_30
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DAY_7
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.HR_24
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.INACTIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RecencyDimension extends js.Object {
  /**
    * The length of time during which users have been active or inactive with your app.
    *
    * Valid values: HR_24, DAY_7, DAY_14, DAY_30
    */
  var Duration: js.UndefOr[HR_24 | DAY_7 | DAY_14 | DAY_30 | String] = js.undefined
  /**
    * The recency dimension type:
    *
    * ACTIVE - Users who have used your app within the specified duration are included in the segment.
    *
    * INACTIVE - Users who have not used your app within the specified duration are included in the segment.
    */
  var RecencyType: js.UndefOr[ACTIVE | INACTIVE | String] = js.undefined
}

object _RecencyDimension {
  @scala.inline
  def apply(
    Duration: HR_24 | DAY_7 | DAY_14 | DAY_30 | String = null,
    RecencyType: ACTIVE | INACTIVE | String = null
  ): _RecencyDimension = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (RecencyType != null) __obj.updateDynamic("RecencyType")(RecencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RecencyDimension]
  }
}

