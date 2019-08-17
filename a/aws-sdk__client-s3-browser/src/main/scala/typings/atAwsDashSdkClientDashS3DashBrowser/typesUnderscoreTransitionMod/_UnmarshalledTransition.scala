package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTransitionMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.GLACIER
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.STANDARD_IA
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledTransition extends _Transition {
  /**
    * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
    */
  @JSName("Date")
  var Date__UnmarshalledTransition: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledTransition {
  @scala.inline
  def apply(
    Date: Date = null,
    Days: Int | Double = null,
    StorageClass: GLACIER | STANDARD_IA | ONEZONE_IA | String = null
  ): _UnmarshalledTransition = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (Days != null) __obj.updateDynamic("Days")(Days.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledTransition]
  }
}

