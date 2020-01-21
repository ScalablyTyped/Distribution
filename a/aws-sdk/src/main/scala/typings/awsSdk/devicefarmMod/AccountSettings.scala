package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountSettings extends js.Object {
  /**
    * The AWS account number specified in the AccountSettings container.
    */
  var awsAccountNumber: js.UndefOr[AWSAccountNumber] = js.native
  /**
    * The default number of minutes (at the account level) a test run executes before it times out. The default value is 150 minutes.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * The maximum number of minutes a test run executes before it times out.
    */
  var maxJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * The maximum number of device slots that the AWS account can purchase. Each maximum is expressed as an offering-id:number pair, where the offering-id represents one of the IDs returned by the ListOfferings command.
    */
  var maxSlots: js.UndefOr[MaxSlotMap] = js.native
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  /**
    * Information about an AWS account's usage of free trial device minutes.
    */
  var trialMinutes: js.UndefOr[TrialMinutes] = js.native
  /**
    * Returns the unmetered devices you have purchased or want to purchase.
    */
  var unmeteredDevices: js.UndefOr[PurchasedDevicesMap] = js.native
  /**
    * Returns the unmetered remote access devices you have purchased or want to purchase.
    */
  var unmeteredRemoteAccessDevices: js.UndefOr[PurchasedDevicesMap] = js.native
}

object AccountSettings {
  @scala.inline
  def apply(
    awsAccountNumber: AWSAccountNumber = null,
    defaultJobTimeoutMinutes: Int | scala.Double = null,
    maxJobTimeoutMinutes: Int | scala.Double = null,
    maxSlots: MaxSlotMap = null,
    skipAppResign: js.UndefOr[scala.Boolean] = js.undefined,
    trialMinutes: TrialMinutes = null,
    unmeteredDevices: PurchasedDevicesMap = null,
    unmeteredRemoteAccessDevices: PurchasedDevicesMap = null
  ): AccountSettings = {
    val __obj = js.Dynamic.literal()
    if (awsAccountNumber != null) __obj.updateDynamic("awsAccountNumber")(awsAccountNumber.asInstanceOf[js.Any])
    if (defaultJobTimeoutMinutes != null) __obj.updateDynamic("defaultJobTimeoutMinutes")(defaultJobTimeoutMinutes.asInstanceOf[js.Any])
    if (maxJobTimeoutMinutes != null) __obj.updateDynamic("maxJobTimeoutMinutes")(maxJobTimeoutMinutes.asInstanceOf[js.Any])
    if (maxSlots != null) __obj.updateDynamic("maxSlots")(maxSlots.asInstanceOf[js.Any])
    if (!js.isUndefined(skipAppResign)) __obj.updateDynamic("skipAppResign")(skipAppResign.asInstanceOf[js.Any])
    if (trialMinutes != null) __obj.updateDynamic("trialMinutes")(trialMinutes.asInstanceOf[js.Any])
    if (unmeteredDevices != null) __obj.updateDynamic("unmeteredDevices")(unmeteredDevices.asInstanceOf[js.Any])
    if (unmeteredRemoteAccessDevices != null) __obj.updateDynamic("unmeteredRemoteAccessDevices")(unmeteredRemoteAccessDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountSettings]
  }
}

