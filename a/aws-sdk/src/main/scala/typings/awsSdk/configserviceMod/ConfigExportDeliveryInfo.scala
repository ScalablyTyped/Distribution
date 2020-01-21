package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigExportDeliveryInfo extends js.Object {
  /**
    * The time of the last attempted delivery.
    */
  var lastAttemptTime: js.UndefOr[Date] = js.native
  /**
    * The error code from the last attempted delivery.
    */
  var lastErrorCode: js.UndefOr[String] = js.native
  /**
    * The error message from the last attempted delivery.
    */
  var lastErrorMessage: js.UndefOr[String] = js.native
  /**
    * Status of the last attempted delivery.
    */
  var lastStatus: js.UndefOr[DeliveryStatus] = js.native
  /**
    * The time of the last successful delivery.
    */
  var lastSuccessfulTime: js.UndefOr[Date] = js.native
  /**
    * The time that the next delivery occurs.
    */
  var nextDeliveryTime: js.UndefOr[Date] = js.native
}

object ConfigExportDeliveryInfo {
  @scala.inline
  def apply(
    lastAttemptTime: Date = null,
    lastErrorCode: String = null,
    lastErrorMessage: String = null,
    lastStatus: DeliveryStatus = null,
    lastSuccessfulTime: Date = null,
    nextDeliveryTime: Date = null
  ): ConfigExportDeliveryInfo = {
    val __obj = js.Dynamic.literal()
    if (lastAttemptTime != null) __obj.updateDynamic("lastAttemptTime")(lastAttemptTime.asInstanceOf[js.Any])
    if (lastErrorCode != null) __obj.updateDynamic("lastErrorCode")(lastErrorCode.asInstanceOf[js.Any])
    if (lastErrorMessage != null) __obj.updateDynamic("lastErrorMessage")(lastErrorMessage.asInstanceOf[js.Any])
    if (lastStatus != null) __obj.updateDynamic("lastStatus")(lastStatus.asInstanceOf[js.Any])
    if (lastSuccessfulTime != null) __obj.updateDynamic("lastSuccessfulTime")(lastSuccessfulTime.asInstanceOf[js.Any])
    if (nextDeliveryTime != null) __obj.updateDynamic("nextDeliveryTime")(nextDeliveryTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigExportDeliveryInfo]
  }
}

