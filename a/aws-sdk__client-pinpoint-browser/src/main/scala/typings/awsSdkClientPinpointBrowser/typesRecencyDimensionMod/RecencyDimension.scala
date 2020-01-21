package typings.awsSdkClientPinpointBrowser.typesRecencyDimensionMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ACTIVE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAY_14
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAY_30
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAY_7
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.HR_24
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INACTIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecencyDimension extends js.Object {
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

object RecencyDimension {
  @scala.inline
  def apply(
    Duration: HR_24 | DAY_7 | DAY_14 | DAY_30 | String = null,
    RecencyType: ACTIVE | INACTIVE | String = null
  ): RecencyDimension = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (RecencyType != null) __obj.updateDynamic("RecencyType")(RecencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecencyDimension]
  }
}

