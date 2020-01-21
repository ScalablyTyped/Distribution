package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MFAOptionType extends js.Object {
  /**
    * The attribute name of the MFA option type. The only valid value is phone_number.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.native
  /**
    * The delivery medium to send the MFA code. You can use this parameter to set only the SMS delivery medium value.
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.native
}

object MFAOptionType {
  @scala.inline
  def apply(AttributeName: AttributeNameType = null, DeliveryMedium: DeliveryMediumType = null): MFAOptionType = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (DeliveryMedium != null) __obj.updateDynamic("DeliveryMedium")(DeliveryMedium.asInstanceOf[js.Any])
    __obj.asInstanceOf[MFAOptionType]
  }
}

