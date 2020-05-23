package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPhoneConfig extends js.Object {
  /**
    * The After Call Work (ACW) timeout setting, in seconds.
    */
  var AfterContactWorkTimeLimit: js.UndefOr[typings.awsSdk.connectMod.AfterContactWorkTimeLimit] = js.native
  /**
    * The Auto accept setting.
    */
  var AutoAccept: js.UndefOr[typings.awsSdk.connectMod.AutoAccept] = js.native
  /**
    * The phone number for the user's desk phone.
    */
  var DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.native
  /**
    * The phone type.
    */
  var PhoneType: typings.awsSdk.connectMod.PhoneType = js.native
}

object UserPhoneConfig {
  @scala.inline
  def apply(
    PhoneType: PhoneType,
    AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit] = js.undefined,
    AutoAccept: js.UndefOr[AutoAccept] = js.undefined,
    DeskPhoneNumber: PhoneNumber = null
  ): UserPhoneConfig = {
    val __obj = js.Dynamic.literal(PhoneType = PhoneType.asInstanceOf[js.Any])
    if (!js.isUndefined(AfterContactWorkTimeLimit)) __obj.updateDynamic("AfterContactWorkTimeLimit")(AfterContactWorkTimeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoAccept)) __obj.updateDynamic("AutoAccept")(AutoAccept.get.asInstanceOf[js.Any])
    if (DeskPhoneNumber != null) __obj.updateDynamic("DeskPhoneNumber")(DeskPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPhoneConfig]
  }
}

