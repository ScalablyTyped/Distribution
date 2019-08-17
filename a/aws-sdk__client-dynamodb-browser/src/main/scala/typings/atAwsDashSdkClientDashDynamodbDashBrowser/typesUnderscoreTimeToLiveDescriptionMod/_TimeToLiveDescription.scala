package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreTimeToLiveDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.DISABLED
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.DISABLING
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ENABLED
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ENABLING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TimeToLiveDescription extends js.Object {
  /**
    * <p> The name of the Time to Live attribute for items in the table.</p>
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  /**
    * <p> The Time to Live status for the table.</p>
    */
  var TimeToLiveStatus: js.UndefOr[ENABLING | DISABLING | ENABLED | DISABLED | String] = js.undefined
}

object _TimeToLiveDescription {
  @scala.inline
  def apply(
    AttributeName: String = null,
    TimeToLiveStatus: ENABLING | DISABLING | ENABLED | DISABLED | String = null
  ): _TimeToLiveDescription = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (TimeToLiveStatus != null) __obj.updateDynamic("TimeToLiveStatus")(TimeToLiveStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TimeToLiveDescription]
  }
}

